package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class BottomOfTheWellToKakariko extends Exit {
    public BottomOfTheWellToKakariko(final ExitMap exitMap) {
        super(exitMap, ExitType.DUNGEON_EXIT);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDungeonExit(DungeonExit.BOTTOM_OF_THE_WELL);
        setBothSidePositions(new Position(7.0, 42.0));
        setBothTopPositions(new Position(46.5, 85.0));
    }
}
