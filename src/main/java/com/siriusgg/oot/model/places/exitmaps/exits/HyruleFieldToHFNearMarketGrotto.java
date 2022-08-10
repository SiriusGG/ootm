package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class HyruleFieldToHFNearMarketGrotto extends Exit {
    public HyruleFieldToHFNearMarketGrotto(final ExitMap exitMap) {
        super(exitMap, ExitType.GROTTO_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setGrottoEntrance(GrottoEntrance.HF_NEAR_MARKET_GROTTO);
        setBothSidePositions(new Position(74.15, 18.34));
        setBothTopPositions(new Position(52.08, 7.52));
    }
}
