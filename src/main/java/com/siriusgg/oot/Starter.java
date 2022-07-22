package com.siriusgg.oot;

import com.siriusgg.oot.controller.MainMenuController;
import com.siriusgg.oot.model.*;

public class Starter {
    public static void main(String[] args) {
        PermanentlyLoadedInformation.getInstance();
        MainMenuController mmc = new MainMenuController();
        mmc.init();
    }
}
