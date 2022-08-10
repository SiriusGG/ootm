package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exitmaps.ThievesHideout;

public class GerudosFortressToThievesHideoutD extends Exit {
    public GerudosFortressToThievesHideoutD(final ExitMap exitMap) {
        super(exitMap, ExitType.UNCHANGING);
        setDestinationExitMap(ThievesHideout.class);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_D_IN);
        setBothSidePositions(new Position(55.34, 68.63));
        setBothTopPositions(new Position(44.43, 53.47));
    }
}
