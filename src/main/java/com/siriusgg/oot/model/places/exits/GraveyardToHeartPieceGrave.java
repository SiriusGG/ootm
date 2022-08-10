package com.siriusgg.oot.model.places.exits;

import com.siriusgg.oot.model.places.*;

public class GraveyardToHeartPieceGrave extends Exit {
    public GraveyardToHeartPieceGrave(final ExitMap exitMap) {
        super(exitMap, ExitType.GROTTO_ENTRANCE);
        intendedAccessibleAsChild(true);
        intendedAccessibleAsAdult(true);
        setGrottoEntrance(GrottoEntrance.GRAVEYARD_HEART_PIECE_GRAVE);
        setBothSidePositions(new Position(38.61, 56.19));
        setBothTopPositions(new Position(37.43, 61.38));
    }
}
