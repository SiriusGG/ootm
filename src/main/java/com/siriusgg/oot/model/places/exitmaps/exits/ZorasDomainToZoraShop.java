package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class ZorasDomainToZoraShop extends Exit {
    public ZorasDomainToZoraShop(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDoorEntrance(DoorEntrance.ZD_SHOP);
        setBothSidePositions(new Position(86.87, 68.4));
        setBothTopPositions(new Position(71.88, 84.38));
    }
}
