package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class KokiriForestToLinksHouse extends Exit {
    public KokiriForestToLinksHouse(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDoorEntrance(DoorEntrance.KF_LINKS_HOUSE);
        setBothSidePositions(new Position(12.57, 47.76));
        setBothTopPositions(new Position(25.56, 70.72));
    }
}
