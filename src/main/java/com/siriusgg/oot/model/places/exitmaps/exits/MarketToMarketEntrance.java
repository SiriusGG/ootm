package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class MarketToMarketEntrance extends Exit {
    public MarketToMarketEntrance(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.MARKET_ENTRANCE);
        setChildSidePosition(new Position(48.37, 86.52));
        setChildTopPosition(new Position(66.63, 93.75));
        setAdultSidePosition(new Position(13.48, 85.24));
        setAdultTopPosition(new Position(40.31, 93.63));
    }
}
