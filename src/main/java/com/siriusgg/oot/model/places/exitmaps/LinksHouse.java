package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.PermanentlyLoadedInformation;
import com.siriusgg.oot.model.Position;
import com.siriusgg.oot.model.places.*;

public class LinksHouse extends ExitMap {
    public LinksHouse() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[24]);
        initMap();
        setDoorExitsAmount(1);
        initExits();
        setExit(new LinksHouseToKokiriForest(), 0);
    }

    private static class LinksHouseToKokiriForest extends Exit {
        public LinksHouseToKokiriForest() {
            super(ExitType.DOOR_EXIT);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorExit(DoorExit.KF_LINKS_HOUSE);
            setSidePosition(new Position(10.0, 40.0));
            setTopPosition(new Position(11.5, 21.0));
        }
    }
}
