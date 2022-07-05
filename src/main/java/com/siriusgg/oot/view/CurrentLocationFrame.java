package com.siriusgg.oot.view;

import com.siriusgg.oot.controller.CurrentLocationController;

import javax.swing.*;
import java.awt.*;

public class CurrentLocationFrame extends JFrame {
    private final CurrentLocationController clc;

    public CurrentLocationFrame(final CurrentLocationController clc) {
        super("OoT Exits");
        this.clc = clc;
        init();
    }

    public void init() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(null);
        int leftLAFSpacer = 0;
        int mapWidth = clc.getMapWidth();
        int rightLAFSpacer = 16;
        int tileBarLAFSpacer = 38;
        int mapHeight = clc.getMapHeight();
        int footerLAFSpacer = 0;
        int buttonWidth = 200;
        int buttonHeight = 50;
        int frameWidth = leftLAFSpacer + mapWidth + rightLAFSpacer;
        int frameHeight = tileBarLAFSpacer + mapHeight + buttonHeight + footerLAFSpacer;
        JLabel mapLabel = new JLabel(clc.getMapImage());
        mapLabel.setBounds(0, 0, mapWidth, mapHeight);
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(null);
        buttonPanel.setBounds(0, mapHeight, frameWidth, buttonHeight);
        buttonPanel.setBackground(Color.GRAY);
        JButton buttonTest = new JButton("Test");
        buttonTest.setBounds(0, 0, buttonWidth, buttonHeight);
        buttonTest.setBackground(Color.WHITE);
        buttonPanel.add(buttonTest);
        cp.add(buttonPanel);
        cp.add(mapLabel);
        setSize(frameWidth, frameHeight);
        setResizable(false);
    }
}
