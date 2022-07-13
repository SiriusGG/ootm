package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.PermanentlyLoadedInformation;
import com.siriusgg.oot.model.places.*;

public class Windmill extends ExitMap {
    public Windmill() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[36]);
        initMap();
        setDoorExitsAmount(1);
        initExits();
        setExit(new WindmillToKakariko(), 0);
    }

    private static class WindmillToKakariko extends Exit {
        public WindmillToKakariko() {
            super(ExitType.DOOR_EXIT);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorExit(DoorExit.KAK_WINDMILL);
        }
    }
}
