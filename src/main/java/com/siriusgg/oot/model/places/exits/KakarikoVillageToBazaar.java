package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class KakarikoVillageToBazaar extends Exit {
    public KakarikoVillageToBazaar(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(false);
        intendedAccessibleAsAdult(true);
        setDoorEntrance(DoorEntrance.KAK_BAZAAR);
        setBothSidePositions(new Position(34.19, 30.82));
        setBothTopPositions(new Position(57.82, 37.31));
    }
}
