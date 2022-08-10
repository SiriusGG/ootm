package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class HyruleFieldToMarketEntrance extends Exit {
    public HyruleFieldToMarketEntrance(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.MARKET_ENTRANCE);
        setBothSidePositions(new Position(80.14, 21.03));
        setBothTopPositions(new Position(60.28, 4.4));
    }
}
