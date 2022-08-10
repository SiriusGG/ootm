package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class TempleOfTimeEntranceToMarket extends Exit {
    public TempleOfTimeEntranceToMarket(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.MARKET);
        setBothSidePositions(new Position(62.41, 85.07));
        setBothTopPositions(new Position(62.41, 85.07));
    }
}
