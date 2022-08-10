package com.siriusgg.oot.model.places.exitmaps.exits;

import com.siriusgg.oot.model.places.*;

public class LostWoodsToNearShortcutsGrotto extends Exit {
    public LostWoodsToNearShortcutsGrotto(final ExitMap exitMap) {
        super(exitMap, ExitType.GROTTO_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setGrottoEntrance(GrottoEntrance.LW_NEAR_SHORTCUTS_GROTTO);
        setBothSidePositions(new Position(67.58, 57.08));
        setBothTopPositions(new Position(59.89, 34.84));
    }
}
