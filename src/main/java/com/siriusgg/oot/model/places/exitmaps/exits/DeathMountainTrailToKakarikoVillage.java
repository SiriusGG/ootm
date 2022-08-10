package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class DeathMountainTrailToKakarikoVillage extends Exit {
    public DeathMountainTrailToKakarikoVillage(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.KAKARIKO_VILLAGE);
        setBothSidePositions(new Position(3.5, 66.0));
        setBothTopPositions(new Position(25.0, 90.0));
    }
}
