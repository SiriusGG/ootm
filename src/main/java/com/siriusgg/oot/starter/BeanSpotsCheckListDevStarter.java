package com.siriusgg.oot.starter;

import com.siriusgg.oot.controller.*;
import com.siriusgg.oot.model.places.ExitMap;
import com.siriusgg.oot.model.places.exitmaps.*;
import com.siriusgg.oot.model.util.LAFHandler;

@SuppressWarnings("unused")
public class BeanSpotsCheckListDevStarter {
    public static void main(String[] args) {
        LAFHandler.setLAF();
        String seedName = "devtest";
        ExitMap exitMap = new LinksHouse(seedName);
        CurrentLocationController clc = new CurrentLocationController(seedName, exitMap);
        clc.init();
        BeanSpotCheckListController bsclc = new BeanSpotCheckListController(seedName, clc.getFrame());
        bsclc.init();
    }
}
