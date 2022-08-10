package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class KokiriForestToInsideTheDekuTree extends Exit {
    public KokiriForestToInsideTheDekuTree(final ExitMap exitMap) {
        super(exitMap, ExitType.DUNGEON_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDungeonEntrance(DungeonEntrance.INSIDE_THE_DEKU_TREE);
        setBothSidePositions(new Position(72.51, 69.94));
        setBothTopPositions(new Position(77.14, 24.42));
    }
}
