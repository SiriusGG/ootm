package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Constants;
import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.InsideGanonsCastleToOutsideGanonsCastle;

public class InsideGanonsCastle extends ExitMap {
    public InsideGanonsCastle(final String seedName) {
        super(seedName);
        setPlace(PlaceWithMap.INSIDE_GANONS_CASTLE);
        setNiceName(Constants.NICE_PLACES_WITH_MAP[17]);
        initMap();
        setDungeonExitsAmount(1);
        initExits();
        setExit(new InsideGanonsCastleToOutsideGanonsCastle(this), 0);
        loadExitDestinationsFromSaveFile();
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 54;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 60;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 54;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 60;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
