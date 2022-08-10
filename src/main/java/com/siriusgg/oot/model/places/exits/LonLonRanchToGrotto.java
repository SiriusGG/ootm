package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class LonLonRanchToGrotto extends Exit {
    public LonLonRanchToGrotto(final ExitMap exitMap) {
        super(exitMap, ExitType.GROTTO_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(false);
        setGrottoEntrance(GrottoEntrance.LLR_GROTTO);
        setBothSidePositions(new Position(57.23, 13.61));
        setBothTopPositions(new Position(87.77, 86.0));
    }
}
