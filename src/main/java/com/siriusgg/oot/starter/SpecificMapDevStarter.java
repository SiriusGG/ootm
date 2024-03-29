package com.siriusgg.oot.starter;

import com.siriusgg.oot.controller.CurrentLocationController;
import com.siriusgg.oot.model.SeedSettings;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exitmaps.*;
import com.siriusgg.oot.model.time.Age;
import com.siriusgg.oot.util.*;

@SuppressWarnings("unused")
public class SpecificMapDevStarter {
    public static void main(String[] args) {
        LAFHandler.setLAF();
        // DevTools devTools = DevTools.getInstance();
        // devTools.addDevMode(DevMode.TRANSITION_BUTTON_DRAGGABLE);
        String seedName = "devtest";
        SeedSettings s = SeedSettings.getInstance(seedName);
        s.getTime().setAge(Age.CHILD);
        // s.getTime().setAge(Age.ADULT);
        // s.setPerspective(Perspective.SIDE);
        s.setPerspective(Perspective.TOP);
        ExitMap exitMap = new SacredForestMeadow(seedName);
        CurrentLocationController clc = new CurrentLocationController(seedName, exitMap);
        clc.init();
        // clc.reposition(2000, 40);
    }
}
