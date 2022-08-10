package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class KakarikoVillageToWindmill extends Exit {
    public KakarikoVillageToWindmill(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDoorEntrance(DoorEntrance.KAK_WINDMILL);
        setBothSidePositions(new Position(66.79, 29.78));
        setBothTopPositions(new Position(77.68, 65.12));
    }
}
