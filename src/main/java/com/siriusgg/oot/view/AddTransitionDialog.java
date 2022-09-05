package com.siriusgg.oot.view;

import com.siriusgg.oot.model.OoTMConstants;
import com.siriusgg.oot.controller.AddTransitionController;
import com.siriusgg.oot.exception.*;
import com.siriusgg.oot.model.util.UIFunctions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.TimerTask;

public class AddTransitionDialog extends JDialog {
    private final AddTransitionController atc;

    private final JList<String> possibleConnections;

    public AddTransitionDialog(final AddTransitionController atc, final JFrame owner, final String title,
                               final boolean modal) {
        super(owner, title, modal);
        this.atc = atc;
        Container cp = getContentPane();
        setLayout(null);
        cp.setBackground(Color.WHITE);
        int listWidth;
        try {
            listWidth = UIFunctions.getBoxWidth(atc.getExit());
        } catch (final UnknownExitTypeException | UnhandledExitTypeException e) {
            System.err.println("Could not determine width of list in AddTransitionDialog. Using 245.");
            listWidth = 245;
        }
        int verticalElementSpacer = 5;
        int borderSpacer = 5;
        int buttonHeight = 30;
        int listHeight = 240;
        int titleBarLAFSpacer = 38;
        int rightLAFSpacer = 16;
        int frameWidth = (2 * borderSpacer) + listWidth + rightLAFSpacer;
        int frameHeight =
                titleBarLAFSpacer + (2 * borderSpacer) + (2 * verticalElementSpacer) + listHeight + (2 * buttonHeight);
        setSize(frameWidth, frameHeight);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);
        possibleConnections = new JList<>();
        DefaultListModel<String> listModel = new DefaultListModel<>();
        JScrollPane listScrollPane = new JScrollPane(possibleConnections);
        possibleConnections.setModel(listModel);
        listScrollPane.setBounds(borderSpacer, borderSpacer, listWidth, listHeight);
        try {
            atc.fillPossibleConnectionsList(listModel);
        } catch (final UnhandledExitTypeException | UnknownExitTypeException e) {
            e.printStackTrace();
        }
        possibleConnections.setSelectedIndex(0);
        possibleConnections.addKeyListener(createCustomKeyListener());
        possibleConnections.addMouseListener(createCustomMouseListener());
        cp.add(listScrollPane);
        JButton buttonAdd = new JButton("Add");
        buttonAdd.setBounds(borderSpacer, borderSpacer + verticalElementSpacer + listHeight, listWidth, buttonHeight);
        buttonAdd.addActionListener(this::buttonAddActionPerformed);
        cp.add(buttonAdd);
        JButton buttonCancel = new JButton("Cancel");
        buttonCancel.setBounds(borderSpacer, borderSpacer + (2 * verticalElementSpacer) + listHeight + buttonHeight,
                listWidth, buttonHeight);
        buttonCancel.addActionListener(this::buttonCancelActionPerformed);
        cp.add(buttonCancel);
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

    private void addAndDispose() {
        atc.doAdd(possibleConnections.getSelectedValue());
        dispose();
    }

    private void buttonAddActionPerformed(final ActionEvent actionEvent) {
        addAndDispose();
    }

    private void enterConfirmActionPerformed() {
        addAndDispose();
    }

    private void doubleClickConfirmActionPerformed() {
        addAndDispose();
    }

    private void buttonCancelActionPerformed(final ActionEvent actionEvent) {
        dispose();
    }
}
