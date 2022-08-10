package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class GerudosFortressToStormsGrotto extends Exit {
    public GerudosFortressToStormsGrotto(final ExitMap exitMap) {
        super(exitMap, ExitType.GROTTO_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setGrottoEntrance(GrottoEntrance.GF_STORMS_GROTTO);
        setBothSidePositions(new Position(41.0, 75.5));
        setBothTopPositions(new Position(38.0, 53.0));
    }
}
