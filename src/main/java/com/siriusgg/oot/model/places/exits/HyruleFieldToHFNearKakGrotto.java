package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class HyruleFieldToHFNearKakGrotto extends Exit {
    public HyruleFieldToHFNearKakGrotto(final ExitMap exitMap) {
        super(exitMap, ExitType.GROTTO_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setGrottoEntrance(GrottoEntrance.HF_NEAR_KAK_GROTTO);
        setBothSidePositions(new Position(90.63, 29.98));
        setBothTopPositions(new Position(72.63, 3.01));
    }
}
