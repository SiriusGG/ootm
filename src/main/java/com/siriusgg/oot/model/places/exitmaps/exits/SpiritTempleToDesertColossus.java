package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class SpiritTempleToDesertColossus extends Exit {
    public SpiritTempleToDesertColossus(final ExitMap exitMap) {
        super(exitMap, ExitType.DUNGEON_EXIT);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDungeonExit(DungeonExit.SPIRIT_TEMPLE);
        setBothSidePositions(new Position(25.59, 87.96));
        setBothTopPositions(new Position(19.45, 80.21));
    }
}
