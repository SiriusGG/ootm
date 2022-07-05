package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;

public class MarketEntrance extends ExitMap {
    public MarketEntrance(final Settings settings) {
        super(settings);
        setName("Market Entrance");
        initMap();
        setDoorEntrancesAmount(1);
        setOverworldTransitionsAmount(2);
        initExits();
    }
}
