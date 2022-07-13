package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.PermanentlyLoadedInformation;
import com.siriusgg.oot.model.places.*;

public class InsideGanonsCastle extends ExitMap {
    public InsideGanonsCastle() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[17]);
        initMap();
        setDungeonExitsAmount(1);
        initExits();
        setExit(new InsideGanonsCastleToHyruleCastle(), 0);
    }

    private static class InsideGanonsCastleToHyruleCastle extends Exit {
        public InsideGanonsCastleToHyruleCastle() {
            super(ExitType.DUNGEON_EXIT);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDungeonExit(DungeonExit.INSIDE_GANONS_CASTLE);
        }
    }
}
