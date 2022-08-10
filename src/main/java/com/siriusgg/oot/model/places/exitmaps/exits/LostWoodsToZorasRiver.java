package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class LostWoodsToZorasRiver extends Exit {
    public LostWoodsToZorasRiver(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.ZORAS_RIVER);
        setBothSidePositions(new Position(84.64, 92.04));
        setBothTopPositions(new Position(92.57, 36.34));
    }
}
