package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;

public class LinksHouse extends ExitMap {
    public LinksHouse(final Settings settings) {
        super(settings);
        setName("Link's House");
        initMap();
        setDoorExitsAmount(1);
        initExits();
        setExit(new LinksHouseToKokiriForest(), 0);
    }

    private static class LinksHouseToKokiriForest extends Exit {
        public LinksHouseToKokiriForest() {
            super(ExitType.DOOR_EXIT);
            setCanBeUsedAsChild(true);
            setCanBeUsedAsAdult(true);
            setDoorExit(DoorExit.KF_LINKS_HOUSE);
        }
    }
}
