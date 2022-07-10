package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.places.*;

public class ShadowTemple extends ExitMap {
    public ShadowTemple() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[30]);
        initMap();
        setDungeonExitsAmount(1);
        initExits();
        setExit(new ShadowTempleToGraveyard(), 0);
    }

    private static class ShadowTempleToGraveyard extends Exit {
        public ShadowTempleToGraveyard() {
            super(ExitType.DUNGEON_EXIT);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDungeonExit(DungeonExit.SHADOW_TEMPLE);
        }
    }
}
