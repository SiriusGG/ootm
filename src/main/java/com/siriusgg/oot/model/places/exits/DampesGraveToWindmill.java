package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exitmaps.Windmill;

public class DampesGraveToWindmill extends Exit {
    public DampesGraveToWindmill(final ExitMap exitMap) {
        super(exitMap, ExitType.UNCHANGING);
        setDestinationExitMap(Windmill.class);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setUnchangingTransition(UnchangingTransition.DAMPES_GRAVE_TO_WINDMILL);
        setBothSidePositions(new Position(63.5, 0.5));
        setBothTopPositions(new Position(1.5, 84.0));
    }
}
