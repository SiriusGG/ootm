package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class KokiriForestToInsideTheDekuTree extends Exit {
    public KokiriForestToInsideTheDekuTree(final ExitMap exitMap) {
        super(exitMap, ExitType.DUNGEON_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDungeonEntrance(DungeonEntrance.INSIDE_THE_DEKU_TREE);
        setChildSidePosition(new Position(72.51, 69.94));
        setAdultSidePosition(new Position(71.35, 71.19));
        setChildTopPosition(new Position(77.14, 24.42));
        setAdultTopPosition(new Position(77.93, 29.77));
    }
}
