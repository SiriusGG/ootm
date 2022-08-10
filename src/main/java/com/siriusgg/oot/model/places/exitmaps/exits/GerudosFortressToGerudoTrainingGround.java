package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class GerudosFortressToGerudoTrainingGround extends Exit {
    public GerudosFortressToGerudoTrainingGround(final ExitMap exitMap) {
        super(exitMap, ExitType.DUNGEON_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDungeonEntrance(DungeonEntrance.GERUDO_TRAINING_GROUND);
        setBothSidePositions(new Position(42.8, 78.75));
        setBothTopPositions(new Position(34.0, 60.5));
    }
}
