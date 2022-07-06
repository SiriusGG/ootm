package com.siriusgg.oot;

import com.siriusgg.oot.controller.MainMenuController;
import com.siriusgg.oot.model.places.PermanentlyLoadedInformation;

public class Starter {
    public static void main(String[] args) {
        showSplashscreen();
        PermanentlyLoadedInformation.getInstance();
        MainMenuController mmc = new MainMenuController();
        hideSplashscreen();
        mmc.init();
    }

    private static void showSplashscreen() {
    }

    private static void hideSplashscreen() {
    }
}
