package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.constants.OoTMConstants;
import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.SeedSettings;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.*;

public class LonLonRanch extends ExitMap {
    public LonLonRanch(final String seedName) {
        super(seedName);
        setPlace(PlaceWithMap.LON_LON_RANCH);
        setNiceName(OoTMConstants.NICE_PLACES_WITH_MAP[25]);
        initMap();
        setDoorEntrancesAmount(3);
        setGrottoEntrancesAmount(1);
        setOverworldTransitionsAmount(1);
        initExits();
        setExit(new LonLonRanchToTalonsHouse(this), 0);
        setExit(new LonLonRanchToStable(this), 1);
        setExit(new LonLonRanchToTower(this), 2);
        setExit(new LonLonRanchToGrotto(this), 3);
        setExit(new LonLonRanchToHyruleField(this), 4);
        loadExitDestinationsFromSaveFile();
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
		SeedSettings s = SeedSettings.getInstance(getSeedName());
        if (s.getPerspective() == Perspective.SIDE) {
            return 48;
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
            return 48;
        } else if (s.getPerspective() == Perspective.TOP) {
            return 44;
        } else {
            throw new UnknownPerspectiveException(s.getPerspective());
        }
    }
}
