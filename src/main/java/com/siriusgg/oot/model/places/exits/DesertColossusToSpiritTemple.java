package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class DesertColossusToSpiritTemple extends Exit {
    public DesertColossusToSpiritTemple(final ExitMap exitMap) {
        super(exitMap, ExitType.DUNGEON_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDungeonEntrance(DungeonEntrance.SPIRIT_TEMPLE);
        setBothSidePositions(new Position(24.0, 49.8));
        setBothTopPositions(new Position(20.0, 46.0));
    }
}
