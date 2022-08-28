package com.siriusgg.oot.view;

import com.siriusgg.oot.Constants;
import com.siriusgg.oot.controller.MainMenuController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainMenuFrame extends JFrame {
    private final MainMenuController mmc;

    public MainMenuFrame(final MainMenuController mmc) {
        super("OoT Maps: Main Menu");
        this.mmc = mmc;
        init();
    }

    public void init() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        setLayout(null);
        cp.setBackground(Color.WHITE);
        int modules = 4;
        int buttonWidth = 300;
        int buttonHeight = 50;
        int rightLAFSpacer = 16;
        int titleBarLAFSpacer = 38;
        int borderSpacer = 5;
        int verticalElementSpacer = 5;
        JButton[] buttons = new JButton[modules];
        JButton buttonNew = new JButton("New Seed");
        buttons[0] = buttonNew;
        buttonNew.addActionListener(this::buttonNewActionPerformed);
        JButton buttonLoad = new JButton("Load Seed");
        buttons[1] = buttonLoad;
        buttonLoad.addActionListener(this::buttonLoadActionPerformed);
        JButton buttonBrowse = new JButton("Browse " + Constants.SAVE_DIRECTORY + " directory");
        buttons[2] = buttonBrowse;
        buttonBrowse.addActionListener(this::buttonBrowseActionPerformed);
        JButton buttonAbout = new JButton("About and Credits");
        buttons[3] = buttonAbout;
        buttonAbout.addActionListener(this::buttonAboutActionPerformed);
        for (int i = 0; i < buttons.length; i++) {
            JButton b = buttons[i];
            b.setBounds(borderSpacer, borderSpacer + (i * verticalElementSpacer) + (i * buttonHeight),
                    buttonWidth, buttonHeight);
            b.setBackground(Color.WHITE);
            cp.add(b);
        }
        int frameWidth = (2 * borderSpacer) + buttonWidth + rightLAFSpacer;
        int frameHeight = titleBarLAFSpacer + (3 * verticalElementSpacer) +
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

    private void buttonBrowseActionPerformed(final ActionEvent actionEvent) {
        mmc.browse();
    }

    private void buttonAboutActionPerformed(final ActionEvent actionEvent) {
        mmc.about();
    }
}
