package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class SacredForestMeadowToWolfosGrotto extends Exit {
    public SacredForestMeadowToWolfosGrotto(final ExitMap exitMap) {
        super(exitMap, ExitType.GROTTO_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setGrottoEntrance(GrottoEntrance.SFM_WOLFOS_GROTTO);
        setBothSidePositions(new Position(14.92, 87.62));
        setBothTopPositions(new Position(31.84, 84.26));
    }
}
