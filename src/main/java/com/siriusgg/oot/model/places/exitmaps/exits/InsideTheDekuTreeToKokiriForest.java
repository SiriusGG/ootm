package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class InsideTheDekuTreeToKokiriForest extends Exit {
    public InsideTheDekuTreeToKokiriForest(final ExitMap exitMap) {
        super(exitMap, ExitType.DUNGEON_EXIT);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDungeonExit(DungeonExit.INSIDE_THE_DEKU_TREE);
        setBothSidePositions(new Position(46.09, 30.67));
        setBothTopPositions(new Position(29.18, 61.92));
    }
}
