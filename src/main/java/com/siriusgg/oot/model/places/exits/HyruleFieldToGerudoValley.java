package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class HyruleFieldToGerudoValley extends Exit {
    public HyruleFieldToGerudoValley(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.GERUDO_VALLEY);
        setBothSidePositions(new Position(21.22, 9.17));
        setBothTopPositions(new Position(0.1, 43.29));
    }
}
