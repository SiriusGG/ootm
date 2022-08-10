package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exitmaps.exits.*;

public class DeathMountainCrater extends ExitMap {
    public DeathMountainCrater() {
        super();
        setPlace(PlaceWithMap.DEATH_MOUNTAIN_CRATER);
        setName(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[2]);
        initMap();
        setDoorEntrancesAmount(1);
        setDungeonEntrancesAmount(1);
        setGrottoEntrancesAmount(2);
        setOverworldTransitionsAmount(2);
        initExits();
        setExit(new DeathMountainCraterToGreatFairy(this), 0);
        setExit(new DeathMountainCraterToFireTemple(this), 1);
        setExit(new DeathMountainCraterToDMCUpperGrotto(this), 2);
        setExit(new DeathMountainCraterToDMCHammerGrotto(this), 3);
        setExit(new DeathMountainCraterToDeathMountainTrail(this), 4);
        setExit(new DeathMountainCraterToGoronCity(this), 5);
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 50;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 45;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 50;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 45;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
