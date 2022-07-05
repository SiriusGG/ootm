package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;

public class InsideJabuJabusBelly extends ExitMap {
    public InsideJabuJabusBelly(final Settings settings) {
        super(settings);
        setName("Inside Jabu-Jabu's Belly");
        initMap();
        setDungeonExitsAmount(1);
        initExits();
        setExit(new InsideJabuJabusBellyToZorasFountain(), 0);
    }

    private static class InsideJabuJabusBellyToZorasFountain extends Exit {
        public InsideJabuJabusBellyToZorasFountain() {
            super(ExitType.DUNGEON_EXIT);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDungeonExit(DungeonExit.INSIDE_JABU_JABUS_BELLY);
        }
    }
}
