package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class MarketToHyruleCastle extends Exit {
    public MarketToHyruleCastle(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.HYRULE_CASTLE);
        setChildSidePosition(new Position(91.93, 53.51));
        setChildTopPosition(new Position(66.64, 8.1));
        setAdultSidePosition(new Position(78.06, 25.13));
        setAdultTopPosition(new Position(40.31, 7.87));
    }
}
