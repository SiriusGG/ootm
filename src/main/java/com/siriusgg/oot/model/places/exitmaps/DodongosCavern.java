package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.places.*;

public class DodongosCavern extends ExitMap {
    public DodongosCavern() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[5]);
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
