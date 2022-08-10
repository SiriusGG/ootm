package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class HyruleCastleToCastleGarden extends Exit {
    public HyruleCastleToCastleGarden(final ExitMap exitMap) {
        super(exitMap, ExitType.UNCHANGING);
        setDestinationString("Castle Garden");
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(false);
        setUnchangingTransition(UnchangingTransition.HYRULE_CASTLE_TO_CASTLE_GARDEN);
        setChildSidePosition(new Position(85.81, 54.4));
        setChildTopPosition(new Position(45.49, 6.02));
    }
}
