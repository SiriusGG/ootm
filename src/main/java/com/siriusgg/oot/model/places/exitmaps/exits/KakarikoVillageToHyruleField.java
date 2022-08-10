package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class KakarikoVillageToHyruleField extends Exit {
    public KakarikoVillageToHyruleField(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.HYRULE_FIELD);
        setBothSidePositions(new Position(7.3, 86.33));
        setBothTopPositions(new Position(2.39, 85.52));
    }
}
