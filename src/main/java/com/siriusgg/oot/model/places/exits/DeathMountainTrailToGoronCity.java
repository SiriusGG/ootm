package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class DeathMountainTrailToGoronCity extends Exit {
    public DeathMountainTrailToGoronCity(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.GORON_CITY);
        setBothSidePositions(new Position(54.3, 57.5));
        setBothTopPositions(new Position(80.0, 66.0));
    }
}
