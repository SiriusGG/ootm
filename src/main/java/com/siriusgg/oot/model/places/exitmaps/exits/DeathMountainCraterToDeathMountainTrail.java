package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class DeathMountainCraterToDeathMountainTrail extends Exit {
    public DeathMountainCraterToDeathMountainTrail(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.DEATH_MOUNTAIN_TRAIL);
        setBothSidePositions(new Position(32.0, 32.0));
        setBothTopPositions(new Position(3.5, 93.7));
    }
}
