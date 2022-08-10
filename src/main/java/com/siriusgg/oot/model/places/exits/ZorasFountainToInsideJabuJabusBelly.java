package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class ZorasFountainToInsideJabuJabusBelly extends Exit {
    public ZorasFountainToInsideJabuJabusBelly(final ExitMap exitMap) {
        super(exitMap, ExitType.DUNGEON_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(false);
        setDungeonEntrance(DungeonEntrance.INSIDE_JABU_JABUS_BELLY);
        setChildSidePosition(new Position(29.23, 51.83));
        setAdultSidePosition(new Position(25.0, 53.89));
        setBothTopPositions(new Position(30.09, 43.75));
    }
}
