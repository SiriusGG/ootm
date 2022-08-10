package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class GraveyardToDampesHouse extends Exit {
    public GraveyardToDampesHouse(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDoorEntrance(DoorEntrance.GRAVEYARD_DAMPES_HOUSE);
        setBothSidePositions(new Position(26.56, 74.68));
        setBothTopPositions(new Position(21.03, 80.16));
    }
}
