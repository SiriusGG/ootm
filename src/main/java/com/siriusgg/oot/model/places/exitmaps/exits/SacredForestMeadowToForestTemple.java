package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class SacredForestMeadowToForestTemple extends Exit {
    public SacredForestMeadowToForestTemple(final ExitMap exitMap) {
        super(exitMap, ExitType.DUNGEON_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDungeonEntrance(DungeonEntrance.FOREST_TEMPLE);
        setBothSidePositions(new Position(90.28, 23.03));
        setBothTopPositions(new Position(43.78, 0.46));
    }
}
