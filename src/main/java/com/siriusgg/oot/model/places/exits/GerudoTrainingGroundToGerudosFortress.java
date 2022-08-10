package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class GerudoTrainingGroundToGerudosFortress extends Exit {
    public GerudoTrainingGroundToGerudosFortress(final ExitMap exitMap) {
        super(exitMap, ExitType.DUNGEON_EXIT);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDungeonExit(DungeonExit.GERUDO_TRAINING_GROUND);
        setBothSidePositions(new Position(22.79, 64.85));
        setBothTopPositions(new Position(40.3, 91.44));
    }
}
