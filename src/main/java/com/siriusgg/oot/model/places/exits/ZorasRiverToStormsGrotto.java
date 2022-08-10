package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class ZorasRiverToStormsGrotto extends Exit {
    public ZorasRiverToStormsGrotto(final ExitMap exitMap) {
        super(exitMap, ExitType.GROTTO_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setGrottoEntrance(GrottoEntrance.ZR_STORMS_GROTTO);
        setBothSidePositions(new Position(5.28, 76.5));
        setBothTopPositions(new Position(12.3, 38.72));
    }
}
