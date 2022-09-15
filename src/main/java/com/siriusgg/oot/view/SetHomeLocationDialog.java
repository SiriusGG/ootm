package com.siriusgg.oot.view;

import com.siriusgg.oot.controller.SetHomeLocationController;
import com.siriusgg.oot.model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.TimerTask;

public class SetHomeLocationDialog extends JDialog {
    private final SetHomeLocationController shlc;
    private final JList<String> list;

    public SetHomeLocationDialog(final SetHomeLocationController shlc, final String title) {
        super(shlc.getFrame(), title, true);
        Translation t = GlobalSettings.getInstance().getTranslation();
        this.shlc = shlc;
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLayout(null);
        Container cp = getContentPane();
        int borderSpacer = 5;
        int verticalElementSpacer = 5;
        int listWidth = 200;
        int listHeight = 400;
        int buttonHeight = 30;
        int rightLAFSpacer = 16;
        int titleBarLAFSpacer = 38;
        list = new JList<>();
        DefaultListModel<String> listModel = new DefaultListModel<>();
        list.setModel(listModel);
        JScrollPane listScrollPane = new JScrollPane(list);
        listScrollPane.setBounds(borderSpacer, borderSpacer, listWidth, listHeight);
        shlc.fillList(list);
        list.setSelectedValue(t.getTranslatedText(shlc.getCurrentHomeText()), true);
        list.addKeyListener(createCustomKeyListener());
        list.addMouseListener(createCustomMouseListener());
        cp.add(listScrollPane);
        JButton buttonSet = new JButton(t.getTranslatedText("Set"));
        buttonSet.setBounds(borderSpacer, borderSpacer + listHeight + verticalElementSpacer, listWidth, buttonHeight);
        buttonSet.addActionListener(this::buttonSetActionPerformed);
        cp.add(buttonSet);
        JButton buttonCancel = new JButton(t.getTranslatedText("Cancel"));
        buttonCancel.setBounds(borderSpacer, borderSpacer + listHeight + (2 * verticalElementSpacer) + buttonHeight,
                listWidth, buttonHeight);
        buttonCancel.addActionListener(this::buttonCancelActionPerformed);
        cp.add(buttonCancel);
        int frameWidth = (2 * borderSpacer) + listWidth + rightLAFSpacer;
        int frameHeight = titleBarLAFSpacer + (2 * borderSpacer) + listHeight + (2 * verticalElementSpacer) +
                (2 * buttonHeight);
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
                    enterSetActionPerformed();
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
                    doubleClickSetActionPerformed();
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

    private void buttonSetActionPerformed(final ActionEvent actionEvent) {
        performSet();
    }

    private void enterSetActionPerformed() {
        performSet();
    }

    private void doubleClickSetActionPerformed() {
        performSet();
    }

    private void performSet() {
        shlc.performSet(this, Translation.toEnglish(list.getSelectedValue()));
    }

    private void buttonCancelActionPerformed(final ActionEvent actionEvent) {
        dispose();
    }
}
