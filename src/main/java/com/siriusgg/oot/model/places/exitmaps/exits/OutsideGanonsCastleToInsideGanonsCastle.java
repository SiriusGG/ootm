package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class OutsideGanonsCastleToInsideGanonsCastle extends Exit {
    public OutsideGanonsCastleToInsideGanonsCastle(final ExitMap exitMap) {
        super(exitMap, ExitType.DUNGEON_ENTRANCE);
        intendedAccessibleAsChild(false);
        intendedAccessibleAsAdult(true);
        setDungeonEntrance(DungeonEntrance.INSIDE_GANONS_CASTLE);
        setAdultSidePosition(new Position(53.19, 53.94));
        setAdultTopPosition(new Position(40.05, 33.68));
    }
}
