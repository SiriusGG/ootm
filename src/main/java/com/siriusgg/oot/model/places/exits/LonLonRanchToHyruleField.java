package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class LonLonRanchToHyruleField extends Exit {
    public LonLonRanchToHyruleField(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.HYRULE_FIELD);
        setBothSidePositions(new Position(2.73, 85.1));
        setBothTopPositions(new Position(86.21, 1.04));
    }
}
