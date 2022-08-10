package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class KakarikoVillageToOpenGrotto extends Exit {
    public KakarikoVillageToOpenGrotto(final ExitMap exitMap) {
        super(exitMap, ExitType.GROTTO_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setGrottoEntrance(GrottoEntrance.KAK_OPEN_GROTTO);
        setBothSidePositions(new Position(52.18, 29.43));
        setBothTopPositions(new Position(73.11, 45.77));
    }
}
