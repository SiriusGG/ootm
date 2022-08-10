package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class KakarikoVillageToHouseOfSkulltula extends Exit {
    public KakarikoVillageToHouseOfSkulltula(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDoorEntrance(DoorEntrance.KAK_HOUSE_OF_SKULLTULA);
        setBothSidePositions(new Position(53.52, 45.31));
        setBothTopPositions(new Position(56.52, 76.13));
    }
}
