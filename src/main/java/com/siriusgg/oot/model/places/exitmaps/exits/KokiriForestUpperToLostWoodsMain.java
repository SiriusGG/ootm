package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class KokiriForestUpperToLostWoodsMain extends Exit {
    public KokiriForestUpperToLostWoodsMain(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.LOST_WOODS);
        setBothSidePositions(new Position(34.46, 2.35));
        setBothTopPositions(new Position(22.11, 20.25));
    }
}
