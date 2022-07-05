package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;

public class KokiriForest extends ExitMap {
    public KokiriForest(final Settings settings) {
        super(settings);
        setName("Kokiri Forest");
        initMap();
        setDoorEntrancesAmount(6);
        setDungeonEntrancesAmount(1);
        setGrottoEntrancesAmount(1);
        setOverworldTransitionsAmount(2);
        initExits();
    }
}
