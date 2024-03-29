package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.constants.OoTMConstants;
import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.SeedSettings;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.*;

public class DeathMountainTrail extends ExitMap {
    public DeathMountainTrail(final String seedName) {
        super(seedName);
        setPlace(PlaceWithMap.DEATH_MOUNTAIN_TRAIL);
        setNiceName(OoTMConstants.NICE_PLACES_WITH_MAP[3]);
        initMap();
        setDoorEntrancesAmount(1);
        setDungeonEntrancesAmount(1);
        setGrottoEntrancesAmount(2);
        setOverworldTransitionsAmount(3);
        setHasOwlStart(true);
        initExits();
        setExit(new DeathMountainTrailToGreatFairy(this), 0);
        setExit(new DeathMountainTrailToDodongosCavern(this), 1);
        setExit(new DeathMountainTrailToCowGrotto(this), 2);
        setExit(new DeathMountainTrailToStormsGrotto(this), 3);
        setExit(new DeathMountainTrailToKakarikoVillage(this), 4);
        setExit(new DeathMountainTrailToGoronCity(this), 5);
        setExit(new DeathMountainTrailToDeathMountainCrater(this), 6);
        setExit(new DeathMountainTrailOwl(this), 7);
        loadExitDestinationsFromSaveFile();
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
		SeedSettings s = SeedSettings.getInstance(getSeedName());
        if (s.getPerspective() == Perspective.SIDE) {
            return 44;
        } else if (s.getPerspective() == Perspective.TOP) {
            return 40;
        } else {
            throw new UnknownPerspectiveException(s.getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
		SeedSettings s = SeedSettings.getInstance(getSeedName());
        if (s.getPerspective() == Perspective.SIDE) {
            return 44;
        } else if (s.getPerspective() == Perspective.TOP) {
            return 40;
        } else {
            throw new UnknownPerspectiveException(s.getPerspective());
        }
    }
}
