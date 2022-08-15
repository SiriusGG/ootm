package com.siriusgg.oot.view;

import com.siriusgg.oot.controller.LoadSeedController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;

public class LoadSeedDialog extends JDialog {
    private final LoadSeedController lsc;
    private final JList<String> seeds;

    public LoadSeedDialog(final LoadSeedController lsc) {
        super(lsc.getMainMenuController().getFrame(), "Select seed", true);
        this.lsc = lsc;
        Container cp = getContentPane();
        setLayout(null);
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
        JButton buttonConfirm = new JButton("Confirm");
        buttonConfirm.setBounds(borderSpacer, borderSpacer + listHeight + verticalElementSpacer, listWidth, buttonHeight);
        buttonConfirm.addActionListener(this::buttonConfirmActionPerformed);
        cp.add(buttonConfirm);
        JButton buttonCancel = new JButton("Cancel");
        buttonCancel.setBounds(borderSpacer, borderSpacer + listHeight + (2 * verticalElementSpacer) + buttonHeight, listWidth, buttonHeight);
        buttonCancel.addActionListener(this::buttonCancelActionPerformed);
        cp.add(buttonCancel);
        int titleBarLAFSpacer = 38;
        int rightLAFSpacer = 16;
        int frameWidth = (2 * borderSpacer) + listWidth + rightLAFSpacer;
        int frameHeight = titleBarLAFSpacer + (2 * borderSpacer) + listHeight + (2 * verticalElementSpacer) + (2 * buttonHeight);
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
                    enterConfirmActionPerformed(e);
                }
            }
        };
    }

    private MouseListener createCustomMouseListener() {
        return new MouseAdapter() {
            boolean isAlreadyOneClick;
            Timer timer;
            final int doubleClickMaxDelay = (int)Toolkit.getDefaultToolkit().getDesktopProperty("awt.multiClickInterval");
            @Override
            public void mouseClicked(final MouseEvent e) {
                if (isAlreadyOneClick) {
                    doubleClickConfirmActionPerformed(e);
                    isAlreadyOneClick = false;
                } else {
                    isAlreadyOneClick = true;
                    timer = new Timer("double click timer", false);
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

    private void buttonConfirmActionPerformed(final ActionEvent e) {
        confirmAndDispose();
    }

    private void enterConfirmActionPerformed(final KeyEvent e) {
        confirmAndDispose();
    }

    private void doubleClickConfirmActionPerformed(final MouseEvent e) {
        confirmAndDispose();
    }

    public void confirmAndDispose() {
        lsc.confirm(seeds.getSelectedValue());
        dispose();
    }

    public void buttonCancelActionPerformed(final ActionEvent e) {
        dispose();
    }
}
