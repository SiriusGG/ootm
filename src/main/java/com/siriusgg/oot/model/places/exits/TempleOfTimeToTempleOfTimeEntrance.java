package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class TempleOfTimeToTempleOfTimeEntrance extends Exit {
    public TempleOfTimeToTempleOfTimeEntrance(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_EXIT);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDoorExit(DoorExit.TEMPLE_OF_TIME);
        setBothSidePositions(new Position(6.67, 91.67));
        setBothTopPositions(new Position(4.69, 45.81));
    }
}
