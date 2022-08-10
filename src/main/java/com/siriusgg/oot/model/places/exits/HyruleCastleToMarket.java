package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class HyruleCastleToMarket extends Exit {
    public HyruleCastleToMarket(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.MARKET);
        setChildSidePosition(new Position(17.96, 92.71));
        setChildTopPosition(new Position(32.27, 84.72));
        setAdultSidePosition(new Position(8.66, 91.09));
        setAdultTopPosition(new Position(45.2, 92.48));
    }
}
