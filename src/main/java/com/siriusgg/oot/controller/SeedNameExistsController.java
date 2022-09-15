package com.siriusgg.oot.controller;

import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.util.SaveLoad;
import com.siriusgg.oot.view.SeedNameExistsDialog;

import javax.swing.*;

public class SeedNameExistsController {
    private final JFrame owner;
    private final String seedName;
    private final Translation t;
    private boolean overwritten = false;

    public SeedNameExistsController(final JFrame owner, final String seedName) {
        this.owner = owner;
        this.seedName = seedName;
        t = GlobalSettings.getInstance().getTranslation();
    }

    public boolean init() {
        new SeedNameExistsDialog(this, t.getTranslatedText("Seed name exists"));
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
