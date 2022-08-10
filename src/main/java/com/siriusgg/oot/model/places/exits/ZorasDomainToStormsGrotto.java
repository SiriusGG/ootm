package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class ZorasDomainToStormsGrotto extends Exit {
    public ZorasDomainToStormsGrotto(final ExitMap exitMap) {
        super(exitMap, ExitType.GROTTO_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setGrottoEntrance(GrottoEntrance.ZD_STORMS_GROTTO);
        setBothSidePositions(new Position(37.31, 74.88));
        setBothTopPositions(new Position(26.28, 64.12));
    }
}
