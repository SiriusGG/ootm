package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class InsideGanonsCastleToOutsideGanonsCastle extends Exit {
    public InsideGanonsCastleToOutsideGanonsCastle(final ExitMap exitMap) {
        super(exitMap, ExitType.DUNGEON_EXIT);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDungeonExit(DungeonExit.INSIDE_GANONS_CASTLE);
        setBothSidePositions(new Position(10.49, 58.17));
        setBothTopPositions(new Position(40.6, 89.12));
    }
}
