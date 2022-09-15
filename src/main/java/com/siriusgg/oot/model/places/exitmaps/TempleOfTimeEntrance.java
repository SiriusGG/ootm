package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.*;
import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.SeedSettings;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.*;

public class TempleOfTimeEntrance extends ExitMap {
    public TempleOfTimeEntrance(final String seedName) {
        super(seedName);
        setPlace(PlaceWithMap.TEMPLE_OF_TIME_ENTRANCE);
        setNiceName(OoTMConstants.NICE_PLACES_WITH_MAP[33]);
        initMap();
        setDoorEntrancesAmount(1);
        setOverworldTransitionsAmount(1);
        initExits();
        setExit(new TempleOfTimeEntranceToTempleOfTime(this), 0);
        setExit(new TempleOfTimeEntranceToMarket(this), 1);
        loadExitDestinationsFromSaveFile();
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
		SeedSettings s = SeedSettings.getInstance(getSeedName());
        if (s.getPerspective() == Perspective.SIDE) {
            return 120;
        } else if (s.getPerspective() == Perspective.TOP) {
            return 120;
        } else {
            throw new UnknownPerspectiveException(s.getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
		SeedSettings s = SeedSettings.getInstance(getSeedName());
        if (s.getPerspective() == Perspective.SIDE) {
            return 120;
        } else if (s.getPerspective() == Perspective.TOP) {
            return 120;
        } else {
            throw new UnknownPerspectiveException(s.getPerspective());
        }
    }
}
