package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class LonLonRanchToTower extends Exit {
    public LonLonRanchToTower(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDoorEntrance(DoorEntrance.LLR_TOWER);
        setBothSidePositions(new Position(91.6, 48.6));
        setBothTopPositions(new Position(14.89, 86.69));
    }
}
