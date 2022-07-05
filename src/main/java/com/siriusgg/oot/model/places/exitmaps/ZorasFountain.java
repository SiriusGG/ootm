package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;

public class ZorasFountain extends ExitMap {
    public ZorasFountain(final Settings settings) {
        super(settings);
        setName("Zora's Fountain");
        initMap();
        setDoorEntrancesAmount(1);
        setDungeonEntrancesAmount(2);
        setOverworldTransitionsAmount(1);
        initExits();
    }
}
