package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exitmaps.DesertColossus;

public class SpiritTempleLeftHandToDesertColossus extends Exit {
    public SpiritTempleLeftHandToDesertColossus(final ExitMap exitMap) {
        super(exitMap, ExitType.UNCHANGING);
        setDestinationExitMap(DesertColossus.class);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setUnchangingTransition(UnchangingTransition.SPIRIT_TEMPLE_LEFT_HAND_TO_COLOSSUS);
        setBothSidePositions(new Position(66.21, 86.11));
        setBothTopPositions(new Position(83.95, 93.4));
    }
}
