package com.siriusgg.oot.controller;

import com.siriusgg.oot.view.EnterSeedNameDialog;

import javax.swing.*;

public class EnterSeedNameController {
    private final JFrame owner;
    private String seedName;

    public EnterSeedNameController(final JFrame owner) {
        this.owner = owner;
    }

    public void init() {
        new EnterSeedNameDialog(this, owner, "Enter seed name", true);
    }

    public String getSeedName() {
        return seedName;
    }

    public void setSeedName(final String seedName) {
        this.seedName = seedName;
    }

    public JFrame getFrame() {
        return owner;
    }
}
