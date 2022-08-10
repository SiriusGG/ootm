package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class MarketToShootingGallery extends Exit {
    public MarketToShootingGallery(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(false);
        setDoorEntrance(DoorEntrance.MARKET_SHOOTING_GALLERY);
        setChildSidePosition(new Position(77.86, 53.23));
        setChildTopPosition(new Position(58.97, 23.26));
    }
}
