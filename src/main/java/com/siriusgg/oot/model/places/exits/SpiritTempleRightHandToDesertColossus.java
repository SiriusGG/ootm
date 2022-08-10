package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exitmaps.DesertColossus;

public class SpiritTempleRightHandToDesertColossus extends Exit {
    public SpiritTempleRightHandToDesertColossus(final ExitMap exitMap) {
        super(exitMap, ExitType.UNCHANGING);
        setDestinationExitMap(DesertColossus.class);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setUnchangingTransition(UnchangingTransition.SPIRIT_TEMPLE_RIGHT_HAND_TO_COLOSSUS);
        setBothSidePositions(new Position(10.81, 52.25));
        setBothTopPositions(new Position(63.55, 93.4));
    }
}
