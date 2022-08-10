package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class GoronCityToLostWoods extends Exit {
    public GoronCityToLostWoods(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.LOST_WOODS);
        setBothSidePositions(new Position(29.52, 81.02));
        setBothTopPositions(new Position(71.07, 91.78));
    }
}
