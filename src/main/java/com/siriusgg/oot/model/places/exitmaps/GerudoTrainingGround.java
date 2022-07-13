package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.PermanentlyLoadedInformation;
import com.siriusgg.oot.model.places.*;

public class GerudoTrainingGround extends ExitMap {
    public GerudoTrainingGround() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[9]);
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
