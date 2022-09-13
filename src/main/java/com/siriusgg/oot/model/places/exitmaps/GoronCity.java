package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.OoTMConstants;
import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.*;

public class GoronCity extends ExitMap {
    public GoronCity(final String seedName) {
        super(seedName);
        setPlace(PlaceWithMap.GORON_CITY);
        setNiceName(OoTMConstants.NICE_PLACES_WITH_MAP[11]);
        initMap();
        setDoorEntrancesAmount(1);
        setGrottoEntrancesAmount(1);
        setOverworldTransitionsAmount(3);
        initExits();
        setExit(new GoronCityToGoronShop(this), 0);
        setExit(new GoronCityToGoronGrotto(this), 1);
        setExit(new GoronCityToDeathMountainTrail(this), 2);
        setExit(new GoronCityToLostWoods(this), 3);
        setExit(new GoronCityToDeathMountainCrater(this), 4);
        loadExitDestinationsFromSaveFile();
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
		Settings s = Settings.getInstance(getSeedName());
        if (s.getPerspective() == Perspective.SIDE) {
            return 50;
        } else if (s.getPerspective() == Perspective.TOP) {
            return 60;
        } else {
            throw new UnknownPerspectiveException(s.getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
		Settings s = Settings.getInstance(getSeedName());
        if (s.getPerspective() == Perspective.SIDE) {
            return 50;
        } else if (s.getPerspective() == Perspective.TOP) {
            return 60;
        } else {
            throw new UnknownPerspectiveException(s.getPerspective());
        }
    }
}
