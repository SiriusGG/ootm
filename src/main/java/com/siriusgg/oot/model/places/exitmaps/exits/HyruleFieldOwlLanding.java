package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class HyruleFieldOwlLanding extends Exit {
    public HyruleFieldOwlLanding(final ExitMap exitMap) {
        super(exitMap, ExitType.OWL_LANDING);
        intendedAccessibleAsChild(false);
        intendedAccessibleAsAdult(false);
        setOwlLanding(OwlLanding.HYRULE_FIELD);
        setChildSidePosition(new Position(76.63, 29.75));
        setChildTopPosition(new Position(60.39, 12.62));
    }
}
