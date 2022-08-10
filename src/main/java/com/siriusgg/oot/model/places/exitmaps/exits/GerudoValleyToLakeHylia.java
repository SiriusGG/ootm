package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exitmaps.LakeHylia;

public class GerudoValleyToLakeHylia extends Exit {
    public GerudoValleyToLakeHylia(final ExitMap exitMap) {
        super(exitMap, ExitType.UNCHANGING);
        setDestinationExitMap(LakeHylia.class);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setUnchangingTransition(UnchangingTransition.GERUDO_VALLEY_TO_LAKE_HYLIA);
        setBothSidePositions(new Position(5.43, 91.44));
        setBothTopPositions(new Position(79.56, 90.28));
    }
}
