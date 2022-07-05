package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;

public class Windmill extends ExitMap {
    public Windmill(final Settings settings) {
        super(settings);
        setName("Windmill");
        initMap();
        setDoorExitsAmount(1);
        setUnchangingTransitionsAmount(1);
        initExits();
        setExit(new WindmillToKakariko(), 0);
    }

    private static class WindmillToKakariko extends Exit {
        public WindmillToKakariko() {
            super(ExitType.DOOR_EXIT);
            setCanBeUsedAsChild(true);
            setCanBeUsedAsAdult(true);
            setDoorExit(DoorExit.KAK_WINDMILL);
        }
    }
}
