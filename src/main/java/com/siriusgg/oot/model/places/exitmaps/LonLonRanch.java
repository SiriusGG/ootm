package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;

public class LonLonRanch extends ExitMap {
    public LonLonRanch(final Settings settings) {
        super(settings);
        setName("Lon Lon Ranch");
        initMap();
        setDoorEntrancesAmount(3);
        setGrottoEntrancesAmount(1);
        setOverworldTransitionsAmount(1);
        initExits();
    }
}
