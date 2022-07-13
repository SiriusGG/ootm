package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.PermanentlyLoadedInformation;
import com.siriusgg.oot.model.places.*;

public class FireTemple extends ExitMap {
    public FireTemple() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[6]);
        initMap();
        setDungeonExitsAmount(1);
        initExits();
        setExit(new FireTempleToDMC(), 0);
    }

    private static class FireTempleToDMC extends Exit {
        public FireTempleToDMC() {
            super(ExitType.DUNGEON_EXIT);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDungeonExit(DungeonExit.FIRE_TEMPLE);
        }
    }
}
