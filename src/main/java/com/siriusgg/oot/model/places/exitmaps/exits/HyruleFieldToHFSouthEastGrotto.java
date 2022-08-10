package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class HyruleFieldToHFSouthEastGrotto extends Exit {
    public HyruleFieldToHFSouthEastGrotto(final ExitMap exitMap) {
        super(exitMap, ExitType.GROTTO_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setGrottoEntrance(GrottoEntrance.HF_SOUTHEAST_GROTTO);
        setBothSidePositions(new Position(36.2, 81.21));
        setBothTopPositions(new Position(59.01, 74.19));
    }
}
