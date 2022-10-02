package com.siriusgg.oot.starter;

import com.siriusgg.oot.controller.*;
import com.siriusgg.oot.model.places.ExitMap;
import com.siriusgg.oot.model.places.exitmaps.*;
import com.siriusgg.oot.util.LAFHandler;

@SuppressWarnings("unused")
public class ShopsDevStarter {
    public static void main(final String[] args) {
        LAFHandler.setLAF();
        String seedName = "devtest";
        ExitMap exitMap = new LinksHouse(seedName);
        CurrentLocationController clc = new CurrentLocationController(seedName, exitMap);
        clc.init();
        ShopsController sc = new ShopsController(seedName, clc);
        sc.init();
    }
}
