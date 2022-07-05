package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Settings;

public class KakarikoVillage extends ExitMap {
    public KakarikoVillage(final Settings settings) {
        super(settings);
        setName("Kakariko Village");
        initMap();
        setDoorEntrancesAmount(10);
        setDungeonEntrancesAmount(1);
        setGrottoEntrancesAmount(2);
        setOverworldTransitionsAmount(3);
        setHasOwlLanding(true);
        initExits();
    }
}
