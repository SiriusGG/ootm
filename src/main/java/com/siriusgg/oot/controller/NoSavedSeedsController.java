package com.siriusgg.oot.controller;

import com.siriusgg.oot.model.BuildData;
import com.siriusgg.oot.view.NoSavedSeedsDialog;

public class NoSavedSeedsController {
    private final MainMenuController mmc;
    public NoSavedSeedsController(final MainMenuController mmc) {
        this.mmc = mmc;
    }

    public void init() {
        new NoSavedSeedsDialog(this);
    }

    public MainMenuController getMainMenuController() {
        return mmc;
    }

    public String getSeedDirectory() {
        return BuildData.USER_HOME + "/" + BuildData.SAVE_DIRECTORY;
    }
}
