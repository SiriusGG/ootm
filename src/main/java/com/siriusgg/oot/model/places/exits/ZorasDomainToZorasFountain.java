package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class ZorasDomainToZorasFountain extends Exit {
    public ZorasDomainToZorasFountain(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.ZORAS_FOUNTAIN);
        setBothSidePositions(new Position(4.98, 11.11));
        setBothTopPositions(new Position(52.56, 1.5));
    }
}
