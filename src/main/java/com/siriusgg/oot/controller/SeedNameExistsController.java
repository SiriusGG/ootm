package com.siriusgg.oot.controller;

import com.siriusgg.oot.model.util.SaveLoad;
import com.siriusgg.oot.view.SeedNameExistsDialog;

import javax.swing.*;

public class SeedNameExistsController {
    private final JFrame owner;
    private final String seedName;
    private boolean overwritten = false;

    public SeedNameExistsController(final JFrame owner, final String seedName) {
        this.owner = owner;
        this.seedName = seedName;
    }

    public boolean init() {
        new SeedNameExistsDialog(this);
        return overwritten;
    }

    public JFrame getFrame() {
        return owner;
    }

    public String getSeedName() {
        return seedName;
    }

    public void overwrite() {
        SaveLoad.deleteSeed(seedName);
        overwritten = true;
    }
}
