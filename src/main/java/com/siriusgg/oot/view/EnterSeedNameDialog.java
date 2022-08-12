package com.siriusgg.oot.view;


import com.siriusgg.oot.controller.EnterSeedNameController;
import com.siriusgg.oot.controller.SeedNameExistsController;
import com.siriusgg.oot.model.util.SaveLoad;
import com.siriusgg.oot.model.util.StringFunctions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class EnterSeedNameDialog extends JDialog {
    private final EnterSeedNameController esnc;

    private final JTextField textFieldSeedNameInput;

    public EnterSeedNameDialog(final EnterSeedNameController esnc, final JFrame owner, final String title, final boolean modal) {
        super(owner, title, modal);
        this.esnc = esnc;
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLayout(null);
        Container cp = getContentPane();

        textFieldSeedNameInput = new JTextField("");
        textFieldSeedNameInput.setHorizontalAlignment(JTextField.CENTER);
        textFieldSeedNameInput.setToolTipText("Name may only contain A-Z, a-z and 0-9.");
        int borderSpacer = 5;
        int fullElementWidth = 200;
        int textFieldSeedNameInputHeight = 30;
        textFieldSeedNameInput.setBounds(borderSpacer, borderSpacer, fullElementWidth, textFieldSeedNameInputHeight);
        cp.add(textFieldSeedNameInput);
        JButton buttonOK = new JButton("OK");
        int verticalElementSpacer = 5;
        int horizontalElementSpacer = 5;
        int halfElementWidth = (fullElementWidth - horizontalElementSpacer) / 2;
        int buttonHeight = 30;
        buttonOK.setBounds(borderSpacer, borderSpacer + verticalElementSpacer + textFieldSeedNameInputHeight, halfElementWidth, buttonHeight);
        buttonOK.addActionListener(this::buttonOKActionPerformed);
        cp.add(buttonOK);
        JButton buttonCancel = new JButton("Cancel");
        buttonCancel.setBounds(borderSpacer + halfElementWidth + horizontalElementSpacer, borderSpacer + verticalElementSpacer + textFieldSeedNameInputHeight, halfElementWidth, buttonHeight);
        buttonCancel.addActionListener(this::buttonCancelActionPerformed);
        cp.add(buttonCancel);

        int rightLAFSpacer = 16;
        int frameWidth = (2 * borderSpacer) + fullElementWidth + rightLAFSpacer;
        int titleBarLAFSpacer = 38;
        int frameHeight = titleBarLAFSpacer + (2 * borderSpacer) + verticalElementSpacer + textFieldSeedNameInputHeight + buttonHeight;
        setSize(frameWidth, frameHeight);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);

        setResizable(false);
        setVisible(true);
    }

    private void buttonOKActionPerformed(final ActionEvent actionEvent) {
        String rawText = textFieldSeedNameInput.getText();
        String result = StringFunctions.removeSpecialCharacters(rawText);
        if (result != null && !result.equals("")) {
            if (SaveLoad.seedExists(result)) {
                SeedNameExistsController snec = new SeedNameExistsController(esnc.getFrame(), result);
                boolean overwritten = snec.init();
                if (overwritten) {
                    esnc.setSeedName(result);
                    dispose();
                }
            } else {
                esnc.setSeedName(result);
                dispose();
            }
        }
    }

    private void buttonCancelActionPerformed(final ActionEvent actionEvent) {
        dispose();
    }
}
