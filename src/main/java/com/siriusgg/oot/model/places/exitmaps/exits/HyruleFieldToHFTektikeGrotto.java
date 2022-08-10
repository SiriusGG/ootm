package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class HyruleFieldToHFTektikeGrotto extends Exit {
    public HyruleFieldToHFTektikeGrotto(final ExitMap exitMap) {
        super(exitMap, ExitType.GROTTO_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setGrottoEntrance(GrottoEntrance.HF_TEKTITE_GROTTO);
        setBothSidePositions(new Position(54.36, 16.11));
        setBothTopPositions(new Position(32.1, 19.68));
    }
}
