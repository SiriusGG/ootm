package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class DeathMountainTrailOwl extends Exit {
    public DeathMountainTrailOwl(final ExitMap exitMap) {
        super(exitMap, ExitType.OWL_START);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(false);
        setOwlStart(OwlStart.DEATH_MOUNTAIN_TRAIL);
        setChildSidePosition(new Position(73.0, 23.5));
        setChildTopPosition(new Position(53.0, 21.5));
    }
}
