package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class ForestTempleToSacredForestMeadow extends Exit {
    public ForestTempleToSacredForestMeadow(final ExitMap exitMap) {
        super(exitMap, ExitType.DUNGEON_EXIT);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDungeonExit(DungeonExit.FOREST_TEMPLE);
        setBothSidePositions(new Position(0.3, 77.5));
        setBothTopPositions(new Position(42.3, 92.5));
    }
}
