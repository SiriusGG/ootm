package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class HyruleFieldToHFOpenGrotto extends Exit {
    public HyruleFieldToHFOpenGrotto(final ExitMap exitMap) {
        super(exitMap, ExitType.GROTTO_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setGrottoEntrance(GrottoEntrance.HF_OPEN_GROTTO);
        setBothSidePositions(new Position(17.12, 74.5));
        setBothTopPositions(new Position(37.64, 82.75));
    }
}
