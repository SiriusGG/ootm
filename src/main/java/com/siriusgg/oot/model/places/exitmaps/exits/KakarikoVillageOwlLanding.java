package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class KakarikoVillageOwlLanding extends Exit {
    public KakarikoVillageOwlLanding(final ExitMap exitMap) {
        super(exitMap, ExitType.OWL_LANDING);
        intendedAccessibleAsChild(false);
        intendedAccessibleAsAdult(false);
        setOwlLanding(OwlLanding.KAKARIKO);
        setChildSidePosition(new Position(65.89, 40.44));
        setChildTopPosition(new Position(60.2, 92.24));
    }
}
