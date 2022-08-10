package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class DesertColossusToHauntedWasteland extends Exit {
    public DesertColossusToHauntedWasteland(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.HAUNTED_WASTELAND);
        setBothSidePositions(new Position(79.5, 83.5));
        setBothTopPositions(new Position(89.0, 43.5));
    }
}
