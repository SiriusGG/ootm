package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class MarketToPotionShop extends Exit {
    public MarketToPotionShop(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(false);
        setDoorEntrance(DoorEntrance.MARKET_POTION_SHOP);
        setChildSidePosition(new Position(84.57, 75.84));
        setChildTopPosition(new Position(83.32, 46.06));
    }
}
