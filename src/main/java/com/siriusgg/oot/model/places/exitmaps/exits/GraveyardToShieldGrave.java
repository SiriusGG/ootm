package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class GraveyardToShieldGrave extends Exit {
    public GraveyardToShieldGrave(final ExitMap exitMap) {
        super(exitMap, ExitType.GROTTO_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setGrottoEntrance(GrottoEntrance.GRAVEYARD_SHIELD_GRAVE);
        setBothSidePositions(new Position(26.95, 63.73));
        setBothTopPositions(new Position(28.71, 50.26));
    }
}
