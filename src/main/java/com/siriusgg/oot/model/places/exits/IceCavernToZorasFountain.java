package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class IceCavernToZorasFountain extends Exit {
    public IceCavernToZorasFountain(final ExitMap exitMap) {
        super(exitMap, ExitType.DUNGEON_EXIT);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDungeonExit(DungeonExit.ICE_CAVERN);
        setBothSidePositions(new Position(3.84, 91.25));
        setBothTopPositions(new Position(51.91, 92.59));
    }
}
