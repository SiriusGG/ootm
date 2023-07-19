package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.constants.OoTMConstants;
import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.SeedSettings;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.GerudoTrainingGroundToGerudosFortress;

public class GerudoTrainingGround extends ExitMap {
    public GerudoTrainingGround(final String seedName) {
        super(seedName);
        setPlace(PlaceWithMap.GERUDO_TRAINING_GROUND);
        setNiceName(OoTMConstants.NICE_PLACES_WITH_MAP[9]);
        initMap();
        setDungeonExitsAmount(1);
        initExits();
        setExit(new GerudoTrainingGroundToGerudosFortress(this), 0);
        loadExitDestinationsFromSaveFile();
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
		SeedSettings s = SeedSettings.getInstance(getSeedName());
        if (s.getPerspective() == Perspective.SIDE) {
            return 40;
        } else if (s.getPerspective() == Perspective.TOP) {
            return 44;
        } else {
            throw new UnknownPerspectiveException(s.getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
		SeedSettings s = SeedSettings.getInstance(getSeedName());
        if (s.getPerspective() == Perspective.SIDE) {
            return 40;
        } else if (s.getPerspective() == Perspective.TOP) {
            return 44;
        } else {
            throw new UnknownPerspectiveException(s.getPerspective());
        }
    }
}
