package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class TempleOfTimeEntranceToTempleOfTime extends Exit {
    public TempleOfTimeEntranceToTempleOfTime(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDoorEntrance(DoorEntrance.TEMPLE_OF_TIME);
        setBothSidePositions(new Position(31.86, 24.31));
        setBothTopPositions(new Position(31.86, 24.31));
    }
}
