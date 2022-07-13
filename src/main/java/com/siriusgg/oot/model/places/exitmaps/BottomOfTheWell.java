package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.PermanentlyLoadedInformation;
import com.siriusgg.oot.model.places.*;

public class BottomOfTheWell extends ExitMap {
    public BottomOfTheWell() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[0]);
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
