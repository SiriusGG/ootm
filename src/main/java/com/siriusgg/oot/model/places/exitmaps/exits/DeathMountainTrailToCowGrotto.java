package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class DeathMountainTrailToCowGrotto extends Exit {
    public DeathMountainTrailToCowGrotto(final ExitMap exitMap) {
        super(exitMap, ExitType.GROTTO_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setGrottoEntrance(GrottoEntrance.DMT_COW_GROTTO);
        setBothSidePositions(new Position(38.0, 52.5));
        setBothTopPositions(new Position(38.0, 62.0));
    }
}
