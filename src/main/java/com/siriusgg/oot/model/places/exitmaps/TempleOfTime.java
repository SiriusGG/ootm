package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;

public class TempleOfTime extends ExitMap {
    public TempleOfTime(final Settings settings) {
        super(settings);
        setName("Temple of Time");
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
