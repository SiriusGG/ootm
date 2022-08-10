package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class DeathMountainTrailToDodongosCavern extends Exit {
    public DeathMountainTrailToDodongosCavern(final ExitMap exitMap) {
        super(exitMap, ExitType.DUNGEON_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDungeonEntrance(DungeonEntrance.DODONGOS_CAVERN);
        setBothSidePositions(new Position(37.3, 33.8));
        setBothTopPositions(new Position(16.0, 60.0));
    }
}
