package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exitmaps.ThievesHideoutOutside;

public class ThievesHideoutKToGerudosFortress extends Exit {
    public ThievesHideoutKToGerudosFortress(final ExitMap exitMap) {
        super(exitMap, ExitType.UNCHANGING);
        setDestinationExitMap(ThievesHideoutOutside.class);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_K_OUT);
        setBothSidePositions(new Position(85.35, 42.46));
        setBothTopPositions(new Position(72.6, 66.9));
    }
}
