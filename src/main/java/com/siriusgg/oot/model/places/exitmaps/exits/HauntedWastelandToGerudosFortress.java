package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class HauntedWastelandToGerudosFortress extends Exit {
    public HauntedWastelandToGerudosFortress(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.GERUDOS_FORTRESS);
        setBothSidePositions(new Position(23.96, 14.73));
        setBothTopPositions(new Position(82.11, 60.76));
    }
}
