package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class KakarikoVillageToImpasHouseBack extends Exit {
    public KakarikoVillageToImpasHouseBack(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDoorEntrance(DoorEntrance.KAK_IMPAS_HOUSE_BACK);
        setBothSidePositions(new Position(69.28, 42.41));
        setBothTopPositions(new Position(63.89, 92.35));
    }
}
