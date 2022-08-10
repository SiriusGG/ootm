package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class GraveyardToRoyalFamilyTomb extends Exit {
    public GraveyardToRoyalFamilyTomb(final ExitMap exitMap) {
        super(exitMap, ExitType.GROTTO_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setGrottoEntrance(GrottoEntrance.GRAVEYARD_ROYAL_FAMILYS_TOMB);
        setBothSidePositions(new Position(44.73, 41.82));
        setBothTopPositions(new Position(47.92, 43.65));
    }
}
