package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class LostWoodsToGoronCity extends Exit {
    public LostWoodsToGoronCity(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.GORON_CITY);
        setBothSidePositions(new Position(66.93, 50.88));
        setBothTopPositions(new Position(57.5, 30.67));
    }
}
