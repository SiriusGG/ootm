package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class KakarikoVillageToShootingGallery extends Exit {
    public KakarikoVillageToShootingGallery(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(false);
        intendedAccessibleAsAdult(true);
        setDoorEntrance(DoorEntrance.KAK_SHOOTING_GALLERY);
        setBothSidePositions(new Position(56.9, 40.09));
        setBothTopPositions(new Position(64.64, 70.68));
    }
}
