package com.siriusgg.oot.view;

import com.siriusgg.oot.controller.SeedNameExistsController;
import com.siriusgg.oot.model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class SeedNameExistsDialog extends JDialog {
    private final SeedNameExistsController snec;

    public SeedNameExistsDialog(final SeedNameExistsController snec, final String title) {
        super(snec.getFrame(), title, true);
        Translation t = GlobalSettings.getInstance().getTranslation();
        this.snec = snec;
        Container cp = getContentPane();
        setLayout(null);
        cp.setBackground(Color.WHITE);
        int borderSpacer = 5;
        int labelWidth = 240;
        int labelHeight = 16;
        int buttonHeight = 30;
        int verticalElementSpacer = 5;
        JLabel labelSeedNameInUseText1 = new JLabel(t.getTranslatedText("The seed name"));
        labelSeedNameInUseText1.setHorizontalAlignment(JLabel.CENTER);
        labelSeedNameInUseText1.setBounds(borderSpacer, borderSpacer, labelWidth, labelHeight);
        cp.add(labelSeedNameInUseText1);
        JLabel labelSeedNameInUseText2 = new JLabel(snec.getSeedName());
        labelSeedNameInUseText2.setHorizontalAlignment(JLabel.CENTER);
        labelSeedNameInUseText2.setBounds(borderSpacer, borderSpacer + verticalElementSpacer + labelHeight, labelWidth, labelHeight);
        cp.add(labelSeedNameInUseText2);
        JLabel labelSeedNameInUseText3 = new JLabel(t.getTranslatedText("is already in use."));
        labelSeedNameInUseText3.setHorizontalAlignment(JLabel.CENTER);
        labelSeedNameInUseText3.setBounds(borderSpacer, borderSpacer + (2 * verticalElementSpacer) + (2 * labelHeight), labelWidth, labelHeight);
        cp.add(labelSeedNameInUseText3);
        JButton buttonOverwrite = new JButton(t.getTranslatedText("Overwrite"));
        buttonOverwrite.setBounds(borderSpacer, borderSpacer + (3 * verticalElementSpacer) + (3 * labelHeight), labelWidth, buttonHeight);
        buttonOverwrite.addActionListener(this::buttonOverwriteActionPerformed);
        cp.add(buttonOverwrite);
        JButton buttonCancel = new JButton(t.getTranslatedText("Cancel"));
        buttonCancel.setBounds(borderSpacer, borderSpacer + (4 * verticalElementSpacer) + (3 * labelHeight) + buttonHeight, labelWidth, buttonHeight);
        buttonCancel.addActionListener(this::buttonCancelActionPerformed);
        cp.add(buttonCancel);
        int rightLAFSpacer = 16;
        int frameWidth = (2 * borderSpacer) + labelWidth + rightLAFSpacer;
        int titleBarLAFSpacer = 38;
        int frameHeight = titleBarLAFSpacer + (2 * borderSpacer) + (4 * verticalElementSpacer) + (3 * labelHeight) + (2 * buttonHeight);
        setSize(frameWidth, frameHeight);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);
        setResizable(false);
        setVisible(true);
    }

    private void buttonOverwriteActionPerformed(final ActionEvent actionEvent) {
        snec.overwrite();
        dispose();
    }

    private void buttonCancelActionPerformed(final ActionEvent actionEvent) {
        dispose();
    }
}
