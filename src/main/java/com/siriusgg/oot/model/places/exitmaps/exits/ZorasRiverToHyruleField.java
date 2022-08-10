package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class ZorasRiverToHyruleField extends Exit {
    public ZorasRiverToHyruleField(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.HYRULE_FIELD);
        setBothSidePositions(new Position(34.63, 92.59));
        setBothTopPositions(new Position(6.97, 89.1));
    }
}
