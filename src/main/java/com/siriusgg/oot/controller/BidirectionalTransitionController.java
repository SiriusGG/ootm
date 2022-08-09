package com.siriusgg.oot.controller;

import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.view.BidirectionalTransitionDialog;

import javax.swing.*;

public class BidirectionalTransitionController {
    private final JFrame ownerFrame;
    private final Exit exit;
    private final String connection;

    public BidirectionalTransitionController(final JFrame ownerFrame, final Exit exit, final String connection) {
        this.ownerFrame = ownerFrame;
        this.exit = exit;
        this.connection = connection;
    }

    public void init() {
        new BidirectionalTransitionDialog(exit, ownerFrame, "Add Transition Exit", true, connection);
    }
}
