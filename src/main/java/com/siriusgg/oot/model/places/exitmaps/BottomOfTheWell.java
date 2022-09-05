package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.OoTMConstants;
import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.BottomOfTheWellToKakariko;

public class BottomOfTheWell extends ExitMap {
    public BottomOfTheWell(final String seedName) {
        super(seedName);
        setPlace(PlaceWithMap.BOTTOM_OF_THE_WELL);
        setNiceName(OoTMConstants.NICE_PLACES_WITH_MAP[0]);
        initMap();
        setDungeonExitsAmount(1);
        initExits();
        setExit(new BottomOfTheWellToKakariko(this), 0);
        loadExitDestinationsFromSaveFile();
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 80;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 66;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 80;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 66;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
