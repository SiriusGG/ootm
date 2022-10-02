package com.siriusgg.oot.controller;

import com.siriusgg.oot.util.*;
import com.siriusgg.oot.view.EnterSeedNameDialog;

import javax.swing.*;

public class EnterSeedNameController {
    private final JFrame owner;
    private String seedName;

    public EnterSeedNameController(final JFrame owner) {
        this.owner = owner;
    }

    public boolean init() {
        new EnterSeedNameDialog(this, owner, "Enter seed name", true);
        return seedName != null;
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

    public void buttonConfirm(final EnterSeedNameDialog enterSeedNameDialog, final String possibleSeedName) {
        String result = StringFunctions.removeSpecialCharacters(possibleSeedName);
        if (result != null && !result.equals("")) {
            if (SaveLoad.seedIsValid(result)) {
                SeedNameExistsController snec = new SeedNameExistsController(owner, result);
                boolean overwritten = snec.init();
                if (overwritten) {
                    seedName = result;
                    enterSeedNameDialog.dispose();
                }
            } else {
                seedName = result;
                enterSeedNameDialog.dispose();
            }
        }
    }
}
