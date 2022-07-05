package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;

public class ZorasRiver extends ExitMap {
    public ZorasRiver(final Settings settings) {
        super(settings);
        setName("Zora's River");
        initMap();
        setGrottoEntrancesAmount(3);
        setOverworldTransitionsAmount(3);
        initExits();
    }
}
