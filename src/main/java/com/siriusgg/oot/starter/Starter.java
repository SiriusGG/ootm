package com.siriusgg.oot.starter;

import com.siriusgg.oot.controller.MainMenuController;
import com.siriusgg.oot.model.util.LAFHandler;

public class Starter {
    public static void main(String[] args) {
        LAFHandler.setLAF();
        MainMenuController mmc = new MainMenuController();
        mmc.init();
    }
}
