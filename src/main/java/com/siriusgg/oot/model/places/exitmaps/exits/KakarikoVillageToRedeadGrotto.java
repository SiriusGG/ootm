package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class KakarikoVillageToRedeadGrotto extends Exit {
    public KakarikoVillageToRedeadGrotto(final ExitMap exitMap) {
        super(exitMap, ExitType.GROTTO_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setGrottoEntrance(GrottoEntrance.KAK_REDEAD_GROTTO);
        setBothSidePositions(new Position(43.1, 45.08));
        setBothTopPositions(new Position(55.77, 61.3));
    }
}
