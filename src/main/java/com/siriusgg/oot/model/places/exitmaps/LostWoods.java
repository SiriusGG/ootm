package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;

public class LostWoods extends ExitMap {
    public LostWoods(final Settings settings) {
        super(settings);
        setName("Lost Woods");
        initMap();
        setGrottoEntrancesAmount(3);
        setOverworldTransitionsAmount(6);
        initExits();
    }
}
