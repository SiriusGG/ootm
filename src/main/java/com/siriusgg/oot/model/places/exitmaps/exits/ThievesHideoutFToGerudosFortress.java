package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exitmaps.ThievesHideoutOutside;

public class ThievesHideoutFToGerudosFortress extends Exit {
    public ThievesHideoutFToGerudosFortress(final ExitMap exitMap) {
        super(exitMap, ExitType.UNCHANGING);
        setDestinationExitMap(ThievesHideoutOutside.class);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_F_OUT);
        setBothSidePositions(new Position(43.42, 62.93));
        setBothTopPositions(new Position(15.39, 81.94));
    }
}
