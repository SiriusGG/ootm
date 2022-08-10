package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class MarketToTempleOfTimeEntrance extends Exit {
    public MarketToTempleOfTimeEntrance(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.TEMPLE_OF_TIME_ENTRANCE);
        setChildSidePosition(new Position(96.55, 75.84));
        setChildTopPosition(new Position(95.54, 28.36));
        setAdultSidePosition(new Position(95.05, 69.24));
        setAdultTopPosition(new Position(92.02, 27.89));
    }
}
