package com.siriusgg.oot.view;

import com.siriusgg.oot.model.*;
import com.siriusgg.oot.controller.LoadSeedController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.TimerTask;

public class LoadSeedDialog extends JDialog {
    private final LoadSeedController lsc;
    private final JList<String> seeds;

    public LoadSeedDialog(final LoadSeedController lsc, final String title) {
        super(lsc.getMainMenuController().getFrame(), title, true);
        Translation t = GlobalSettings.getInstance().getTranslation();
        this.lsc = lsc;
        Container cp = getContentPane();
        setLayout(null);
        cp.setBackground(Color.WHITE);
        int borderSpacer = 5;
        int listWidth = 260;
        int listHeight = 400;
        seeds = new JList<>();
        DefaultListModel<String> listModel = new DefaultListModel<>();
        JScrollPane listScrollPane = new JScrollPane(seeds);
        seeds.setModel(listModel);
        listScrollPane.setBounds(borderSpacer, borderSpacer, listWidth, listHeight);
        lsc.fillSeedsList(listModel);
        if (listModel.getSize() >= 1) {
            seeds.setSelectedIndex(0);
        } else {
            throw new IllegalStateException("This Dialog should never open, because there are no saved seeds.");
        }
        seeds.addKeyListener(createCustomKeyListener());
        seeds.addMouseListener(createCustomMouseListener());
        cp.add(listScrollPane);
        int verticalElementSpacer = 5;
        int buttonHeight = 30;
        JButton buttonConfirm = new JButton(t.getTranslatedText("Confirm"));
        buttonConfirm.setBounds(borderSpacer, borderSpacer + listHeight + verticalElementSpacer, listWidth,
                buttonHeight);
        buttonConfirm.addActionListener(this::buttonConfirmActionPerformed);
        cp.add(buttonConfirm);
        JButton buttonCancel = new JButton(t.getTranslatedText("Cancel"));
        buttonCancel.setBounds(borderSpacer, borderSpacer + listHeight + (2 * verticalElementSpacer) + buttonHeight,
                listWidth, buttonHeight);
        buttonCancel.addActionListener(this::buttonCancelActionPerformed);
        cp.add(buttonCancel);
        int titleBarLAFSpacer = 38;
        int rightLAFSpacer = 16;
        int frameWidth = (2 * borderSpacer) + listWidth + rightLAFSpacer;
        int frameHeight = titleBarLAFSpacer + (2 * borderSpacer) +
                listHeight + (2 * verticalElementSpacer) + (2 * buttonHeight);
        setSize(frameWidth, frameHeight);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);
        setResizable(false);
        setVisible(true);
    }

    private KeyListener createCustomKeyListener() {
        return new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    enterConfirmActionPerformed();
                }
            }
        };
    }

    private MouseListener createCustomMouseListener() {
        return new MouseAdapter() {
            final int doubleClickMaxDelay = OoTMConstants.DOUBLE_CLICK_MAX_DELAY;
            boolean isAlreadyOneClick;
            java.util.Timer timer;

            @Override
            public void mouseClicked(final MouseEvent e) {
                if (isAlreadyOneClick) {
                    doubleClickConfirmActionPerformed();
                    isAlreadyOneClick = false;
                } else {
                    isAlreadyOneClick = true;
                    timer = new java.util.Timer("double click timer", false);
                    timer.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            isAlreadyOneClick = false;
                        }
                    }, doubleClickMaxDelay);
                }
            }
        };
    }

    private void confirmAndDispose() {
        lsc.confirm(seeds.getSelectedValue());
        dispose();
    }

    private void buttonConfirmActionPerformed(final ActionEvent e) {
        confirmAndDispose();
    }

    private void enterConfirmActionPerformed() {
        confirmAndDispose();
    }

    private void doubleClickConfirmActionPerformed() {
        confirmAndDispose();
    }

    private void buttonCancelActionPerformed(final ActionEvent e) {
        dispose();
    }
}
