package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class KokiriForestToLinksHouse extends Exit {
    public KokiriForestToLinksHouse(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDoorEntrance(DoorEntrance.KF_LINKS_HOUSE);
        setChildSidePosition(new Position(12.57, 47.76));
        setAdultSidePosition(new Position(9.57, 45.47));
        setChildTopPosition(new Position(25.56, 70.72));
        setAdultTopPosition(new Position(26.04, 87.7));
    }
}
