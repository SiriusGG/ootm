package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class LonLonRanchToStable extends Exit {
    public LonLonRanchToStable(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDoorEntrance(DoorEntrance.LLR_STABLES);
        setBothSidePositions(new Position(23.37, 77.32));
        setBothTopPositions(new Position(64.26, 16.9));
    }
}
