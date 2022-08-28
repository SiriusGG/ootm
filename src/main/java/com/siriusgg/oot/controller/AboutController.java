package com.siriusgg.oot.controller;

import com.siriusgg.oot.model.Constants;
import com.siriusgg.oot.model.util.ComponentFunctions;
import com.siriusgg.oot.view.AboutFrame;

import javax.swing.*;

public class AboutController {
    private final int aboutLinesAmount = 13;
    private String[] texts;

    public AboutController() {}

    public void init() {
        AboutFrame af = new AboutFrame(this);
        af.init();
        ComponentFunctions.center(af);
    }

    private void initAboutTexts() {
        texts = new String[aboutLinesAmount];
        texts[0] = "OoT Maps version " + Constants.VERSION;
        texts[1] = "";
        texts[2] = "Developed by";
        texts[3] = Constants.DEVELOPERS[0];
        texts[4] = "";
        texts[5] = "Maps by";
        texts[6] = Constants.MAPS_CREATORS[0];
        texts[7] = Constants.MAPS_CREATORS[1];
        texts[8] = "";
        texts[9] = "Special thanks to";
        texts[10] = Constants.MAPS_ORIGINS[0];
        texts[11] = Constants.EXTRA_SPECIAL_THANKS[0];
        texts[12] = Constants.EXTRA_SPECIAL_THANKS[1];
    }

    public JLabel[] createAboutLabels() {
        initAboutTexts();
        JLabel[] aboutLabels = new JLabel[aboutLinesAmount];
        for (int i = 0; i < aboutLinesAmount; i++) {
            aboutLabels[i] = new JLabel(texts[i]);
            aboutLabels[i].setHorizontalAlignment(JLabel.CENTER);
        }
        return aboutLabels;
    }
}
