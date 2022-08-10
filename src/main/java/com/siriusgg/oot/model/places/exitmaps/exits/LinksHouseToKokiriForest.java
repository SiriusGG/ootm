package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class LinksHouseToKokiriForest extends Exit {
    public LinksHouseToKokiriForest(final ExitMap exitMap) {
        super(exitMap, ExitType.DOOR_EXIT);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setDoorExit(DoorExit.KF_LINKS_HOUSE);
        setBothSidePositions(new Position(7.1, 22.55));
        setBothTopPositions(new Position(3.91, 6.37));
    }
}
