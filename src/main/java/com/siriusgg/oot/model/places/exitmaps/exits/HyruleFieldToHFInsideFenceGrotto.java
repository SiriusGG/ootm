package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class HyruleFieldToHFInsideFenceGrotto extends Exit {
    public HyruleFieldToHFInsideFenceGrotto(final ExitMap exitMap) {
        super(exitMap, ExitType.GROTTO_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setGrottoEntrance(GrottoEntrance.HF_INSIDE_FENCE_GROTTO);
        setBothSidePositions(new Position(13.67, 71.36));
        setBothTopPositions(new Position(32.1, 82.87));
    }
}
