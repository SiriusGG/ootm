package com.siriusgg.oot.components;

import com.siriusgg.oot.constants.*;
import com.siriusgg.oot.controller.CurrentLocationController;
import com.siriusgg.oot.exception.*;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exitmaps.TempleOfTime;
import com.siriusgg.oot.model.time.Age;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.Objects;

public class TimeSwitchButton extends JButton {
    private final CurrentLocationController clc;
    private final String seedName;
    private final SeedSettings s;

    public TimeSwitchButton(final String seedName, final TempleOfTime tot, final JLayeredPane layeredPane,
                            final CurrentLocationController clc) {
        super();
        setVisible(false);
        this.clc = clc;
        this.seedName = seedName;
        s = SeedSettings.getInstance(seedName);
        String graphicPath;
        if (s.getTime().getAge() == Age.CHILD) graphicPath = OoTMConstants.SYMBOL_DIRECTORY + "/master_sword.jpg";
        else graphicPath = OoTMConstants.SYMBOL_DIRECTORY + "/pedestal_of_time.jpg";
        int buttonWidth;
        int buttonHeight;
        try {
            buttonWidth = tot.getPreferredButtonWidth();
            buttonHeight = tot.getPreferredButtonHeight();
        } catch (final UnknownPerspectiveException e) {
            e.printStackTrace();
            buttonWidth = ViewConstants.DEFAULT_TRANSITION_BUTTON_WIDTH;
            buttonHeight = ViewConstants.DEFAULT_TRANSITION_BUTTON_HEIGHT;
        }
        setSize(buttonWidth, buttonHeight);
        double xPosScale = 0;
        double yPosScale = 0;
        if (s.getPerspective() == Perspective.SIDE) {
            xPosScale = 70.93;
            yPosScale = 64.35;
        } else if (s.getPerspective() == Perspective.TOP) {
            xPosScale = 78.26;
            yPosScale = 45.16;
        }
        int x = (int) (layeredPane.getWidth() * (xPosScale / 100));
        int y = (int) (layeredPane.getHeight() * (yPosScale / 100));
        setLocation(x, y);
        ImageIcon masterSwordOrig;
        try {
            masterSwordOrig = new ImageIcon(ImageIO.read(Objects.requireNonNull(
                    getClass().getClassLoader().getResource(graphicPath))));
            setIcon(new ImageIcon(masterSwordOrig.getImage().getScaledInstance(
                    buttonWidth, buttonHeight, Image.SCALE_SMOOTH)));
        } catch (final IOException e) {
            e.printStackTrace();
        }
        addActionListener(this::timeSwitchButtonActionPerformed);
        setVisible(true);
    }

    private void timeSwitchButtonActionPerformed(final ActionEvent actionEvent) {
        s.getTime().switchAge();
        SeedSettings.saveSeedSettings(seedName, s);
        try {
            clc.reInit(ExitMap.fromString(clc.getExitMap().getNiceName(), seedName));
        } catch (final UnknownPlaceWithMapStringException e) {
            e.printStackTrace();
        }
    }
}
