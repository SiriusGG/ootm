package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class SacredForestMeadowToFairyGrotto extends Exit {
    public SacredForestMeadowToFairyGrotto(final ExitMap exitMap) {
        super(exitMap, ExitType.GROTTO_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setGrottoEntrance(GrottoEntrance.SFM_FAIRY_GROTTO);
        setBothSidePositions(new Position(41.89, 72.69));
        setBothTopPositions(new Position(46.77, 57.29));
    }
}
