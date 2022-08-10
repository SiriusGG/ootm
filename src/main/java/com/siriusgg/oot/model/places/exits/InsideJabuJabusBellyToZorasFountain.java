package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class InsideJabuJabusBellyToZorasFountain extends Exit {
    public InsideJabuJabusBellyToZorasFountain(final ExitMap exitMap) {
        super(exitMap, ExitType.DUNGEON_EXIT);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDungeonExit(DungeonExit.INSIDE_JABU_JABUS_BELLY);
        setBothSidePositions(new Position(4.93, 54.75));
        setBothTopPositions(new Position(23.89, 92.82));
    }
}
