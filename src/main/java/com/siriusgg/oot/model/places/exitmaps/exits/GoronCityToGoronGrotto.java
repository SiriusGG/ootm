package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class GoronCityToGoronGrotto extends Exit {
    public GoronCityToGoronGrotto(final ExitMap exitMap) {
        super(exitMap, ExitType.GROTTO_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setGrottoEntrance(GrottoEntrance.GC_GROTTO);
        setBothSidePositions(new Position(92.86, 18.87));
        setBothTopPositions(new Position(90.75, 7.75));
    }
}
