package com.siriusgg.oot.view;

import com.siriusgg.oot.controller.*;
import com.siriusgg.oot.model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GlobalSettingsDialog extends JDialog {
    private final GlobalSettingsController gsc;
    private final JLabel languageLabel;
    private final JComboBox<String> languageComboBox;

    public GlobalSettingsDialog(final GlobalSettingsController gsc, final MainMenuFrame mmf, final String title) {
        super(mmf, title, true);
        this.gsc = gsc;
        Translation t = GlobalSettings.getInstance().getTranslation();
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLayout(null);
        Container cp = getContentPane();
        int borderSpacer = 5;
        int verticalElementSpacer = 5;
        int languageComboBoxWidth = 200;
        int languageComboBoxHeight = 30;
        int rightLAFSpacer = 16;
        int titleBarLAFSpacer = 38;
        int textLabelHeight = 20;
        languageLabel = new JLabel(t.getTranslatedText("Language"));
        languageLabel.setBounds(borderSpacer, borderSpacer, languageComboBoxWidth, textLabelHeight);
        cp.add(languageLabel);
        languageComboBox = new JComboBox<>();
        languageComboBox.setBounds(borderSpacer, borderSpacer + verticalElementSpacer + textLabelHeight,
                languageComboBoxWidth, languageComboBoxHeight);
        gsc.fillLanguageComboBox(languageComboBox);
        gsc.setSelectedLanguage(languageComboBox);
        languageComboBox.addActionListener(this::languageComboBoxActionPerformed);
        cp.add(languageComboBox);
        int frameWidth = (2 * borderSpacer) + languageComboBoxWidth + rightLAFSpacer;
        int frameHeight = titleBarLAFSpacer + (2 * borderSpacer) + textLabelHeight + verticalElementSpacer +
                languageComboBoxHeight;
        setSize(frameWidth, frameHeight);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);
        setResizable(false);
        setVisible(true);
    }

    private void languageComboBoxActionPerformed(final ActionEvent actionEvent) {
        gsc.updateLanguage(this, languageComboBox);
    }

    public JLabel getLanguageLabel() {
        return languageLabel;
    }
}
