package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class KokiriForestToKokiriShop extends Exit {
    public KokiriForestToKokiriShop(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDoorEntrance(DoorEntrance.KF_KOKIRI_SHOP);
        setBothSidePositions(new Position(35.11, 43.5));
        setBothTopPositions(new Position(36.99, 41.32));
    }
}
