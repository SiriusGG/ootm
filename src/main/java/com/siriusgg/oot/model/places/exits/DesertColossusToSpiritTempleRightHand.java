package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exitmaps.SpiritTemple;

public class DesertColossusToSpiritTempleRightHand extends Exit {
    public DesertColossusToSpiritTempleRightHand(final ExitMap exitMap) {
        super(exitMap, ExitType.UNCHANGING);
        setDestinationExitMap(SpiritTemple.class);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setUnchangingTransition(UnchangingTransition.DESERT_COLOSSUS_TO_SPIRIT_TEMPLE_RIGHT_HAND);
        setBothSidePositions(new Position(18.0, 35.0));
        setBothTopPositions(new Position(16.0, 52.0));
    }
}
