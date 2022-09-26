package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class KokiriForestToMidosHouse extends Exit {
    public KokiriForestToMidosHouse(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDoorEntrance(DoorEntrance.KF_MIDOS_HOUSE);
        setChildSidePosition(new Position(24.5, 26.23));
        setAdultSidePosition(new Position(22.07, 26.75));
        setChildTopPosition(new Position(20.3, 37.73));
        setAdultTopPosition(new Position(20.7, 47.11));
    }
}
