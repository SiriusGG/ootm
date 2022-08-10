package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exitmaps.ThievesHideout;

public class GerudosFortressToThievesHideoutC extends Exit {
    public GerudosFortressToThievesHideoutC(final ExitMap exitMap) {
        super(exitMap, ExitType.UNCHANGING);
        setDestinationExitMap(ThievesHideout.class);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_C_IN);
        setBothSidePositions(new Position(42.48, 70.02));
        setBothTopPositions(new Position(31.0, 47.11));
    }
}
