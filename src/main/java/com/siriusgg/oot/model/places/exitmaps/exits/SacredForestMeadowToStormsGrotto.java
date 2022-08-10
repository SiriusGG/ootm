package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class SacredForestMeadowToStormsGrotto extends Exit {
    public SacredForestMeadowToStormsGrotto(final ExitMap exitMap) {
        super(exitMap, ExitType.GROTTO_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setGrottoEntrance(GrottoEntrance.SFM_STORMS_GROTTO);
        setBothSidePositions(new Position(82.07, 41.32));
        setBothTopPositions(new Position(66.17, 15.16));
    }
}
