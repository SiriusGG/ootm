package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Constants;
import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.GerudoTrainingGroundToGerudosFortress;

public class GerudoTrainingGround extends ExitMap {
    public GerudoTrainingGround(final String seedName) {
        super(seedName);
        setPlace(PlaceWithMap.GERUDO_TRAINING_GROUND);
        setNiceName(Constants.NICE_PLACES_WITH_MAP[9]);
        initMap();
        setDungeonExitsAmount(1);
        initExits();
        setExit(new GerudoTrainingGroundToGerudosFortress(this), 0);
        loadExitDestinationsFromSaveFile();
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 40;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 44;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 40;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 44;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
