package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exitmaps.InsideGanonsCastle;

public class OutsideGanonsCastleToInsideGanonsCastle extends Exit {
    public OutsideGanonsCastleToInsideGanonsCastle(final ExitMap exitMap) {
        super(exitMap, ExitType.UNCHANGING);
        setDestinationExitMap(InsideGanonsCastle.class);
        intendedAccessibleAsChild(false);
        intendedAccessibleAsAdult(true);
        setUnchangingTransition(UnchangingTransition.OUTSIDE_GANONS_CASTLE_TO_INSIDE_GANONS_CASTLE);
        setAdultSidePosition(new Position(53.19, 53.94));
        setAdultTopPosition(new Position(40.05, 33.68));
    }
}
