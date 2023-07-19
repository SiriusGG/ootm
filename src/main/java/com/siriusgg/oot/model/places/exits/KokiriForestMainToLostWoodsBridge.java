package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class KokiriForestMainToLostWoodsBridge extends Exit {
    public KokiriForestMainToLostWoodsBridge(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.LOST_WOODS);
        setChildSidePosition(new Position(12.38, 19.83));
        setAdultSidePosition(new Position(9.83, 19.34));
        setChildTopPosition(new Position(4.81, 42.01));
        setAdultTopPosition(new Position(5.08, 51.78));
    }
}
