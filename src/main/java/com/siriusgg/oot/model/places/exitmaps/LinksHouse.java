package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.LinksHouseToKokiriForest;

public class LinksHouse extends ExitMap {
    public LinksHouse(final String seedName) {
        super(seedName);
        setPlace(PlaceWithMap.LINKS_HOUSE);
        setNiceName(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[24]);
        initMap();
        setDoorExitsAmount(1);
        initExits();
        setExit(new LinksHouseToKokiriForest(this), 0);
        loadExitDestinationsFromSaveFile();
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 160;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 300;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 160;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 300;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
