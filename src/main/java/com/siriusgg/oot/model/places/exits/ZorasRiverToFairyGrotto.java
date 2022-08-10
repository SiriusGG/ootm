package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class ZorasRiverToFairyGrotto extends Exit {
    public ZorasRiverToFairyGrotto(final ExitMap exitMap) {
        super(exitMap, ExitType.GROTTO_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setGrottoEntrance(GrottoEntrance.ZR_FAIRY_GROTTO);
        setBothSidePositions(new Position(41.4, 50.12));
        setBothTopPositions(new Position(43.62, 32.46));
    }
}
