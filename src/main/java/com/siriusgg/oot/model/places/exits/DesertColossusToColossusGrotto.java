package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class DesertColossusToColossusGrotto extends Exit {
    public DesertColossusToColossusGrotto(final ExitMap exitMap) {
        super(exitMap, ExitType.GROTTO_ENTRANCE);
        intendedAccessibleAsChild(false);
        intendedAccessibleAsAdult(true);
        setGrottoEntrance(GrottoEntrance.COLOSSUS_GROTTO);
        setBothSidePositions(new Position(47.3, 51.0));
        setBothTopPositions(new Position(36.0, 27.0));
    }
}
