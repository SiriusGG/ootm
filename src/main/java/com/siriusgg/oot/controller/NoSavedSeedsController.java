package com.siriusgg.oot.controller;

import com.siriusgg.oot.constants.OoTMConstants;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.translation.Translation;
import com.siriusgg.oot.view.NoSavedSeedsDialog;

public class NoSavedSeedsController {
    private final MainMenuController mmc;
    private final Translation t;

    public NoSavedSeedsController(final MainMenuController mmc) {
        this.mmc = mmc;
        t = GlobalSettings.getInstance().getTranslation();
    }

    public void init() {
        new NoSavedSeedsDialog(this, t.getTranslatedText("No saved seeds"));
    }

    public MainMenuController getMainMenuController() {
        return mmc;
    }

    public String getSeedDirectory() {
        return OoTMConstants.USER_HOME + "/" + OoTMConstants.SAVE_DIRECTORY;
    }
}
