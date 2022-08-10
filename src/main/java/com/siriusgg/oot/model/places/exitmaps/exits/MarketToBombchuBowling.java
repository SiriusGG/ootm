package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class MarketToBombchuBowling extends Exit {
    public MarketToBombchuBowling(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(false);
        setDoorEntrance(DoorEntrance.MARKET_BOMBCHU_BOWLING);
        setChildSidePosition(new Position(59.11, 60.81));
        setChildTopPosition(new Position(51.92, 51.97));
    }
}
