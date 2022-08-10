package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exitmaps.ThievesHideout;

public class GerudosFortressToThievesHideoutH extends Exit {
    public GerudosFortressToThievesHideoutH(final ExitMap exitMap) {
        super(exitMap, ExitType.UNCHANGING);
        setDestinationExitMap(ThievesHideout.class);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_H_IN);
        setBothSidePositions(new Position(65.43, 68.17));
        setBothTopPositions(new Position(30.71, 78.01));
    }
}
