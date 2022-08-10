package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class HyruleCastleToStormsGrotto extends Exit {
    public HyruleCastleToStormsGrotto(final ExitMap exitMap) {
        super(exitMap, ExitType.GROTTO_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(false);
        setGrottoEntrance(GrottoEntrance.HC_STORMS_GROTTO);
        setChildSidePosition(new Position(78.19, 64.47));
        setChildTopPosition(new Position(52.73, 21.18));
    }
}
