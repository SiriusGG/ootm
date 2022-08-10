package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class HyruleFieldToKakarikoVillage extends Exit {
    public HyruleFieldToKakarikoVillage(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.KAKARIKO_VILLAGE);
        setBothSidePositions(new Position(95.77, 36.02));
        setBothTopPositions(new Position(84.53, 5.56));
    }
}
