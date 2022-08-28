package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exitmaps.HyruleCastle;

public class InsideGanonsCastleToOutsideGanonsCastle extends Exit {
    public InsideGanonsCastleToOutsideGanonsCastle(final ExitMap exitMap) {
        super(exitMap, ExitType.UNCHANGING);
        setDestinationExitMap(HyruleCastle.class);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setUnchangingTransition(UnchangingTransition.INSIDE_GANONS_CASTLE_TO_OUTSIDE_GANONS_CASTLE);
        setBothSidePositions(new Position(10.49, 58.17));
        setBothTopPositions(new Position(40.6, 89.12));
    }
}
