package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class LakeHyliaToGrotto extends Exit {
    public LakeHyliaToGrotto(final ExitMap exitMap) {
        super(exitMap, ExitType.GROTTO_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setGrottoEntrance(GrottoEntrance.LH_GROTTO);
        setBothSidePositions(new Position(21.03, 47.13));
        setBothTopPositions(new Position(20.26, 69.1));
    }
}
