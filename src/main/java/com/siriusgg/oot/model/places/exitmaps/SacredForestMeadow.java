package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;

public class SacredForestMeadow extends ExitMap {
    public SacredForestMeadow(final Settings settings) {
        super(settings);
        setName("Sacred Forest Meadow");
        initMap();
        setDungeonEntrancesAmount(1);
        setGrottoEntrancesAmount(3);
        setOverworldTransitionsAmount(1);
        initExits();
    }
}
