package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class WindmillToKakariko extends Exit {
    public WindmillToKakariko(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_EXIT);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDoorExit(DoorExit.KAK_WINDMILL);
        setBothSidePositions(new Position(7.67, 79.51));
        setBothTopPositions(new Position(2.09, 47.34));
    }
}
