package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class KokiriForestMainToLostWoodsBridge extends Exit {
    public KokiriForestMainToLostWoodsBridge(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.LOST_WOODS);
        setBothSidePositions(new Position(12.38, 19.83));
        setBothTopPositions(new Position(4.81, 42.01));
    }
}
