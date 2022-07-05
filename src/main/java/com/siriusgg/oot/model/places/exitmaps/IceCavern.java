package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;

public class IceCavern extends ExitMap {
    public IceCavern(final Settings settings) {
        super(settings);
        setName("Ice Cavern");
        initMap();
        setDungeonExitsAmount(1);
        initExits();
        setExit(new IceCavernToZorasFountain(), 0);
    }

    private static class IceCavernToZorasFountain extends Exit {
        public IceCavernToZorasFountain() {
            super(ExitType.DUNGEON_EXIT);
            setCanBeUsedAsChild(true);
            setCanBeUsedAsAdult(true);
            setDungeonExit(DungeonExit.ICE_CAVERN);
        }
    }
}
