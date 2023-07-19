package com.siriusgg.oot.view;

import com.siriusgg.oot.constants.ViewConstants;
import com.siriusgg.oot.controller.AboutController;
import com.siriusgg.oot.model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AboutFrame extends JFrame {
    private final AboutController ac;

    public AboutFrame(final AboutController ac) {
        super(GlobalSettings.getInstance().getTranslation().getTranslatedText("OoT Maps: About"));
        this.ac = ac;
    }

    public void init() {
        ac.getMainMenuController().setAboutOpen(true);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(final WindowEvent e) {
                ac.close();
            }
        });
        Container cp = getContentPane();
        setLayout(null);
        cp.setBackground(Color.WHITE);
        JLabel[] aboutTexts = ac.createAboutLabels();
        int lineHeight = 16;
        int lineWidth = 260;
        int verticalElementSpacer = ViewConstants.VERTICAL_ELEMENT_SPACER;
        int borderSpacer = ViewConstants.BORDER_SPACER;
        int amount = aboutTexts.length;
        for (int i = 0; i < amount; i++) {
            aboutTexts[i].setBounds(borderSpacer,
                    borderSpacer + (verticalElementSpacer * i) + (lineHeight * i), lineWidth, lineHeight);
            cp.add(aboutTexts[i]);
        }
        int frameWidth = (2 * borderSpacer) + lineWidth + ViewConstants.RIGHT_LAF_SPACER;
        int frameHeight = ViewConstants.TITLE_BAR_LAF_SPACER +
                (2 * borderSpacer) +
                (lineHeight * amount) +
                (verticalElementSpacer * (amount - 1));
        setSize(frameWidth, frameHeight);
        setResizable(false);
        setVisible(true);
    }
}
