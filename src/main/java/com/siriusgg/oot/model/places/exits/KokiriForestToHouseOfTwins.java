package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class KokiriForestToHouseOfTwins extends Exit {
    public KokiriForestToHouseOfTwins(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDoorEntrance(DoorEntrance.KF_HOUSE_OF_TWINS);
        setChildSidePosition(new Position(28.34, 54.37));
        setAdultSidePosition(new Position(25.98, 54.32));
        setChildTopPosition(new Position(40.23, 60.19));
        setAdultTopPosition(new Position(40.49, 73.68));
    }
}
