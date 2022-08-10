package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class LakeHyliaToWaterTemple extends Exit {
    public LakeHyliaToWaterTemple(final ExitMap exitMap) {
        super(exitMap, ExitType.DUNGEON_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDungeonEntrance(DungeonEntrance.WATER_TEMPLE);
        setBothSidePositions(new Position(34.9, 83.64));
        setBothTopPositions(new Position(46.08, 72.8));
    }
}
