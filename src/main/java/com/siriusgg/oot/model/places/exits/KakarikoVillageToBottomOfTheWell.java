package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class KakarikoVillageToBottomOfTheWell extends Exit {
    public KakarikoVillageToBottomOfTheWell(final ExitMap exitMap) {
        super(exitMap, ExitType.DUNGEON_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDungeonEntrance(DungeonEntrance.BOTTOM_OF_THE_WELL);
        setBothSidePositions(new Position(61.18, 36.73));
        setBothTopPositions(new Position(71.4, 64.43));
    }
}
