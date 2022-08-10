package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class LakeHyliaToLakesideLaboratory extends Exit {
    public LakeHyliaToLakesideLaboratory(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDoorEntrance(DoorEntrance.LH_LAB);
        setBothSidePositions(new Position(43.16, 37.06));
        setBothTopPositions(new Position(26.14, 49.07));
    }
}
