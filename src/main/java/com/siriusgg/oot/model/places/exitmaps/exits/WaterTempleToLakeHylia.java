package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class WaterTempleToLakeHylia extends Exit {
    public WaterTempleToLakeHylia(final ExitMap exitMap) {
        super(exitMap, ExitType.DUNGEON_EXIT);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDungeonExit(DungeonExit.WATER_TEMPLE);
        setBothSidePositions(new Position(39.46, 60.42));
        setBothTopPositions(new Position(40.06, 69.33));
    }
}
