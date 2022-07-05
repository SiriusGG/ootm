package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;

public class ShadowTemple extends ExitMap {
    public ShadowTemple(final Settings settings) {
        super(settings);
        setName("Shadow Temple");
        initMap();
        setDungeonExitsAmount(1);
        initExits();
        setExit(new ShadowTempleToGraveyard(), 0);
    }

    private static class ShadowTempleToGraveyard extends Exit {
        public ShadowTempleToGraveyard() {
            super(ExitType.DUNGEON_EXIT);
            setCanBeUsedAsChild(true);
            setCanBeUsedAsAdult(true);
            setDungeonExit(DungeonExit.SHADOW_TEMPLE);
        }
    }
}
