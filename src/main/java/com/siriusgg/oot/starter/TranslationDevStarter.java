package com.siriusgg.oot.starter;

import com.siriusgg.oot.controller.MainMenuController;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.util.LAFHandler;

public class TranslationDevStarter {
    public static void main(final String[] args) {
        LAFHandler.setLAF();
        GlobalSettings.getInstance().setTranslation(Translation.GERMAN);
        MainMenuController mmc = new MainMenuController();
        mmc.init();
    }
}
