package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class KokiriForestToMidosHouse extends Exit {
    public KokiriForestToMidosHouse(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDoorEntrance(DoorEntrance.KF_MIDOS_HOUSE);
        setBothSidePositions(new Position(24.5, 26.23));
        setBothTopPositions(new Position(20.3, 37.73));
    }
}
