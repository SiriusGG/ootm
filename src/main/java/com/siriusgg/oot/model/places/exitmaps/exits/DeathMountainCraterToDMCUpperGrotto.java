package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class DeathMountainCraterToDMCUpperGrotto extends Exit {
    public DeathMountainCraterToDMCUpperGrotto(final ExitMap exitMap) {
        super(exitMap, ExitType.GROTTO_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setGrottoEntrance(GrottoEntrance.DMC_UPPER_GROTTO);
        setBothSidePositions(new Position(23.5, 43.0));
        setBothTopPositions(new Position(44.8, 75.0));
    }
}
