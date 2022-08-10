package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class LakeHyliaToFishingHole extends Exit {
    public LakeHyliaToFishingHole(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDoorEntrance(DoorEntrance.LH_FISHING_HOLE);
        setBothSidePositions(new Position(73.76, 64.2));
        setBothTopPositions(new Position(75.33, 49.31));
    }
}
