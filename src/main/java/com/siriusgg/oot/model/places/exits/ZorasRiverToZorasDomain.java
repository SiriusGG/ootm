package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class ZorasRiverToZorasDomain extends Exit {
    public ZorasRiverToZorasDomain(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.ZORAS_DOMAIN);
        setBothSidePositions(new Position(85.21, 11.92));
        setBothTopPositions(new Position(92.84, 6.02));
    }
}
