package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class KakarikoVillageToOddMedicineBuilding extends Exit {
    public KakarikoVillageToOddMedicineBuilding(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDoorEntrance(DoorEntrance.KAK_ODD_MEDICINE_BUILDING);
        setBothSidePositions(new Position(56.99, 31.4));
        setBothTopPositions(new Position(71.4, 53.07));
    }
}
