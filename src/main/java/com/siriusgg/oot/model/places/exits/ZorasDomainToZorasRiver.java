package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class ZorasDomainToZorasRiver extends Exit {
    public ZorasDomainToZorasRiver(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.ZORAS_RIVER);
        setBothSidePositions(new Position(32.24, 81.83));
        setBothTopPositions(new Position(1.28, 79.17));
    }
}
