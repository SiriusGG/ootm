package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exitmaps.ThievesHideoutOutside;

public class ThievesHideoutBToGerudosFortress extends Exit {
    public ThievesHideoutBToGerudosFortress(final ExitMap exitMap) {
        super(exitMap, ExitType.UNCHANGING);
        setDestinationExitMap(ThievesHideoutOutside.class);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_B_OUT);
        setBothSidePositions(new Position(0.5, 79.5));
        setBothTopPositions(new Position(0.45, 22.22));
    }
}
