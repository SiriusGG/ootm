package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.OoTMConstants;
import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.*;

public class HauntedWasteland extends ExitMap {
    public HauntedWasteland(final String seedName) {
        super(seedName);
        setPlace(PlaceWithMap.HAUNTED_WASTELAND);
        setNiceName(OoTMConstants.NICE_PLACES_WITH_MAP[13]);
        initMap();
        setOverworldTransitionsAmount(2);
        setAccessibility(false, true);
        initExits();
        setExit(new HauntedWastelandToGerudosFortress(this), 0);
        setExit(new HauntedWastelandToDesertColossus(this), 1);
        loadExitDestinationsFromSaveFile();
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
		Settings s = Settings.getInstance(getSeedName());
        if (s.getPerspective() == Perspective.SIDE) {
            return 32;
        } else if (s.getPerspective() == Perspective.TOP) {
            return 40;
        } else {
            throw new UnknownPerspectiveException(s.getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
		Settings s = Settings.getInstance(getSeedName());
        if (s.getPerspective() == Perspective.SIDE) {
            return 32;
        } else if (s.getPerspective() == Perspective.TOP) {
            return 40;
        } else {
            throw new UnknownPerspectiveException(s.getPerspective());
        }
    }
}
