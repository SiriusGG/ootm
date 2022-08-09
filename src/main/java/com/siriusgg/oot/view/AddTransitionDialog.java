package com.siriusgg.oot.view;

import com.siriusgg.oot.controller.AddTransitionController;
import com.siriusgg.oot.exception.*;
import com.siriusgg.oot.model.util.UIFunctions;

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
            listWidth = UIFunctions.getBoxWidth(atc.getExit());
        } catch (final UnknownExitTypeException | UnhandledExitTypeException e) {
            System.err.println("Could not determine width of list in AddTransitionDialog. Using 245.");
            listWidth = 245;
        }
        int verticalElementSpacer = 5;
        int borderSpacer = 5;
        int buttonHeight = 30;
        int listHeight = 200;
        int titleBarLAFSpacer = 38;
        int rightLAFSpacer = 16;
        int frameWidth = (2 * borderSpacer) + listWidth + rightLAFSpacer;
        int frameHeight = titleBarLAFSpacer + (2 * borderSpacer) + (2 * verticalElementSpacer) + listHeight + (2 * buttonHeight);
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
        buttonAdd.setBounds(borderSpacer, borderSpacer + verticalElementSpacer + listHeight, listWidth, buttonHeight);
        buttonAdd.addActionListener(this::buttonAddActionPerformed);
        cp.add(buttonAdd);
        JButton buttonCancel = new JButton("Cancel");
        buttonCancel.setBounds(borderSpacer, borderSpacer + (2 * verticalElementSpacer) + listHeight + buttonHeight, listWidth, buttonHeight);
        buttonCancel.addActionListener(this::buttonCancelActionPerformed);
        cp.add(buttonCancel);
        setResizable(false);
        setVisible(true);
    }

    private void buttonAddActionPerformed(final ActionEvent actionEvent) {
        atc.buttonAdd(possibleConnections.getSelectedValue());
        dispose();
    }

    private void buttonCancelActionPerformed(final ActionEvent actionEvent) {
        dispose();
    }
}
