package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class KakarikoVillageToPotionShopBack extends Exit {
    public KakarikoVillageToPotionShopBack(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(false);
        intendedAccessibleAsAdult(true);
        setDoorEntrance(DoorEntrance.KAK_POTION_SHOP_BACK);
        setBothSidePositions(new Position(45.5, 27.11));
        setBothTopPositions(new Position(68.94, 38.01));
    }
}
