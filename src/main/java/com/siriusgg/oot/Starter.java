package com.siriusgg.oot;

import com.siriusgg.oot.controller.MainMenuController;
import com.siriusgg.oot.model.PermanentlyLoadedInformation;
import com.siriusgg.oot.model.util.FileFunctions;

public class Starter {
    public static void main(String[] args) {
        showSplashscreen();
        PermanentlyLoadedInformation.getInstance();
        FileFunctions.getInstance();
        MainMenuController mmc = new MainMenuController();
        hideSplashscreen();
        mmc.init();
    }

    private static void showSplashscreen() {
        // ToDo
    }

    private static void hideSplashscreen() {
        // ToDo
    }
}
