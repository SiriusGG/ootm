package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class LostWoodsToHyruleField extends Exit {
    public LostWoodsToHyruleField(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.HYRULE_FIELD);
        setBothSidePositions(new Position(8.85, 68.14));
        setBothTopPositions(new Position(5.89, 82.64));
    }
}
