package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class MarketToDogLadyHouse extends Exit {
    public MarketToDogLadyHouse(final ExitMap exitMap) {
        super(exitMap, ExitType.UNCHANGING);
        setDestinationString("Market Dog Lady House");
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(false);
        setUnchangingTransition(UnchangingTransition.MARKET_DOG_LADY_HOUSE_IN);
        setChildSidePosition(new Position(11.13, 47.75));
        setChildTopPosition(new Position(20.13, 80.21));
    }
}
