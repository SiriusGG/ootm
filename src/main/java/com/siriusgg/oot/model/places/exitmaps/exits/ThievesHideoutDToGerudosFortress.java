package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exitmaps.ThievesHideoutOutside;

public class ThievesHideoutDToGerudosFortress extends Exit {
    public ThievesHideoutDToGerudosFortress(final ExitMap exitMap) {
        super(exitMap, ExitType.UNCHANGING);
        setDestinationExitMap(ThievesHideoutOutside.class);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_D_OUT);
        setBothSidePositions(new Position(24.61, 83.96));
        setBothTopPositions(new Position(0.45, 65.63));
    }
}
