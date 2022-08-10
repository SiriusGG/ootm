package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class MarketEntranceToMarket extends Exit {
    public MarketEntranceToMarket(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.MARKET);
        setBothSidePositions(new Position(19.27, 84.72));
        setBothTopPositions(new Position(19.27, 84.72));
    }
}
