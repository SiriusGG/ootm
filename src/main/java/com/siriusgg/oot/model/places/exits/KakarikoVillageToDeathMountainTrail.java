package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class KakarikoVillageToDeathMountainTrail extends Exit {
    public KakarikoVillageToDeathMountainTrail(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.DEATH_MOUNTAIN_TRAIL);
        setBothSidePositions(new Position(9.53, 19.0));
        setBothTopPositions(new Position(55.7, 3.48));
    }
}
