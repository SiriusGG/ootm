package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exitmaps.ThievesHideout;

public class GerudosFortressToThievesHideoutI extends Exit {
    public GerudosFortressToThievesHideoutI(final ExitMap exitMap) {
        super(exitMap, ExitType.UNCHANGING);
        setDestinationExitMap(ThievesHideout.class);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_I_IN);
        setBothSidePositions(new Position(73.42, 49.07));
        setBothTopPositions(new Position(54.71, 75.23));
    }
}
