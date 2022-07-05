package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;

public class Market extends ExitMap {
    public Market(final Settings settings) {
        super(settings);
        setName("Market");
        initMap();
        setDoorEntrancesAmount(9);
        setOverworldTransitionsAmount(3);
        initExits();
    }
}
