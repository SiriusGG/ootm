package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.Constants;
import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.*;

public class SacredForestMeadow extends ExitMap {
    public SacredForestMeadow(final String seedName) {
        super(seedName);
        setPlace(PlaceWithMap.SACRED_FOREST_MEADOW);
        setNiceName(Constants.NICE_PLACES_WITH_MAP[29]);
        initMap();
        setDungeonEntrancesAmount(1);
        setGrottoEntrancesAmount(3);
        setOverworldTransitionsAmount(1);
        initExits();
        setExit(new SacredForestMeadowToForestTemple(this), 0);
        setExit(new SacredForestMeadowToWolfosGrotto(this), 1);
        setExit(new SacredForestMeadowToFairyGrotto(this), 2);
        setExit(new SacredForestMeadowToStormsGrotto(this), 3);
        setExit(new SacredForestMeadowToLostWoods(this), 4);
        loadExitDestinationsFromSaveFile();
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 50;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 40;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 50;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 40;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
