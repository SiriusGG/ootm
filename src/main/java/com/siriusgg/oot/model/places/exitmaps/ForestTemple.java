package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.places.*;

public class ForestTemple extends ExitMap {
    public ForestTemple() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[7]);
        initMap();
        setDungeonExitsAmount(1);
        initExits();
        setExit(new ForestTempleToSFM(), 0);
    }

    private static class ForestTempleToSFM extends Exit {
        public ForestTempleToSFM() {
            super(ExitType.DUNGEON_EXIT);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDungeonExit(DungeonExit.FOREST_TEMPLE);
        }
    }
}
