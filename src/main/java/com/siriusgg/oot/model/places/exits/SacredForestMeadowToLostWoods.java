package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class SacredForestMeadowToLostWoods extends Exit {
    public SacredForestMeadowToLostWoods(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.LOST_WOODS);
        setBothSidePositions(new Position(5.13, 92.13));
        setBothTopPositions(new Position(28.86, 93.29));
    }
}
