package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.places.*;

public class TempleOfTime extends ExitMap {
    public TempleOfTime() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[32]);
        initMap();
        setDoorExitsAmount(1);
        initExits();
        setExit(new TempleOfTimeToToTEntrance(), 0);
    }

    private static class TempleOfTimeToToTEntrance extends Exit {
        public TempleOfTimeToToTEntrance() {
            super(ExitType.DOOR_EXIT);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorExit(DoorExit.TEMPLE_OF_TIME);
        }
    }
}
