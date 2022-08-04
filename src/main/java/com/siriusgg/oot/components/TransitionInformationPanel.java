package com.siriusgg.oot.components;

import com.siriusgg.oot.exception.*;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.util.PositionExpander;

import javax.swing.*;
import java.awt.*;

public class TransitionInformationPanel extends JPanel {
    public static final int TRANSITION_INFORMATION_PANEL_WIDTH = 200;
    public static final int TRANSITION_INFORMATION_PANEL_HEIGHT = 150;

    private final Exit exit;

    public TransitionInformationPanel(final Exit exit) {
        super();
        this.exit = exit;
        setLayout(null);
        setSize(TRANSITION_INFORMATION_PANEL_WIDTH, TRANSITION_INFORMATION_PANEL_HEIGHT);
        Position origPos = null;
        try {
            origPos = PositionExpander.expand(exit.getPosition());
        } catch (final UnknownAgeException | UnknownPerspectiveException e) {
            origPos = new Position(0.0, 0.0);
        }
        setLocation((int)origPos.getX(), (int)origPos.getY());
        setBackground(Color.GREEN);
        setVisible(true);
        // ToDo
    }
}
