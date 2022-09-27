package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.constants.OoTMConstants;
import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.SeedSettings;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.LinksHouseToKokiriForest;

public class LinksHouse extends ExitMap {
    public LinksHouse(final String seedName) {
        super(seedName);
        setPlace(PlaceWithMap.LINKS_HOUSE);
        setNiceName(OoTMConstants.NICE_PLACES_WITH_MAP[24]);
        initMap();
        setDoorExitsAmount(1);
        initExits();
        setExit(new LinksHouseToKokiriForest(this), 0);
        loadExitDestinationsFromSaveFile();
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
		SeedSettings s = SeedSettings.getInstance(getSeedName());
        if (s.getPerspective() == Perspective.SIDE) {
            return 160;
        } else if (s.getPerspective() == Perspective.TOP) {
            return 300;
        } else {
            throw new UnknownPerspectiveException(s.getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
		SeedSettings s = SeedSettings.getInstance(getSeedName());
        if (s.getPerspective() == Perspective.SIDE) {
            return 160;
        } else if (s.getPerspective() == Perspective.TOP) {
            return 300;
        } else {
            throw new UnknownPerspectiveException(s.getPerspective());
        }
    }
}
