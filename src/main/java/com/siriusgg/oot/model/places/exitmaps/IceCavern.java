package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.PermanentlyLoadedInformation;
import com.siriusgg.oot.model.places.*;

public class IceCavern extends ExitMap {
    public IceCavern() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[16]);
        initMap();
        setDungeonExitsAmount(1);
        initExits();
        setExit(new IceCavernToZorasFountain(), 0);
    }

    private static class IceCavernToZorasFountain extends Exit {
        public IceCavernToZorasFountain() {
            super(ExitType.DUNGEON_EXIT);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDungeonExit(DungeonExit.ICE_CAVERN);
        }
    }
}
