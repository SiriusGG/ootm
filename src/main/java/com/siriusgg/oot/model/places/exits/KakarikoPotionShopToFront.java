package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class KakarikoPotionShopToFront extends Exit {
    public KakarikoPotionShopToFront(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_EXIT);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDoorExit(DoorExit.KAK_POTION_SHOP_FRONT);
        setBothSidePositions(new Position(7.81, 67.36));
        setBothTopPositions(new Position(7.81, 67.36));
    }
}
