package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class ZorasFountainToZorasDomain extends Exit {
    public ZorasFountainToZorasDomain(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.ZORAS_DOMAIN);
        setChildSidePosition(new Position(31.12, 74.34));
        setAdultSidePosition(new Position(26.04, 73.34));
        setBothTopPositions(new Position(12.25, 60.3));
    }
}
