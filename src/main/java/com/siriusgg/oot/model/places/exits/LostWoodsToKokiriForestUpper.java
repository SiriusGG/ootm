package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class LostWoodsToKokiriForestUpper extends Exit {
    public LostWoodsToKokiriForestUpper(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.KOKIRI_FOREST);
        setBothSidePositions(new Position(41.34, 63.05));
        setBothTopPositions(new Position(38.99, 57.64));
    }
}
