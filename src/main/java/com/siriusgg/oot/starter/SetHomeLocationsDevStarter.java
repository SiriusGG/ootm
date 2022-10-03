package com.siriusgg.oot.starter;

import com.siriusgg.oot.controller.*;
import com.siriusgg.oot.model.SeedSettings;
import com.siriusgg.oot.model.places.ExitMap;
import com.siriusgg.oot.model.time.Age;
import com.siriusgg.oot.util.LAFHandler;

@SuppressWarnings("unused")
public class SetHomeLocationsDevStarter {
    public static void main(String[] args) {
        LAFHandler.setLAF();
        String seedName = "devtest";
        SeedSettings ss = SeedSettings.getInstance(seedName);
        ExitMap exitMap;
        if (ss.getTime().getAge() == Age.CHILD) {
            exitMap = ExitMap.fromPlaceWithMap(ss.getChildHomeLocation(), seedName);
        } else {
            exitMap = ExitMap.fromPlaceWithMap(ss.getAdultHomeLocation(), seedName);
        }
        CurrentLocationController clc = new CurrentLocationController(seedName, exitMap);
        clc.init();
        SetHomeLocationController shlc = new SetHomeLocationController(seedName, clc.getFrame(), Age.CHILD);
        shlc.init();
    }
}
