package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exitmaps.SpiritTemple;

public class DesertColossusToSpiritTempleLeftHand extends Exit {
    public DesertColossusToSpiritTempleLeftHand(final ExitMap exitMap) {
        super(exitMap, ExitType.UNCHANGING);
        setDestinationExitMap(SpiritTemple.class);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setUnchangingTransition(UnchangingTransition.DESERT_COLOSSUS_TO_SPIRIT_TEMPLE_LEFT_HAND);
        setBothSidePositions(new Position(26.0, 30.0));
        setBothTopPositions(new Position(16.0, 40.0));
    }
}
