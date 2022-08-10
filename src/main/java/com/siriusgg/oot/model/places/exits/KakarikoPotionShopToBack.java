package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class KakarikoPotionShopToBack extends Exit {
    public KakarikoPotionShopToBack(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_EXIT);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDoorExit(DoorExit.KAK_POTION_SHOP_BACK);
        setBothSidePositions(new Position(9.98, 24.31));
        setBothTopPositions(new Position(9.98, 24.31));
    }
}
