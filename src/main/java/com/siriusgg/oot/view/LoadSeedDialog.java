package com.siriusgg.oot.view;

import com.siriusgg.oot.controller.LoadSeedController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

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

    public void buttonConfirmActionPerformed(final ActionEvent e) {
        lsc.buttonConfirm(seeds.getSelectedValue());
        dispose();
    }

    public void buttonCancelActionPerformed(final ActionEvent e) {
        dispose();
    }
}
