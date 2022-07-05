package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;

public class ZorasDomain extends ExitMap {
    public ZorasDomain(final Settings settings) {
        super(settings);
        setName("Zora's Domain");
        initMap();
        setDoorEntrancesAmount(1);
        setGrottoEntrancesAmount(1);
        setOverworldTransitionsAmount(3);
        initExits();
    }
}
