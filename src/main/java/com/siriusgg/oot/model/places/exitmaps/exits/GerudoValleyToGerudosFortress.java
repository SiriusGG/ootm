package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class GerudoValleyToGerudosFortress extends Exit {
    public GerudoValleyToGerudosFortress(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.GERUDOS_FORTRESS);
        setBothSidePositions(new Position(11.01, 3.01));
        setBothTopPositions(new Position(1.29, 35.76));
    }
}
