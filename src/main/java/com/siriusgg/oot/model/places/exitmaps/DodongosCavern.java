package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;

public class DodongosCavern extends ExitMap {
    public DodongosCavern(final Settings settings) {
        super(settings);
        setName("Dodongo's Cavern");
        initMap();
        setDungeonExitsAmount(1);
        initExits();
        setExit(new DodongosCavernToDMT(), 0);
    }

    private static class DodongosCavernToDMT extends Exit {
        public DodongosCavernToDMT() {
            super(ExitType.DUNGEON_EXIT);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDungeonExit(DungeonExit.DODONGOS_CAVERN);
        }
    }
}
