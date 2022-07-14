package com.siriusgg.oot.view;

import javax.swing.*;

public class AboutFrame extends JFrame {
    public AboutFrame() {
        super("About");
    }

    public void init() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300, 300);
        setResizable(false);
        setVisible(true);
    }
}
