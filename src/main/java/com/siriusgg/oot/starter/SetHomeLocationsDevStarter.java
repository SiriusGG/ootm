package com.siriusgg.oot.starter;

import com.siriusgg.oot.controller.*;
import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.ExitMap;
import com.siriusgg.oot.model.places.exitmaps.*;
import com.siriusgg.oot.model.time.Age;
import com.siriusgg.oot.model.util.LAFHandler;

@SuppressWarnings("unused")
public class SetHomeLocationsDevStarter {
    public static void main(String[] args) {
        LAFHandler.setLAF();
        String seedName = "devtest";
        Settings s = Settings.getInstance(seedName);
        ExitMap exitMap = new LostWoods(seedName);
        CurrentLocationController clc = new CurrentLocationController(seedName, exitMap);
        clc.init();
        SetHomeLocationController shlc = new SetHomeLocationController(seedName, clc.getFrame(), Age.CHILD);
        shlc.init();
    }
}
