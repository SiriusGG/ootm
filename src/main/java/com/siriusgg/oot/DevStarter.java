package com.siriusgg.oot;

import com.siriusgg.oot.controller.CurrentLocationController;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exitmaps.*;
import com.siriusgg.oot.model.time.Age;
import com.siriusgg.oot.model.util.LAFHandler;

public class DevStarter {
    public static void main(String[] args) {
        LAFHandler.setLAF();
        PermanentlyLoadedInformation pli = PermanentlyLoadedInformation.getInstance();
        String seedName = "devtest";
        Settings s = Settings.getInstance(seedName);
        ExitMap exitMap;
        if (s.getTime().getAge() == Age.CHILD) {
            exitMap = new LinksHouse(seedName);
        } else {
            exitMap = new TempleOfTime(seedName);
        }
        CurrentLocationController clc = new CurrentLocationController(seedName, exitMap);
        clc.init();
        // clc.reposition(2000, 40);
    }
}
