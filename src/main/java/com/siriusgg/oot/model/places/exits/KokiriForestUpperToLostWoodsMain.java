package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class KokiriForestUpperToLostWoodsMain extends Exit {
    public KokiriForestUpperToLostWoodsMain(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.LOST_WOODS);
        setChildSidePosition(new Position(34.46, 2.35));
        setAdultSidePosition(new Position(32.42, 2.67));
        setChildTopPosition(new Position(22.11, 20.25));
        setAdultTopPosition(new Position(22.53, 20.91));
    }
}
