package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class GoronCityToDeathMountainTrail extends Exit {
    public GoronCityToDeathMountainTrail(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.DEATH_MOUNTAIN_TRAIL);
        setBothSidePositions(new Position(17.5, 25.23));
        setChildTopPosition(new Position(53.9, 92.71));
        setAdultTopPosition(new Position(53.45, 92.94));
    }
}
