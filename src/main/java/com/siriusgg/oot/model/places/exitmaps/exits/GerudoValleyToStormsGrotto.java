package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class GerudoValleyToStormsGrotto extends Exit {
    public GerudoValleyToStormsGrotto(final ExitMap exitMap) {
        super(exitMap, ExitType.GROTTO_ENTRANCE);
        intendedAccessibleAsChild(false);
        intendedAccessibleAsAdult(true);
        setGrottoEntrance(GrottoEntrance.GV_STORMS_GROTTO);
        setBothSidePositions(new Position(45.01, 18.29));
        setBothTopPositions(new Position(42.54, 38.66));
    }
}
