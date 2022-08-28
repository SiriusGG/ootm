package com.siriusgg.oot;

import com.siriusgg.oot.controller.CurrentLocationController;
import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.ExitMap;
import com.siriusgg.oot.model.places.exitmaps.Graveyard;
import com.siriusgg.oot.model.util.LAFHandler;

@SuppressWarnings("unused")
public class SpecificMapDevStarter {
    public static void main(String[] args) {
        LAFHandler.setLAF();
        // DevTools devTools = DevTools.getInstance();
        // devTools.addDevMode(DevMode.TRANSITION_BUTTON_DRAGGABLE);
        String seedName = "devtest";
        Settings s = Settings.getInstance(seedName);
        ExitMap exitMap = new Graveyard(seedName);
        CurrentLocationController clc = new CurrentLocationController(seedName, exitMap);
        clc.init();
        // clc.reposition(2000, 40);
    }
}
