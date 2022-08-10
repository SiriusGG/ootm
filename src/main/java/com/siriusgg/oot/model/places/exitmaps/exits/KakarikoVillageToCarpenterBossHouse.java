package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class KakarikoVillageToCarpenterBossHouse extends Exit {
    public KakarikoVillageToCarpenterBossHouse(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDoorEntrance(DoorEntrance.KAK_CARPENTER_BOSS_HOUSE);
        setBothSidePositions(new Position(46.84, 42.06));
        setBothTopPositions(new Position(60.82, 57.59));
    }
}
