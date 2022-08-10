package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class GerudoValleyToCarpenterTent extends Exit {
    public GerudoValleyToCarpenterTent(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_ENTRANCE);
        intendedAccessibleAsChild(false);
        intendedAccessibleAsAdult(true);
        setDoorEntrance(DoorEntrance.GV_CARPENTER_TENT);
        setBothSidePositions(new Position(42.82, 20.49));
        setBothTopPositions(new Position(46.02, 44.1));
    }
}
