package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.OoTMConstants;
import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.TempleOfTimeToTempleOfTimeEntrance;

public class TempleOfTime extends ExitMap {
    public TempleOfTime(final String seedName) {
        super(seedName);
        setPlace(PlaceWithMap.TEMPLE_OF_TIME);
        setNiceName(OoTMConstants.NICE_PLACES_WITH_MAP[32]);
        initMap();
        setDoorExitsAmount(1);
        initExits();
        setExit(new TempleOfTimeToTempleOfTimeEntrance(this), 0);
        loadExitDestinationsFromSaveFile();
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 60;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 60;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 60;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 60;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
