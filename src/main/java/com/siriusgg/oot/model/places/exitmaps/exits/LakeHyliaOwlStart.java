package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class LakeHyliaOwlStart extends Exit {
    public LakeHyliaOwlStart(final ExitMap exitMap) {
        super(exitMap, ExitType.OWL_START);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(false);
        setOwlStart(OwlStart.LAKE_HYLIA);
        setChildSidePosition(new Position(19.92, 44.76));
        setChildTopPosition(new Position(16.83, 69.1));
    }
}
