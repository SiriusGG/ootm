package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class MarketToBombchuShop extends Exit {
    public MarketToBombchuShop(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(false);
        setDoorEntrance(DoorEntrance.MARKET_BOMBCHU_SHOP);
        setChildSidePosition(new Position(14.71, 51.69));
        setChildTopPosition(new Position(26.86, 81.25));
    }
}
