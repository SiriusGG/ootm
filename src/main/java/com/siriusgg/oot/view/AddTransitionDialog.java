package com.siriusgg.oot.view;

import com.siriusgg.oot.controller.AddTransitionController;
import com.siriusgg.oot.exception.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class AddTransitionDialog extends JDialog {
    private final AddTransitionController atc;

    private final JList<String> possibleConnections;

    public AddTransitionDialog(final AddTransitionController atc, final JFrame owner, final String title, final boolean modal) {
        super(owner, title, modal);
        this.atc = atc;
        Container cp = getContentPane();
        setLayout(null);

        int listWidth;
        try {
            listWidth = atc.getBoxWidth();
        } catch (final UnknownExitTypeException | UnhandledExitTypeException e) {
            listWidth = 0;
        }
        int horizontalElementSpacer = 10;
        int verticalElementSpacer = 15;
        int borderSpacer = 5;
        int buttonWidth = 160;
        int buttonHeight = 40;
        int listHeight = 178;
        int rightLAFSpacer = 16;
        int frameWidth = listWidth + horizontalElementSpacer + buttonWidth + (2 * borderSpacer) + rightLAFSpacer;
        int frameHeight = 215 + (2 * borderSpacer);
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
            atc.fillPossibleConnectionsList(possibleConnections);
        } catch (final UnhandledExitTypeException | UnknownExitTypeException e) {
            e.printStackTrace();
        }
        possibleConnections.setSelectedIndex(0);
        cp.add(listScrollPane);
        JButton buttonAdd = new JButton("Add");
        buttonAdd.setBounds(borderSpacer + listWidth + horizontalElementSpacer, borderSpacer, buttonWidth, buttonHeight);
        buttonAdd.addActionListener(this::buttonAddActionPerformed);
        cp.add(buttonAdd);
        JButton buttonCancel = new JButton("Cancel");
        buttonCancel.setBounds(borderSpacer + listWidth + horizontalElementSpacer, borderSpacer + verticalElementSpacer + buttonHeight, buttonWidth, buttonHeight);
        buttonCancel.addActionListener(this::buttonCancelActionPerformed);
        cp.add(buttonCancel);
        setResizable(false);
        setVisible(true);
    }

    private void buttonAddActionPerformed(final ActionEvent actionEvent) {
        try {
            atc.add(possibleConnections.getSelectedValue());
        } catch (final IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    private void buttonCancelActionPerformed(final ActionEvent actionEvent) {
        dispose();
    }
}
