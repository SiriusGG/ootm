package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class HyruleFieldToLakeHylia extends Exit {
    public HyruleFieldToLakeHylia(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.LAKE_HYLIA);
        setBothSidePositions(new Position(3.65, 78.3));
        setBothTopPositions(new Position(25.87, 95.25));
    }
}
