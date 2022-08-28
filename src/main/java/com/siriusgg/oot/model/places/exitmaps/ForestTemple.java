package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Constants;
import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.ForestTempleToSacredForestMeadow;

public class ForestTemple extends ExitMap {
    public ForestTemple(final String seedName) {
        super(seedName);
        setPlace(PlaceWithMap.FOREST_TEMPLE);
        setNiceName(Constants.NICE_PLACES_WITH_MAP[7]);
        initMap();
        setDungeonExitsAmount(1);
        initExits();
        setExit(new ForestTempleToSacredForestMeadow(this), 0);
        loadExitDestinationsFromSaveFile();
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 60;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 50;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 60;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 50;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
