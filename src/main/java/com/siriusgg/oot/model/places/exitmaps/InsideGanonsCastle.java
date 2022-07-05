package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;

public class InsideGanonsCastle extends ExitMap {
    public InsideGanonsCastle(final Settings settings) {
        super(settings);
        setName("Inside Ganon's Castle");
        initMap();
        setDungeonExitsAmount(1);
        initExits();
        setExit(new InsideGanonsCastleToHyruleCastle(), 0);
    }

    private static class InsideGanonsCastleToHyruleCastle extends Exit {
        public InsideGanonsCastleToHyruleCastle() {
            super(ExitType.DUNGEON_EXIT);
            setCanBeUsedAsChild(true);
            setCanBeUsedAsAdult(true);
            setDungeonExit(DungeonExit.INSIDE_GANONS_CASTLE);
        }
    }
}
