package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class GoronCityToDeathMountainCrater extends Exit {
    public GoronCityToDeathMountainCrater(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.DEATH_MOUNTAIN_CRATER);
        setBothSidePositions(new Position(79.52, 80.79));
        setChildTopPosition(new Position(55.22, 0.46));
        setAdultTopPosition(new Position(54.92, 3.59));
    }
}
