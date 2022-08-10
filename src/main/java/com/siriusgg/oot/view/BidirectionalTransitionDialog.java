package com.siriusgg.oot.view;

import com.siriusgg.oot.controller.BidirectionalTransitionController;
import com.siriusgg.oot.model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class BidirectionalTransitionDialog extends JDialog {
    private final BidirectionalTransitionController btc;
    private JLabel questionLabel1 = null;
    private JLabel questionLabel2 = null;
    private JButton buttonYes = null;
    private JButton buttonNo = null;
    private JCheckBox checkBoxRemember = null;
    private JList<String> list = null;


    private int frameWidth;
    private int frameHeight;

    private final int borderSpacer = 5;
    private final int verticalElementSpacer = 5;
    private final int titleBarLAFSpacer = 38;
    private final int rightLAFSpacer = 16;
    private final int textLabelHeight = 16;
    private final int buttonHeight = 30;
    private final int listWidth;

    public BidirectionalTransitionDialog(final BidirectionalTransitionController btc, final JFrame owner, final String title, final boolean modal) {
        super(owner, title, modal);
        this.btc = btc;
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLayout(null);
        listWidth = btc.getListWidth();
        btc.handleDisplay(this);
        setResizable(false);
        setVisible(true);
    }

    public void setAskMode() {
        Container cp = getContentPane();
        questionLabel1 = new JLabel("Do you want to also connect the");
        int textLabelWidth = 255;
        questionLabel1.setBounds(borderSpacer, borderSpacer, textLabelWidth, textLabelHeight);
        questionLabel1.setHorizontalAlignment(JLabel.CENTER);
        cp.add(questionLabel1);
        questionLabel2 = new JLabel("transition in the other direction?");
        questionLabel2.setBounds(borderSpacer, borderSpacer + verticalElementSpacer + textLabelHeight, textLabelWidth, textLabelHeight);
        questionLabel2.setHorizontalAlignment(JLabel.CENTER);
        cp.add(questionLabel2);
        buttonYes = new JButton("Yes");
        int buttonWidth = 120;
        buttonYes.setBounds(borderSpacer, borderSpacer + (2 * verticalElementSpacer) + (2 * textLabelHeight), buttonWidth, buttonHeight);
        buttonYes.addActionListener(this::buttonYesActionPerformed);
        cp.add(buttonYes);
        buttonNo = new JButton("No");
        int horizontalElementSpacer = 8;
        buttonNo.setBounds(borderSpacer + buttonWidth + horizontalElementSpacer, borderSpacer + (2 * verticalElementSpacer) + (2 * textLabelHeight), buttonWidth, buttonHeight);
        buttonNo.addActionListener(this::buttonNoActionPerformed);
        cp.add(buttonNo);
        checkBoxRemember = new JCheckBox("Remember this decision for this seed");
        int comboBoxWidth = 260;
        int comboBoxHeight = 20;
        checkBoxRemember.setBounds(borderSpacer, borderSpacer + (3 * verticalElementSpacer) + (2 * textLabelHeight) + buttonHeight, comboBoxWidth, comboBoxHeight);
        cp.add(checkBoxRemember);
        frameWidth = (2 * borderSpacer) + (2 * buttonWidth) + horizontalElementSpacer + rightLAFSpacer;
        frameHeight = titleBarLAFSpacer + (2 * borderSpacer) + (2 * textLabelHeight) + (3 * verticalElementSpacer) + buttonHeight + comboBoxHeight;
        setSizeAndCenter();
    }

    public void setSelectionMode() {
        Container cp = getContentPane();
        if (questionLabel1 != null) questionLabel1.setVisible(false);
        if (questionLabel2 != null) questionLabel2.setVisible(false);
        if (buttonYes != null) buttonYes.setVisible(false);
        if (buttonNo != null) buttonNo.setVisible(false);
        if (checkBoxRemember != null) checkBoxRemember.setVisible(false);
        JLabel niceMapNameLabel1 = new JLabel("Possible exits from");
        niceMapNameLabel1.setBounds(borderSpacer, borderSpacer, listWidth, textLabelHeight);
        niceMapNameLabel1.setHorizontalAlignment(JLabel.CENTER);
        cp.add(niceMapNameLabel1);
        String destinationExitMapNiceName = btc.getDestinationExitMapNiceName();
        JLabel niceMapNameLabel2 = new JLabel(destinationExitMapNiceName + ":");
        niceMapNameLabel2.setBounds(borderSpacer, borderSpacer + verticalElementSpacer + textLabelHeight, listWidth, textLabelHeight);
        niceMapNameLabel2.setHorizontalAlignment(JLabel.CENTER);
        cp.add(niceMapNameLabel2);
        list = new JList<>();
        DefaultListModel<String> listModel = new DefaultListModel<>();
        btc.fillList(listModel);
        JScrollPane listScrollPane = new JScrollPane(list);
        list.setModel(listModel);
        int listHeight = 200;
        listScrollPane.setBounds(borderSpacer, borderSpacer + (2 * verticalElementSpacer) + (2 * textLabelHeight), listWidth, listHeight);
        cp.add(listScrollPane);
        JButton buttonAdd = new JButton("Add");
        buttonAdd.setBounds(borderSpacer, borderSpacer + (3 * verticalElementSpacer) + (2 * textLabelHeight) + listHeight, listWidth, buttonHeight);
        buttonAdd.addActionListener(this::buttonAddActionPerformed);
        cp.add(buttonAdd);
        JButton buttonCancel = new JButton("Cancel");
        buttonCancel.setBounds(borderSpacer, borderSpacer + (4 * verticalElementSpacer) + (2 * textLabelHeight) + listHeight + buttonHeight, listWidth, buttonHeight);
        buttonCancel.addActionListener(this::buttonCancelActionPerformed);
        cp.add(buttonCancel);
        frameWidth = (2 * borderSpacer) + listWidth + rightLAFSpacer;
        frameHeight = titleBarLAFSpacer + (2 * borderSpacer) + (4 * verticalElementSpacer + (2 * textLabelHeight) + listHeight + (2 * buttonHeight));
        setSizeAndCenter();
    }

    private void setSizeAndCenter() {
        setSize(frameWidth, frameHeight);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);
    }

    public void buttonYesActionPerformed(final ActionEvent actionEvent) {
        if (checkBoxRemember.isSelected()) {
            Settings.getInstance().setRwbm(RememberWayBackMode.REMEMBER_YES);
        }
        if (btc.moreThanOneOption()) {
            setSelectionMode();
        } else {
            btc.automaticallySetOnlyOption(this);
        }
    }

    public void buttonNoActionPerformed(final ActionEvent actionEvent) {
        if (checkBoxRemember.isSelected()) {
            Settings.getInstance().setRwbm(RememberWayBackMode.REMEMBER_NO);
        }
        dispose();
    }

    public void buttonAddActionPerformed(final ActionEvent actionEvent) {
        String niceName = list.getSelectedValue();
        // ToDo
        dispose();
    }

    public void buttonCancelActionPerformed(final ActionEvent actionEvent) {
        dispose();
    }
}
