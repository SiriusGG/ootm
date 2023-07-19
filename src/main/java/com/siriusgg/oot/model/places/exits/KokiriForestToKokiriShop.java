package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class KokiriForestToKokiriShop extends Exit {
    public KokiriForestToKokiriShop(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDoorEntrance(DoorEntrance.KF_KOKIRI_SHOP);
        setChildSidePosition(new Position(35.11, 43.5));
        setAdultSidePosition(new Position(33.07, 44.65));
        setChildTopPosition(new Position(36.99, 41.32));
        setAdultTopPosition(new Position(37.43, 51.05));
    }
}
