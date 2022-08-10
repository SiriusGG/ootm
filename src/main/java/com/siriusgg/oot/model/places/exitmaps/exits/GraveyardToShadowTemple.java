package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class GraveyardToShadowTemple extends Exit {
    public GraveyardToShadowTemple(final ExitMap exitMap) {
        super(exitMap, ExitType.DUNGEON_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDungeonEntrance(DungeonEntrance.SHADOW_TEMPLE);
        setBothSidePositions(new Position(92.9, 10.38));
        setBothTopPositions(new Position(92.12, 43.12));
    }
}
