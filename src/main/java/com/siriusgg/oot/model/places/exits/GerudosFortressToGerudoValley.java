package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class GerudosFortressToGerudoValley extends Exit {
    public GerudosFortressToGerudoValley(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.GERUDO_VALLEY);
        setBothSidePositions(new Position(53.75, 95.5));
        setBothTopPositions(new Position(31.0, 76.5));
    }
}
