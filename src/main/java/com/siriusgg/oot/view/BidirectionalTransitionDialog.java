package com.siriusgg.oot.view;

import com.siriusgg.oot.exception.*;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.Exit;
import com.siriusgg.oot.model.util.UIFunctions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class BidirectionalTransitionDialog extends JDialog {
    private final Container cp;
    private final String connection;
    private JLabel questionLabel1 = null;
    private JLabel questionLabel2 = null;
    private JButton buttonYes = null;
    private JButton buttonNo = null;
    private JCheckBox checkBoxRemember = null;
    private JList<String> list;
    private int frameWidth;
    private int frameHeight;

    int borderSpacer = 5;
    int horizontalElementSpacer = 8;
    int verticalElementSpacer = 5;
    int titleBarLAFSpacer = 38;
    int rightLAFSpacer = 16;
    int textLabelWidth = 255;
    int textLabelHeight = 16;
    int buttonWidth = 120;
    int buttonHeight = 30;
    int comboBoxWidth = 260;
    int comboBoxHeight = 20;
    int listWidth;
    int listHeight = 200;

    public BidirectionalTransitionDialog(final Exit exit, final JFrame owner, final String title, final boolean modal, final String connection) {
        super(owner, title, modal);
        this.connection = connection;
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        cp = getContentPane();
        setLayout(null);
        listWidth = getSafeListWidth(exit);
        if (Settings.getInstance().getRwbm() == RememberWayBackMode.DO_NOT_REMEMBER) {
            setAskMode();
        } else if (Settings.getInstance().getRwbm() == RememberWayBackMode.REMEMBER_YES) {
            setSelectionMode();
        } else {
            throw new IllegalStateException("RememberWayBackMode is neither DO_NOT_REMEMBER nor REMEMBER_YES, so this Dialog should never open.");
        }
        setResizable(false);
        setVisible(true);
    }

    private int getSafeListWidth(final Exit exit) {
        int newListWidth;
        try {
            newListWidth = UIFunctions.getBoxWidth(exit);
        } catch (final UnknownExitTypeException | UnhandledExitTypeException e) {
            System.err.println("Could not determine width of list in BidirectionalTransitionDialog. Using 245.");
            newListWidth = 245;
        }
        return newListWidth;
    }

    private void buttonYesActionPerformed(final ActionEvent actionEvent) {
        if (checkBoxRemember.isSelected()) {
            Settings.getInstance().setRwbm(RememberWayBackMode.REMEMBER_YES);
        }
        if (moreThanOneOption()) {
            setSelectionMode();
        } else {
            automaticallySetOnlyOption();
        }
    }

    private void buttonNoActionPerformed(final ActionEvent actionEvent) {
        if (checkBoxRemember.isSelected()) {
            Settings.getInstance().setRwbm(RememberWayBackMode.REMEMBER_NO);
        }
        dispose();
    }

    private void buttonAddActionPerformed(final ActionEvent actionEvent) {
        String toAdd = list.getSelectedValue();
        // ToDo
        dispose();
    }

    private void buttonCancelActionPerformed(final ActionEvent actionEvent) {
        dispose();
    }

    private void setAskMode() {
        questionLabel1 = new JLabel("Do you want to also connect the");
        questionLabel1.setBounds(borderSpacer, borderSpacer, textLabelWidth, textLabelHeight);
        questionLabel1.setHorizontalAlignment(JLabel.CENTER);
        cp.add(questionLabel1);
        questionLabel2 = new JLabel("transition in the other direction?");
        questionLabel2.setBounds(borderSpacer, borderSpacer + verticalElementSpacer + textLabelHeight, textLabelWidth, textLabelHeight);
        questionLabel2.setHorizontalAlignment(JLabel.CENTER);
        cp.add(questionLabel2);
        buttonYes = new JButton("Yes");
        buttonYes.setBounds(borderSpacer, borderSpacer + (2 * verticalElementSpacer) + (2 * textLabelHeight), buttonWidth, buttonHeight);
        buttonYes.addActionListener(this::buttonYesActionPerformed);
        cp.add(buttonYes);
        buttonNo = new JButton("No");
        buttonNo.setBounds(borderSpacer + buttonWidth + horizontalElementSpacer, borderSpacer + (2 * verticalElementSpacer) + (2 * textLabelHeight), buttonWidth, buttonHeight);
        buttonNo.addActionListener(this::buttonNoActionPerformed);
        cp.add(buttonNo);
        checkBoxRemember = new JCheckBox("Remember this decision for this seed");
        checkBoxRemember.setBounds(borderSpacer, borderSpacer + (3 * verticalElementSpacer) + (2 * textLabelHeight) + buttonHeight, comboBoxWidth, comboBoxHeight);
        cp.add(checkBoxRemember);

        frameWidth = (2 * borderSpacer) + (2 * buttonWidth) + horizontalElementSpacer + rightLAFSpacer;
        frameHeight = titleBarLAFSpacer + (2 * borderSpacer) + (2 * textLabelHeight) + (3 * verticalElementSpacer) + buttonHeight + comboBoxHeight;
        setSize(frameWidth, frameHeight);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);
    }

    private void setSelectionMode() {
        if (questionLabel1 != null) questionLabel1.setVisible(false);
        if (questionLabel2 != null) questionLabel2.setVisible(false);
        if (buttonYes != null) buttonYes.setVisible(false);
        if (buttonNo != null) buttonNo.setVisible(false);
        if (checkBoxRemember != null) checkBoxRemember.setVisible(false);

        String destinationExitMapNiceName = "Lorem Ipsum"; // ToDo: Replace by lower line once it works
        // String destinationExitMapNiceName = someLookUp(connection).getNiceName();
        JLabel niceMapNameLabel = new JLabel("Possible exits from " + destinationExitMapNiceName + ":");
        niceMapNameLabel.setBounds(borderSpacer, borderSpacer, listWidth, textLabelHeight);
        cp.add(niceMapNameLabel);
        list = new JList<>();
        DefaultListModel<String> listModel = new DefaultListModel<>();
        // ToDo: Fill model
        // for (entry : collection) listModel.add(entry);
        JScrollPane listScrollPane = new JScrollPane(list);
        list.setModel(listModel);
        listScrollPane.setBounds(borderSpacer, borderSpacer + verticalElementSpacer + textLabelHeight, listWidth, listHeight);
        cp.add(listScrollPane);
        JButton buttonAdd = new JButton("Add");
        buttonAdd.setBounds(borderSpacer, borderSpacer + (2 * verticalElementSpacer) + textLabelHeight + listHeight, listWidth, buttonHeight);
        buttonAdd.addActionListener(this::buttonAddActionPerformed);
        cp.add(buttonAdd);
        JButton buttonCancel = new JButton("Cancel");
        buttonCancel.setBounds(borderSpacer, borderSpacer + (3 * verticalElementSpacer) + textLabelHeight + listHeight + buttonHeight, listWidth, buttonHeight);
        buttonCancel.addActionListener(this::buttonCancelActionPerformed);
        cp.add(buttonCancel);

        frameWidth = (2 * borderSpacer) + listWidth + rightLAFSpacer;
        frameHeight = titleBarLAFSpacer + (2 * borderSpacer) + (3 * verticalElementSpacer + textLabelHeight + listHeight + (2 * buttonHeight));
        setSize(frameWidth, frameHeight);

        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);
    }

    private boolean moreThanOneOption() {
        // ToDo
        return true;
    }

    private void automaticallySetOnlyOption() {
        // ToDo: implement, de-pseudo and possibly rename
        dispose();
    }
}
