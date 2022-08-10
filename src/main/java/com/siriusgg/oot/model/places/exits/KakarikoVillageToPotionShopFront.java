package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class KakarikoVillageToPotionShopFront extends Exit {
    public KakarikoVillageToPotionShopFront(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDoorEntrance(DoorEntrance.KAK_POTION_SHOP_FRONT);
        setBothSidePositions(new Position(38.65, 29.2));
        setBothTopPositions(new Position(62.66, 39.17));
    }
}
