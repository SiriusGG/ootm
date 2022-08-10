package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class MarketToManInGreenHouse extends Exit {
    public MarketToManInGreenHouse(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(false);
        setDoorEntrance(DoorEntrance.MARKET_MAN_IN_GREEN_HOUSE);
        setChildSidePosition(new Position(41.86, 22.47));
        setChildTopPosition(new Position(10.81, 20.14));
    }
}
