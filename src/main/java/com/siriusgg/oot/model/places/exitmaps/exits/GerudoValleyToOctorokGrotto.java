package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class GerudoValleyToOctorokGrotto extends Exit {
    public GerudoValleyToOctorokGrotto(final ExitMap exitMap) {
        super(exitMap, ExitType.GROTTO_ENTRANCE);
        intendedAccessibleAsChild(false);
        intendedAccessibleAsAdult(true);
        setGrottoEntrance(GrottoEntrance.GV_OCTOROK_GROTTO);
        setBothSidePositions(new Position(21.11, 52.43));
        setBothTopPositions(new Position(61.31, 63.66));
    }
}
