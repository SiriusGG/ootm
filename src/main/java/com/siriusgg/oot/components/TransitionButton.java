package com.siriusgg.oot.components;

import com.siriusgg.oot.model.places.Exit;

import javax.swing.*;

public class TransitionButton extends JButton {
    final Exit exit;

    public TransitionButton(final Exit exit) {
        super();
        this.exit = exit;
    }
}
