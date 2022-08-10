package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class MarketEntranceToGuardHouse extends Exit {
    public MarketEntranceToGuardHouse(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDoorEntrance(DoorEntrance.MARKET_GUARD_HOUSE);
        setBothSidePositions(new Position(56.51, 29.75));
        setBothTopPositions(new Position(56.51, 29.75));
    }
}
