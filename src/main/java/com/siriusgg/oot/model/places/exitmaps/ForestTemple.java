package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;

public class ForestTemple extends ExitMap {
    public ForestTemple(final Settings settings) {
        super(settings);
        setName("Forest Temple");
        initMap();
        setDungeonExitsAmount(1);
        initExits();
        setExit(new ForestTempleToSFM(), 0);
    }

    private static class ForestTempleToSFM extends Exit {
        public ForestTempleToSFM() {
            super(ExitType.DUNGEON_EXIT);
            setCanBeUsedAsChild(true);
            setCanBeUsedAsAdult(true);
            setDungeonExit(DungeonExit.FOREST_TEMPLE);
        }
    }
}
