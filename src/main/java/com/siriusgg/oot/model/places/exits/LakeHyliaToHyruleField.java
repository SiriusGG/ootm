package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class LakeHyliaToHyruleField extends Exit {
    public LakeHyliaToHyruleField(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.HYRULE_FIELD);
        setBothSidePositions(new Position(89.45, 8.39));
        setBothTopPositions(new Position(38.24, 3.36));
    }
}
