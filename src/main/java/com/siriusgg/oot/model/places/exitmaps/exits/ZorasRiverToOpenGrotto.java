package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class ZorasRiverToOpenGrotto extends Exit {
    public ZorasRiverToOpenGrotto(final ExitMap exitMap) {
        super(exitMap, ExitType.GROTTO_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setGrottoEntrance(GrottoEntrance.ZR_OPEN_GROTTO);
        setBothSidePositions(new Position(44.61, 55.56));
        setBothTopPositions(new Position(39.06, 45.74));
    }
}
