package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exitmaps.exits.*;

public class GoronCity extends ExitMap {
    public GoronCity() {
        super();
        setPlace(PlaceWithMap.GORON_CITY);
        setName(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[11]);
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
    }











    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 50;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 60;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 50;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 60;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
