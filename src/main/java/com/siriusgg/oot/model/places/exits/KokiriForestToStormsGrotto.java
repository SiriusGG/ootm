package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class KokiriForestToStormsGrotto extends Exit {
    public KokiriForestToStormsGrotto(final ExitMap exitMap) {
        super(exitMap, ExitType.GROTTO_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setGrottoEntrance(GrottoEntrance.KF_STORMS_GROTTO);
        setChildSidePosition(new Position(30.23, 4.48));
        setAdultSidePosition(new Position(28.19, 4.12));
        setChildTopPosition(new Position(19.62, 23.84));
        setAdultTopPosition(new Position(19.73, 29.4));
    }
}
