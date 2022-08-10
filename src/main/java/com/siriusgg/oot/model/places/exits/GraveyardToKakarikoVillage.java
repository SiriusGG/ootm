package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class GraveyardToKakarikoVillage extends Exit {
    public GraveyardToKakarikoVillage(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.KAKARIKO_VILLAGE);
        setBothSidePositions(new Position(2.8, 90.61));
        setBothTopPositions(new Position(0.72, 71.96));
    }
}
