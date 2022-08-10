package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class DodongosCavernToDeathMountainTrail extends Exit {
    public DodongosCavernToDeathMountainTrail(final ExitMap exitMap) {
        super(exitMap, ExitType.DUNGEON_EXIT);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDungeonExit(DungeonExit.DODONGOS_CAVERN);
        setBothSidePositions(new Position(11.3, 73.3));
        setBothTopPositions(new Position(30.5, 92.0));
    }
}
