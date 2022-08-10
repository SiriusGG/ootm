package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class LostWoodsToDekuTheater extends Exit {
    public LostWoodsToDekuTheater(final ExitMap exitMap) {
        super(exitMap, ExitType.GROTTO_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setGrottoEntrance(GrottoEntrance.DEKU_THEATER);
        setBothSidePositions(new Position(65.69, 38.27));
        setBothTopPositions(new Position(41.65, 23.03));
    }
}
