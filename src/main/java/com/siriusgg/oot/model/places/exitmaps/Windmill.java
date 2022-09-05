package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.OoTMConstants;
import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.WindmillToKakariko;

public class Windmill extends ExitMap {
    public Windmill(final String seedName) {
        super(seedName);
        setPlace(PlaceWithMap.WINDMILL);
        setNiceName(OoTMConstants.NICE_PLACES_WITH_MAP[36]);
        initMap();
        setDoorExitsAmount(1);
        initExits();
        setExit(new WindmillToKakariko(this), 0);
        loadExitDestinationsFromSaveFile();
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 120;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 120;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 120;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 120;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
