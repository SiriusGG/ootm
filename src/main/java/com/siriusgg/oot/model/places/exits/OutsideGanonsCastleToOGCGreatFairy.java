package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class OutsideGanonsCastleToOGCGreatFairy extends Exit {
    public OutsideGanonsCastleToOGCGreatFairy(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(false);
        intendedAccessibleAsAdult(true);
        setDoorEntrance(DoorEntrance.OGC_GREAT_FAIRY_FOUNTAIN);
        setAdultSidePosition(new Position(94.31, 81.83));
        setAdultTopPosition(new Position(91.61, 33.45));
    }
}
