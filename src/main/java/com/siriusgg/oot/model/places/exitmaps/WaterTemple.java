package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.places.*;

public class WaterTemple extends ExitMap {
    public WaterTemple() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[35]);
        initMap();
        setDungeonExitsAmount(1);
        initExits();
        setExit(new WaterTempleToLakeHylia(), 0);
    }

    private static class WaterTempleToLakeHylia extends Exit {
        public WaterTempleToLakeHylia() {
            super(ExitType.DUNGEON_EXIT);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDungeonExit(DungeonExit.WATER_TEMPLE);
        }
    }
}
