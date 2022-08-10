package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class DeathMountainTrailToStormsGrotto extends Exit {
    public DeathMountainTrailToStormsGrotto(final ExitMap exitMap) {
        super(exitMap, ExitType.GROTTO_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setGrottoEntrance(GrottoEntrance.DMT_STORMS_GROTTO);
        setBothSidePositions(new Position(47.0, 58.8));
        setBothTopPositions(new Position(80.0, 75.0));
    }
}
