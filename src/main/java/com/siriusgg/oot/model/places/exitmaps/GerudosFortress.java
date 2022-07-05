package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;

public class GerudosFortress extends ExitMap {
    public GerudosFortress(final Settings settings) {
        super(settings);
        setName("Gerudo's Fortress");
        initMap();
        setDungeonEntrancesAmount(1);
        setGrottoEntrancesAmount(1);
        setOverworldTransitionsAmount(2);
        // ToDo: Add Thief's Hideout entrances as unchanging transitions
        setAccessibility(false, true);
        initExits();
        setExit(new GerudosFortressToGerudoTrainingGround(), 0);
        setExit(new GerudosFortressToStormsGrotto(), 1);
        // ToDo: Add Thief's Hideout entrances
    }

    private static class GerudosFortressToGerudoTrainingGround extends Exit {
        public GerudosFortressToGerudoTrainingGround() {
            super(ExitType.DUNGEON_ENTRANCE);
            setCanBeUsedAsChild(true);
            setCanBeUsedAsAdult(true);
            setDungeonEntrance(DungeonEntrance.GERUDO_TRAINING_GROUND);
        }
    }

    private static class GerudosFortressToStormsGrotto extends Exit {
        public GerudosFortressToStormsGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            setCanBeUsedAsChild(true);
            setCanBeUsedAsAdult(true);
            setGrottoEntrance(GrottoEntrance.GF_STORMS_GROTTO);
        }
    }

    // ToDo: Add Thief's Hideout entrances as unchanging transitions
}
