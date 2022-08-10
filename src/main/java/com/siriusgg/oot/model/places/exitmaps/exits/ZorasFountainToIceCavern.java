package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class ZorasFountainToIceCavern extends Exit {
    public ZorasFountainToIceCavern(final ExitMap exitMap) {
        super(exitMap, ExitType.DUNGEON_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDungeonEntrance(DungeonEntrance.ICE_CAVERN);
        setChildSidePosition(new Position(21.03, 23.64));
        setAdultSidePosition(new Position(18.23, 24.21));
        setBothTopPositions(new Position(52.6, 15.51));
    }
}
