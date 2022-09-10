package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class LakeHyliaToZorasDomain extends Exit {
    public LakeHyliaToZorasDomain(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(false);
        setOverworld(Overworld.ZORAS_DOMAIN);
        setBothSidePositions(new Position(56.58, 57.34));
        setBothTopPositions(new Position(45.92, 48.73));
    }
}
