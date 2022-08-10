package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class LostWoodsToKokiriForestBridge extends Exit {
    public LostWoodsToKokiriForestBridge(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.KOKIRI_FOREST);
        setBothSidePositions(new Position(16.15, 81.19));
        setBothTopPositions(new Position(17.81, 82.64));
    }
}
