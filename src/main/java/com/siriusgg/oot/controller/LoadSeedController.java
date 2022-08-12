package com.siriusgg.oot.controller;

import com.siriusgg.oot.model.util.SaveLoad;
import com.siriusgg.oot.view.LoadSeedDialog;

import javax.swing.*;

public class LoadSeedController {
    private final MainMenuController mmc;
    private String seedName = null;

    public LoadSeedController(final MainMenuController mmc) {
        this.mmc = mmc;
    }

    public void init() {
        new LoadSeedDialog(this);
    }

    public String getSeedName() {
        return seedName;
    }

    public void fillSeedsList(final DefaultListModel<String> listModel) {
        String[] seedNameOptions = SaveLoad.getSeedNames();
        for (String seedNameOption : seedNameOptions) {
            listModel.addElement(seedNameOption);
        }
    }

    public MainMenuController getMainMenuController() {
        return mmc;
    }

    public void buttonConfirm(final String seedName) {
        if (seedName != null && !seedName.equals("")) this.seedName = seedName;
        else throw new IllegalArgumentException("seedName may not be null or empty.");
    }
}
