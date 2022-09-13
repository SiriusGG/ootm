package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.OoTMConstants;
import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.IceCavernToZorasFountain;

public class IceCavern extends ExitMap {
    public IceCavern(final String seedName) {
        super(seedName);
        setPlace(PlaceWithMap.ICE_CAVERN);
        setNiceName(OoTMConstants.NICE_PLACES_WITH_MAP[16]);
        initMap();
        setDungeonExitsAmount(1);
        initExits();
        setExit(new IceCavernToZorasFountain(this), 0);
        loadExitDestinationsFromSaveFile();
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
		Settings s = Settings.getInstance(getSeedName());
        if (s.getPerspective() == Perspective.SIDE) {
            return 60;
        } else if (s.getPerspective() == Perspective.TOP) {
            return 44;
        } else {
            throw new UnknownPerspectiveException(s.getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
		Settings s = Settings.getInstance(getSeedName());
        if (s.getPerspective() == Perspective.SIDE) {
            return 60;
        } else if (s.getPerspective() == Perspective.TOP) {
            return 44;
        } else {
            throw new UnknownPerspectiveException(s.getPerspective());
        }
    }
}
