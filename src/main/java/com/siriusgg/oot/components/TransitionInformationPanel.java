package com.siriusgg.oot.components;

import com.siriusgg.oot.model.places.Exit;

import javax.swing.*;
import java.awt.*;

public class TransitionInformationPanel extends JPanel {
    private final Exit exit;

    public TransitionInformationPanel(final Exit exit) {
        super();
        this.exit = exit;
        setLayout(null);
        setLocation(0, 0);
        setBackground(Color.GREEN);
        setVisible(true);
    }
}
