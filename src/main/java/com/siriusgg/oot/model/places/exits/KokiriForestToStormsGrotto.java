package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class KokiriForestToStormsGrotto extends Exit {
    public KokiriForestToStormsGrotto(final ExitMap exitMap) {
        super(exitMap, ExitType.GROTTO_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setGrottoEntrance(GrottoEntrance.KF_STORMS_GROTTO);
        setBothSidePositions(new Position(30.23, 4.48));
        setBothTopPositions(new Position(19.62, 23.84));
    }
}
