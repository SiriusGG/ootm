package com.siriusgg.oot.controller;

import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.util.SaveLoad;
import com.siriusgg.oot.view.LoadSeedDialog;

import javax.swing.*;

public class LoadSeedController {
    private final MainMenuController mmc;
    private final Translation t;
    private String seedName = null;

    public LoadSeedController(final MainMenuController mmc) {
        this.mmc = mmc;
        t = GlobalSettings.getInstance().getTranslation();
    }

    public void init() {
        new LoadSeedDialog(this, t.getTranslatedText("Select seed"));
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

    public void confirm(final String seedName) {
        if (seedName != null && !seedName.equals("")) this.seedName = seedName;
        else throw new IllegalArgumentException("seedName may not be null or empty.");
    }
}
