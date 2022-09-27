package com.siriusgg.oot.view;

import com.siriusgg.oot.constants.OoTMConstants;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.controller.MainMenuController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainMenuFrame extends JFrame {
    private final MainMenuController mmc;
    private Translation t;
    private JButton[] buttons;

    public MainMenuFrame(final MainMenuController mmc) {
        super("");
        t = GlobalSettings.getInstance().getTranslation();
        setTitle(t.getTranslatedText("OoT Maps: Main Menu"));
        this.mmc = mmc;
        init();
    }

    public void init() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        setLayout(null);
        cp.setBackground(Color.WHITE);
        int modules = 6;
        int buttonWidth = 300;
        int buttonHeight = 50;
        int rightLAFSpacer = 16;
        int titleBarLAFSpacer = 38;
        int borderSpacer = 5;
        int verticalElementSpacer = 5;
        buttons = new JButton[modules];
        buttons[0] = new JButton(t.getTranslatedText("New Seed"));
        buttons[0].addActionListener(this::buttonNewActionPerformed);
        buttons[1] = new JButton(t.getTranslatedText("Load Seed"));
        buttons[1].addActionListener(this::buttonLoadActionPerformed);
        buttons[2] = new JButton(t.getTranslatedText("Settings"));
        buttons[2].addActionListener(this::buttonSettingsActionPerformed);
        buttons[3] = new JButton(t.getTranslatedText("Browse") + " " +
                OoTMConstants.SAVE_DIRECTORY +
                t.getTranslatedText(" directory"));
        buttons[3].addActionListener(this::buttonBrowseActionPerformed);
        buttons[4] = new JButton(t.getTranslatedText("About"));
        buttons[4].addActionListener(this::buttonAboutActionPerformed);
        buttons[5] = new JButton(t.getTranslatedText("Exit"));
        buttons[5].addActionListener(this::buttonExitActionPerformed);
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setBounds(borderSpacer, borderSpacer + (i * verticalElementSpacer) + (i * buttonHeight),
                    buttonWidth, buttonHeight);
            buttons[i].setBackground(Color.WHITE);
            cp.add(buttons[i]);
        }
        int frameWidth = (2 * borderSpacer) + buttonWidth + rightLAFSpacer;
        int frameHeight = titleBarLAFSpacer + ((modules - 1) * verticalElementSpacer) +
                (2 * borderSpacer) + (buttonHeight * modules);
        setSize(frameWidth, frameHeight);
        setResizable(false);
    }

    private void buttonNewActionPerformed(final ActionEvent actionEvent) {
        mmc.newSeed();
    }

    private void buttonLoadActionPerformed(final ActionEvent actionEvent) {
        mmc.loadSeed();
    }

    private void buttonSettingsActionPerformed(final ActionEvent actionEvent) {
        mmc.openSettingsDialog();
    }

    private void buttonBrowseActionPerformed(final ActionEvent actionEvent) {
        mmc.browse();
    }

    private void buttonAboutActionPerformed(final ActionEvent actionEvent) {
        mmc.about();
    }

    private void buttonExitActionPerformed(final ActionEvent actionEvent) {
        System.exit(0);
    }

    public void reTranslate() {
        t = GlobalSettings.getInstance().getTranslation();
        setTitle(t.getTranslatedText("OoT Maps: Main Menu"));
        buttons[0].setText(t.getTranslatedText("New Seed"));
        buttons[1].setText(t.getTranslatedText("Load Seed"));
        buttons[2].setText(t.getTranslatedText("Settings"));
        buttons[3].setText(t.getTranslatedText("Browse") + " " +
                OoTMConstants.SAVE_DIRECTORY +
                t.getTranslatedText(" directory"));
        buttons[4].setText(t.getTranslatedText("About"));
        buttons[5].setText(t.getTranslatedText("Exit"));
    }
}
