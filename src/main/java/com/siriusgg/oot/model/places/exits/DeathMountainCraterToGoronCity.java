package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class DeathMountainCraterToGoronCity extends Exit {
    public DeathMountainCraterToGoronCity(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.GORON_CITY);
        setBothSidePositions(new Position(67.1, 56.1));
        setBothTopPositions(new Position(1.0, 41.5));
    }
}
