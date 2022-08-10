package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class LostWoodsToScrubsGrotto extends Exit {
    public LostWoodsToScrubsGrotto(final ExitMap exitMap) {
        super(exitMap, ExitType.GROTTO_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setGrottoEntrance(GrottoEntrance.LW_SCRUBS_GROTTO);
        setBothSidePositions(new Position(83.79, 30.75));
        setBothTopPositions(new Position(53.72, 5.56));
    }
}
