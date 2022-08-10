package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class ZorasRiverToLostWoods extends Exit {
    public ZorasRiverToLostWoods(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.LOST_WOODS);
        setBothSidePositions(new Position(91.51, 26.27));
        setBothTopPositions(new Position(89.71, 18.42));
    }
}
