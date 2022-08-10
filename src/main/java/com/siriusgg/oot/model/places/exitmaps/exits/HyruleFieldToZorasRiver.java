package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class HyruleFieldToZorasRiver extends Exit {
    public HyruleFieldToZorasRiver(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.ZORAS_RIVER);
        setBothSidePositions(new Position(93.42, 65.77));
        setBothTopPositions(new Position(95.73, 25.35));
    }
}
