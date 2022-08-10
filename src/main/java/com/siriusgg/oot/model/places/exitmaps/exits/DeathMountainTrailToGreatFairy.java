package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class DeathMountainTrailToGreatFairy extends Exit {
    public DeathMountainTrailToGreatFairy(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDoorEntrance(DoorEntrance.DMT_GREAT_FAIRY_FOUNTAIN);
        setBothSidePositions(new Position(71.3, 20.0));
        setBothTopPositions(new Position(47.5, 17.5));
    }
}
