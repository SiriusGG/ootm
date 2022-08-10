package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class KakarikoVillageToImpasHouseFront extends Exit {
    public KakarikoVillageToImpasHouseFront(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDoorEntrance(DoorEntrance.KAK_IMPAS_HOUSE_FRONT);
        setBothSidePositions(new Position(61.89, 46.93));
        setBothTopPositions(new Position(56.31, 92.24));
    }
}
