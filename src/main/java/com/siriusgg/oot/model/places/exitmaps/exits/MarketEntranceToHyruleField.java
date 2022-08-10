package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class MarketEntranceToHyruleField extends Exit {
    public MarketEntranceToHyruleField(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.HYRULE_FIELD);
        setBothSidePositions(new Position(84.81, 25.69));
        setBothTopPositions(new Position(84.81, 25.69));
    }
}
