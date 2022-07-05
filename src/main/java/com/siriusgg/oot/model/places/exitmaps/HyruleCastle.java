package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;

public class HyruleCastle extends ExitMap {
    public HyruleCastle(final Settings settings) {
        super(settings);
        setName("Hyrule Castle");
        initMap();
        setDoorEntrancesAmount(2);
        setDungeonEntrancesAmount(1);
        setGrottoEntrancesAmount(1);
        setOverworldTransitionsAmount(1);
        initExits();
    }
}
