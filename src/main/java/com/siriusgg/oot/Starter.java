package com.siriusgg.oot;

import com.siriusgg.oot.controller.MainMenuController;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.util.LAFHandler;

public class Starter {
    public static void main(String[] args) {
        LAFHandler.setLAF();
        PermanentlyLoadedInformation.getInstance();
        MainMenuController mmc = new MainMenuController();
        mmc.init();
    }
}
