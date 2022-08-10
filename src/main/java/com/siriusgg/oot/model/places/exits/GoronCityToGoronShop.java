package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class GoronCityToGoronShop extends Exit {
    public GoronCityToGoronShop(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDoorEntrance(DoorEntrance.GC_SHOP);
        setBothSidePositions(new Position(44.29, 89.58));
        setBothTopPositions(new Position(44.39, 45.37));
    }
}
