package com.siriusgg.oot.view;

import com.siriusgg.oot.controller.NoSavedSeedsController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class NoSavedSeedsDialog extends JDialog {
    public NoSavedSeedsDialog(final NoSavedSeedsController nssc) {
        super(nssc.getMainMenuController().getFrame(), "No saved seeds", true);
        Container cp = getContentPane();
        setLayout(null);
        int borderSpacer = 5;
        int labelHeight = 20;
        int labelWidth = 300;
        int buttonHeight = 30;
        int buttonWidth = 300;
        int verticalElementSpacer = 5;
        JLabel labelNoSavedSeedsText = new JLabel("No saved seeds were found in");
        labelNoSavedSeedsText.setBounds(borderSpacer, borderSpacer, labelWidth, labelHeight);
        labelNoSavedSeedsText.setHorizontalAlignment(JLabel.CENTER);
        cp.add(labelNoSavedSeedsText);
        JLabel labelSeedDirectory = new JLabel(nssc.getSeedDirectory());
        labelSeedDirectory.setHorizontalAlignment(JLabel.CENTER);
        labelSeedDirectory.setBounds(borderSpacer, borderSpacer + verticalElementSpacer + labelHeight, labelWidth, labelHeight);
        cp.add(labelSeedDirectory);
        JButton buttonOK = new JButton("OK");
        buttonOK.setBounds(borderSpacer, borderSpacer + (2 * verticalElementSpacer) + (2 * labelHeight), buttonWidth, buttonHeight);
        buttonOK.addActionListener(this::buttonOKActionPerformed);
        cp.add(buttonOK);
        int titleBarLAFSpacer = 38;
        int rightLAFSpacer = 16;
        int frameWidth = (2 * borderSpacer) + labelWidth + rightLAFSpacer;
        int frameHeight = titleBarLAFSpacer + (2 * borderSpacer) + (2 * labelHeight) + (2 * verticalElementSpacer) + buttonHeight;
        setSize(frameWidth, frameHeight);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);
        setResizable(false);
        setVisible(true);
    }

    private void buttonOKActionPerformed(final ActionEvent actionEvent) {
        dispose();
    }
}
