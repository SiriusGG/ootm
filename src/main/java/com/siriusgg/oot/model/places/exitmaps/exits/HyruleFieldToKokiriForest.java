package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class HyruleFieldToKokiriForest extends Exit {
    public HyruleFieldToKokiriForest(final ExitMap exitMap) {
        super(exitMap, ExitType.OVERWORLD);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setOverworld(Overworld.KOKIRI_FOREST);
        setBothSidePositions(new Position(70.38, 84.12));
        setBothTopPositions(new Position(90.18, 52.31));
    }
}
