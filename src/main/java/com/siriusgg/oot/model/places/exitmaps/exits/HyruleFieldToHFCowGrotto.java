package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class HyruleFieldToHFCowGrotto extends Exit {
    public HyruleFieldToHFCowGrotto(final ExitMap exitMap) {
        super(exitMap, ExitType.GROTTO_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setGrottoEntrance(GrottoEntrance.HF_COW_GROTTO);
        setBothSidePositions(new Position(28.65, 21.92));
        setBothTopPositions(new Position(15.7, 42.94));
    }
}
