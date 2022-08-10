package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class MarketToBazaar extends Exit {
    public MarketToBazaar(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(false);
        setDoorEntrance(DoorEntrance.MARKET_BAZAAR);
        setChildSidePosition(new Position(77.15, 81.18));
        setChildTopPosition(new Position(82.62, 62.73));
    }
}
