package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class HyruleCastleToHCGreatFairy extends Exit {
    public HyruleCastleToHCGreatFairy(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(false);
        setDoorEntrance(DoorEntrance.HC_GREAT_FAIRY_FOUNTAIN);
        setChildSidePosition(new Position(78.42, 92.82));
        setChildTopPosition(new Position(81.32, 47.34));
    }
}
