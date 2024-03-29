package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class GoronCityToGoronCityOpenGrotto extends Exit {
    public GoronCityToGoronCityOpenGrotto(final ExitMap exitMap) {
        super(exitMap, ExitType.GROTTO_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setGrottoEntrance(GrottoEntrance.GC_GROTTO);
        setBothSidePositions(new Position(92.86, 18.87));
        setChildTopPosition(new Position(90.75, 7.75));
        setAdultTopPosition(new Position(90.31, 16.9));
    }
}
