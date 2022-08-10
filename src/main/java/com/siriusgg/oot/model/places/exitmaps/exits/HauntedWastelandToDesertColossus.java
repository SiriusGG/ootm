package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class HauntedWastelandToDesertColossus extends Exit {
    public HauntedWastelandToDesertColossus(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.DESERT_COLOSSUS);
        setBothSidePositions(new Position(66.73, 78.96));
        setBothTopPositions(new Position(2.32, 33.45));
    }
}
