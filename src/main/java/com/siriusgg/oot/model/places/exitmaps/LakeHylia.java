package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;

public class LakeHylia extends ExitMap {
    public LakeHylia(final Settings settings) {
        super(settings);
        setName("Lake Hylia");
        initMap();
        setDoorEntrancesAmount(2);
        setDungeonEntrancesAmount(1);
        setGrottoEntrancesAmount(1);
        setOverworldTransitionsAmount(1);
        setHasOwlStart(true);
        initExits();
    }
}
