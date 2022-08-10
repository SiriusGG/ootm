package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class ShadowTempleToGraveyard extends Exit {
    public ShadowTempleToGraveyard(final ExitMap exitMap) {
        super(exitMap, ExitType.DUNGEON_EXIT);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDungeonExit(DungeonExit.SHADOW_TEMPLE);
        setBothSidePositions(new Position(63.87, 24.76));
        setBothTopPositions(new Position(46.38, 22.34));
    }
}
