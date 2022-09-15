package com.siriusgg.oot.view;

import com.siriusgg.oot.controller.EnterSeedNameController;
import com.siriusgg.oot.model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class EnterSeedNameDialog extends JDialog {
    private final EnterSeedNameController esnc;

    private final JTextField textFieldSeedNameInput;

    public EnterSeedNameDialog(final EnterSeedNameController esnc, final JFrame owner, final String title,
                               final boolean modal) {
        super(owner, title, modal);
        Translation t = GlobalSettings.getInstance().getTranslation();
        this.esnc = esnc;
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Container cp = getContentPane();
        setLayout(null);
        cp.setBackground(Color.WHITE);
        textFieldSeedNameInput = new JTextField("");
        textFieldSeedNameInput.setHorizontalAlignment(JTextField.CENTER);
        textFieldSeedNameInput.setToolTipText(t.getTranslatedText("Name may only contain A-Z, a-z and 0-9."));
        int borderSpacer = 5;
        int fullElementWidth = 200;
        int textFieldSeedNameInputHeight = 30;
        textFieldSeedNameInput.setBounds(borderSpacer, borderSpacer, fullElementWidth, textFieldSeedNameInputHeight);
        textFieldSeedNameInput.addActionListener(this::textFieldSeeNameInputEnterPressedActionPerformed);
        cp.add(textFieldSeedNameInput);
        JButton buttonConfirm = new JButton(t.getTranslatedText("Confirm"));
        int verticalElementSpacer = 5;
        int horizontalElementSpacer = 5;
        int halfElementWidth = (fullElementWidth - horizontalElementSpacer) / 2;
        int buttonHeight = 30;
        buttonConfirm.setBounds(borderSpacer, borderSpacer + verticalElementSpacer + textFieldSeedNameInputHeight,
                halfElementWidth, buttonHeight);
        buttonConfirm.addActionListener(this::buttonConfirmActionPerformed);
        cp.add(buttonConfirm);
        JButton buttonCancel = new JButton(t.getTranslatedText("Cancel"));
        buttonCancel.setBounds(borderSpacer + halfElementWidth + horizontalElementSpacer,
                borderSpacer + verticalElementSpacer + textFieldSeedNameInputHeight, halfElementWidth, buttonHeight);
        buttonCancel.addActionListener(this::buttonCancelActionPerformed);
        cp.add(buttonCancel);
        int rightLAFSpacer = 16;
        int frameWidth = (2 * borderSpacer) + fullElementWidth + rightLAFSpacer;
        int titleBarLAFSpacer = 38;
        int frameHeight = titleBarLAFSpacer + (2 * borderSpacer) +
                verticalElementSpacer + textFieldSeedNameInputHeight + buttonHeight;
        setSize(frameWidth, frameHeight);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);

        setResizable(false);
        setVisible(true);
    }

    private void textFieldSeeNameInputEnterPressedActionPerformed(final ActionEvent actionEvent) {
        buttonConfirmActionPerformed(actionEvent);
    }

    private void buttonConfirmActionPerformed(final ActionEvent actionEvent) {
        esnc.buttonConfirm(this, textFieldSeedNameInput.getText());
    }

    private void buttonCancelActionPerformed(final ActionEvent actionEvent) {
        dispose();
    }
}
