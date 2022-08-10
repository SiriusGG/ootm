package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class DampesGraveToGraveyard extends Exit {
    public DampesGraveToGraveyard(final ExitMap exitMap) {
        super(exitMap, ExitType.GROTTO_EXIT);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setGrottoExit(GrottoExit.DAMPES_GRAVE);
        setBothSidePositions(new Position(90.8, 55.0));
        setBothTopPositions(new Position(22.0, 6.5));
    }
}
