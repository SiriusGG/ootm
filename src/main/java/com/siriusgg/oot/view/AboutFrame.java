package com.siriusgg.oot.view;

import com.siriusgg.oot.controller.AboutController;

import javax.swing.*;
import java.awt.*;

public class AboutFrame extends JFrame {
    private final AboutController ac;

    public AboutFrame(final AboutController ac) {
        super("OoT Maps: About");
        this.ac = ac;
    }

    public void init() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Container cp = getContentPane();
        setLayout(null);
        cp.setBackground(Color.WHITE);
        JLabel[] aboutTexts = ac.createAboutLabels();
        int lineHeight = 16;
        int lineWidth = 260;
        int verticalElementSpacer = 5;
        int rightSpacer = 16;
        int titleBarLAFSpacer = 38;
        int borderSpacer = 5;
        int extraTopBotSpacer = 5;
        int amount = aboutTexts.length;
        for (int i = 0; i < amount; i++) {
            aboutTexts[i].setBounds(borderSpacer, extraTopBotSpacer + (verticalElementSpacer * i) + (lineHeight * i), lineWidth, lineHeight);
            cp.add(aboutTexts[i]);
        }
        setSize((2 * borderSpacer) + lineWidth + rightSpacer,
                titleBarLAFSpacer + (2 * borderSpacer) + (lineHeight * amount) + (verticalElementSpacer * (amount - 1)));
        setResizable(false);
        setVisible(true);
    }
}
