package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class HyruleFieldToLonLonRanch extends Exit {
    public HyruleFieldToLonLonRanch(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.KOKIRI_FOREST);
        setBothSidePositions(new Position(52.41, 33.33));
        setBothTopPositions(new Position(48.61, 38.89));
    }
}
