package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class MarketToMaskShop extends Exit {
    public MarketToMaskShop(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(false);
        setDoorEntrance(DoorEntrance.MARKET_MASK_SHOP);
        setChildSidePosition(new Position(89.84, 63.62));
        setChildTopPosition(new Position(76.82, 24.07));
    }
}
