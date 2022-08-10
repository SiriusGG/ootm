package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exitmaps.ThievesHideout;

public class GerudosFortressToThievesHideoutK extends Exit {
    public GerudosFortressToThievesHideoutK(final ExitMap exitMap) {
        super(exitMap, ExitType.UNCHANGING);
        setDestinationExitMap(ThievesHideout.class);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_K_IN);
        setBothSidePositions(new Position(54.39, 79.98));
        setBothTopPositions(new Position(26.29, 66.78));
    }
}
