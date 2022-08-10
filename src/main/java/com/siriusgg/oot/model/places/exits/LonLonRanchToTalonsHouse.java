package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class LonLonRanchToTalonsHouse extends Exit {
    public LonLonRanchToTalonsHouse(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDoorEntrance(DoorEntrance.LLR_TALONS_HOUSE);
        setBothSidePositions(new Position(17.97, 76.03));
        setBothTopPositions(new Position(72.57, 12.96));
    }
}
