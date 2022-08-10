package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class GraveyardToDampesGrave extends Exit {
    public GraveyardToDampesGrave(final ExitMap exitMap) {
        super(exitMap, ExitType.GROTTO_ENTRANCE);
        intendedAccessibleAsChild(false);
        intendedAccessibleAsAdult(true);
        setGrottoEntrance(GrottoEntrance.DAMPES_GRAVE);
        setBothSidePositions(new Position(13.93, 57.18));
        setBothTopPositions(new Position(24.74, 14.29));
    }
}
