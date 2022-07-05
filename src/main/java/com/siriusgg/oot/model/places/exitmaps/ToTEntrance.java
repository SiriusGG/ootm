package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;

public class ToTEntrance extends ExitMap {
    public ToTEntrance(final Settings settings) {
        super(settings);
        setName("Temple of Time Entrance");
        initMap();
        setOverworldTransitionsAmount(1);
        setDoorEntrancesAmount(1);
        initExits();
    }
}
