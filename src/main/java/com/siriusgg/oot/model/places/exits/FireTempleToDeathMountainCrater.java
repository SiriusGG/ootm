package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class FireTempleToDeathMountainCrater extends Exit {
    public FireTempleToDeathMountainCrater(final ExitMap exitMap) {
        super(exitMap, ExitType.DUNGEON_EXIT);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDungeonExit(DungeonExit.FIRE_TEMPLE);
        setBothSidePositions(new Position(40.3, 85.0));
        setBothTopPositions(new Position(46.5, 90.0));
    }
}
