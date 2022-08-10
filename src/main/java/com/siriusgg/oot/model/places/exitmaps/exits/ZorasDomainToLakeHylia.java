package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class ZorasDomainToLakeHylia extends Exit {
    public ZorasDomainToLakeHylia(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(false);
        setOverworld(Overworld.LAKE_HYLIA);
        setBothSidePositions(new Position(65.77, 73.5));
        setBothTopPositions(new Position(47.59, 71.53));
    }
}
