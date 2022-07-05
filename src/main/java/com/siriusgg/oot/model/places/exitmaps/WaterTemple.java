package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;

public class WaterTemple extends ExitMap {
    public WaterTemple(final Settings settings) {
        super(settings);
        setName("Water Temple");
        initMap();
        setDungeonExitsAmount(1);
        initExits();
        setExit(new WaterTempleToLakeHylia(), 0);
    }

    private static class WaterTempleToLakeHylia extends Exit {
        public WaterTempleToLakeHylia() {
            super(ExitType.DUNGEON_EXIT);
            setCanBeUsedAsChild(true);
            setCanBeUsedAsAdult(true);
            setDungeonExit(DungeonExit.WATER_TEMPLE);
        }
    }
}
