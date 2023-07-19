package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class KokiriForestToSariasHouse extends Exit {
    public KokiriForestToSariasHouse(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDoorEntrance(DoorEntrance.KF_SARIAS_HOUSE);
        setChildSidePosition(new Position(22.54, 49.25));
        setAdultSidePosition(new Position(20.12, 48.97));
        setChildTopPosition(new Position(33.08, 62.15));
        setAdultTopPosition(new Position(33.2, 75.89));
    }
}
