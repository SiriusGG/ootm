package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class KakarikoVillageToGraveyard extends Exit {
    public KakarikoVillageToGraveyard(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.GRAVEYARD);
        setBothSidePositions(new Position(93.77, 30.24));
        setBothTopPositions(new Position(94.95, 81.58));
    }
}
