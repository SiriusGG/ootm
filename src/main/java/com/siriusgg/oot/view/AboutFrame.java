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
        JLabel[] aboutTexts = ac.createAboutLabels();
        int lineHeight = 16;
        int lineWidth = 280;
        int vertSpacer = 5;
        int elementSpacer = 8;
        int rightSpacer = 16;
        int titleBarLAFSpacer = 38;
        int footerExtraSpacer = 10;
        int amount = aboutTexts.length;
        for (int i = 0; i < amount; i++) {
            aboutTexts[i].setBounds(0, vertSpacer + (elementSpacer * i) + (lineHeight * i), lineWidth, lineHeight);
            cp.add(aboutTexts[i]);
        }
        setSize(lineWidth + rightSpacer,
                titleBarLAFSpacer + (vertSpacer * 2) + (lineHeight * amount) + (elementSpacer * (amount - 1)) + footerExtraSpacer);
        setResizable(false);
        setVisible(true);
    }
}
