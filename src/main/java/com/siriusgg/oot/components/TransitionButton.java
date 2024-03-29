package com.siriusgg.oot.components;

import com.siriusgg.oot.model.places.Exit;

import javax.swing.*;

public class TransitionButton extends JButton {
    private final Exit exit;

    public TransitionButton(final Exit exit) {
        super();
        this.exit = exit;
    }

    public Exit getExit() {
        return exit;
    }
}
