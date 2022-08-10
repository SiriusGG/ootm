package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class DeathMountainCraterToGreatFairy extends Exit {
    public DeathMountainCraterToGreatFairy(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDoorEntrance(DoorEntrance.DMC_GREAT_FAIRY_FOUNTAIN);
        setBothSidePositions(new Position(51.0, 49.4));
        setBothTopPositions(new Position(16.0, 60.0));
    }
}
