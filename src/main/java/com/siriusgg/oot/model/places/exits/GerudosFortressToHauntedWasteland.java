package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class GerudosFortressToHauntedWasteland extends Exit {
    public GerudosFortressToHauntedWasteland(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.HAUNTED_WASTELAND);
        setBothSidePositions(new Position(7.1, 90.75));
        setBothTopPositions(new Position(2.3, 36.0));
    }
}
