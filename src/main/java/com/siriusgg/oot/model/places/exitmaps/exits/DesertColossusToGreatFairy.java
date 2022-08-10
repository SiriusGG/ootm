package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class DesertColossusToGreatFairy extends Exit {
    public DesertColossusToGreatFairy(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDoorEntrance(DoorEntrance.COLOSSUS_GREAT_FAIRY_FOUNTAIN);
        setBothSidePositions(new Position(67.5, 58.0));
        setBothTopPositions(new Position(63.0, 24.0));
    }
}
