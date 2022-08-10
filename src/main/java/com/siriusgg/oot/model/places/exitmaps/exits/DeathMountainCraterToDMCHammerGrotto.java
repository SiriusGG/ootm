package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class DeathMountainCraterToDMCHammerGrotto extends Exit {
    public DeathMountainCraterToDMCHammerGrotto(final ExitMap exitMap) {
        super(exitMap, ExitType.GROTTO_ENTRANCE);
        intendedAccessibleAsChild(false);
        intendedAccessibleAsAdult(true);
        setGrottoEntrance(GrottoEntrance.DMC_HAMMER_GROTTO);
        setBothSidePositions(new Position(73.0, 60.5));
        setBothTopPositions(new Position(12.5, 30.0));
    }
}
