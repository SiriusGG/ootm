package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;

public class GerudoTrainingGround extends ExitMap {
    public GerudoTrainingGround(final Settings settings) {
        super(settings);
        setName("Gerudo Training Ground");
        initMap();
        setDungeonExitsAmount(1);
        initExits();
        setExit(new GerudoTrainingGroundToGerudosFortress(), 0);
    }

    private static class GerudoTrainingGroundToGerudosFortress extends Exit {
        public GerudoTrainingGroundToGerudosFortress() {
            super(ExitType.DUNGEON_EXIT);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDungeonExit(DungeonExit.GERUDO_TRAINING_GROUND);
        }
    }
}
