package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exitmaps.ThievesHideoutOutside;

public class ThievesHideoutJToGerudosFortress extends Exit {
    public ThievesHideoutJToGerudosFortress(final ExitMap exitMap) {
        super(exitMap, ExitType.UNCHANGING);
        setDestinationExitMap(ThievesHideoutOutside.class);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_J_OUT);
        setBothSidePositions(new Position(75.98, 12.03));
        setBothTopPositions(new Position(94.87, 22.8));
    }
}
