package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;

public class BottomOfTheWell extends ExitMap {
    public BottomOfTheWell(final Settings settings) {
        super(settings);
        setName("Bottom of the Well");
        initMap();
        setDungeonExitsAmount(1);
        initExits();
        setExit(new BottomOfTheWellToKakariko(), 0);
    }

    private static class BottomOfTheWellToKakariko extends Exit {
        public BottomOfTheWellToKakariko() {
            super(ExitType.DUNGEON_EXIT);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDungeonExit(DungeonExit.BOTTOM_OF_THE_WELL);
        }
    }
}
