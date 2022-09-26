package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class KokiriForestToKnowItAllHouse extends Exit {
    public KokiriForestToKnowItAllHouse(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDoorEntrance(DoorEntrance.KF_KNOW_IT_ALL_HOUSE);
        setChildSidePosition(new Position(9.9, 23.88));
        setAdultSidePosition(new Position(6.71, 25.1));
        setChildTopPosition(new Position(11.95, 55.67));
        setAdultTopPosition(new Position(12.37, 68.76));
    }
}
