package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class DeathMountainCraterToFireTemple extends Exit {
    public DeathMountainCraterToFireTemple(final ExitMap exitMap) {
        super(exitMap, ExitType.DUNGEON_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDungeonEntrance(DungeonEntrance.FIRE_TEMPLE);
        setBothSidePositions(new Position(79.5, 83.5));
        setBothTopPositions(new Position(44.0, 3.0));
    }
}
