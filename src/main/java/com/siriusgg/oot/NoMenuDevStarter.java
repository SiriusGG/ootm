package com.siriusgg.oot;

import com.siriusgg.oot.controller.CurrentLocationController;
import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.ExitMap;
import com.siriusgg.oot.model.places.exitmaps.*;
import com.siriusgg.oot.model.time.Age;
import com.siriusgg.oot.model.util.LAFHandler;

@SuppressWarnings("unused")
public class NoMenuDevStarter {
    public static void main(String[] args) {
        LAFHandler.setLAF();
        // DevTools devTools = DevTools.getInstance();
        // devTools.addDevMode(DevMode.TRANSITION_BUTTON_DRAGGABLE);
        String seedName = "devtest";
        ExitMap exitMap;
        if (Settings.getInstance(seedName).getTime().getAge() == Age.CHILD) {
            exitMap = new LinksHouse(seedName);
        } else {
            exitMap = new TempleOfTime(seedName);
        }
        CurrentLocationController clc = new CurrentLocationController(seedName, exitMap);
        clc.init();
        // clc.reposition(2000, 40);
    }
}
