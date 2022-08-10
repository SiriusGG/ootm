package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class MarketToTreasureChestGame extends Exit {
    public MarketToTreasureChestGame(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(false);
        setDoorEntrance(DoorEntrance.MARKET_TREASURE_CHEST_GAME);
        setChildSidePosition(new Position(44.92, 71.21));
        setChildTopPosition(new Position(51.61, 80.32));
    }
}
