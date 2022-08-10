package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class DeathMountainTrailToDeathMountainCrater extends Exit {
    public DeathMountainTrailToDeathMountainCrater(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.DEATH_MOUNTAIN_CRATER);
        setBothSidePositions(new Position(76.0, 20.0));
        setBothTopPositions(new Position(63.0, 9.0));
    }
}
