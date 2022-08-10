package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class LostWoodsToSacredForestMeadow extends Exit {
    public LostWoodsToSacredForestMeadow(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.SACRED_FOREST_MEADOW);
        setBothSidePositions(new Position(86.59, 29.42));
        setBothTopPositions(new Position(53.72, 4.98));
    }
}
