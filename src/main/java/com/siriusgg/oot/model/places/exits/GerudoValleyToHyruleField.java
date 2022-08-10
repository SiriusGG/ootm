package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class GerudoValleyToHyruleField extends Exit {
    public GerudoValleyToHyruleField(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.HYRULE_FIELD);
        setBothSidePositions(new Position(66.67, 39.24));
        setBothTopPositions(new Position(94.09, 64.47));
    }
}
