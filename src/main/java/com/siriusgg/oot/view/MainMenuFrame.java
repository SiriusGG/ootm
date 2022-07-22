package com.siriusgg.oot.view;

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
        cp.setLayout(null);
        int modules = 3;
        int buttonWidth = 300;
        int buttonHeight = 50;
        int leftLAFSpacer = 0;
        int rightLAFSpacer = 16;
        int titleBarLAFSpacer = 38;
        int footerLAFSpacer = 0;
        JButton[] buttons = new JButton[modules];
        JButton buttonNew = new JButton("New Map");
        buttons[0] = buttonNew;
        JButton buttonLoad = new JButton("Load Map");
        buttons[1] = buttonLoad;
        JButton buttonAbout = new JButton("About and Credits");
        buttons[2] = buttonAbout;
        buttonNew.setBounds(0, 0, buttonWidth, buttonHeight);
        buttonLoad.setBounds(0, buttonHeight, buttonWidth, buttonHeight);
        buttonAbout.setBounds(0, (buttonHeight) * 2, buttonWidth, buttonHeight);
        buttonNew.addActionListener(this::buttonNewActionPerformed);
        buttonLoad.addActionListener(this::buttonLoadActionPerformed);
        buttonAbout.addActionListener(this::buttonAboutActionPerformed);
        for (final JButton b : buttons) {
            b.setBackground(Color.WHITE);
            cp.add(b);
        }
        int frameWidth = leftLAFSpacer + buttonWidth + rightLAFSpacer;
        int frameHeight = titleBarLAFSpacer + (buttonHeight * modules) + footerLAFSpacer;
        setSize(frameWidth, frameHeight);
        setResizable(false);
    }

    private void buttonNewActionPerformed(final ActionEvent actionEvent) {
        mmc.newMap();
    }

    private void buttonLoadActionPerformed(final ActionEvent actionEvent) {
        mmc.loadMap();
    }

    private void buttonAboutActionPerformed(final ActionEvent actionEvent) {
        mmc.about();
    }
}
