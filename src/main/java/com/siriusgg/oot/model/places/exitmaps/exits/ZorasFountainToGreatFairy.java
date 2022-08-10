package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class ZorasFountainToGreatFairy extends Exit {
    public ZorasFountainToGreatFairy(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDoorEntrance(DoorEntrance.ZF_GREAT_FAIRY_FOUNTAIN);
        setChildSidePosition(new Position(94.66, 66.12));
        setAdultSidePosition(new Position(82.81, 65.85));
        setBothTopPositions(new Position(63.91, 91.09));
    }
}
