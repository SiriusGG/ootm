package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class KokiriForestToHouseOfTwins extends Exit {
    public KokiriForestToHouseOfTwins(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDoorEntrance(DoorEntrance.KF_HOUSE_OF_TWINS);
        setBothSidePositions(new Position(28.34, 54.37));
        setBothTopPositions(new Position(40.23, 60.19));
    }
}
