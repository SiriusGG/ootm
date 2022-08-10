package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class HyruleFieldToHFFairyGrotto extends Exit {
    public HyruleFieldToHFFairyGrotto(final ExitMap exitMap) {
        super(exitMap, ExitType.GROTTO_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setGrottoEntrance(GrottoEntrance.HF_FAIRY_GROTTO);
        setBothSidePositions(new Position(67.58, 4.92));
        setBothTopPositions(new Position(34.99, 0.93));
    }
}
