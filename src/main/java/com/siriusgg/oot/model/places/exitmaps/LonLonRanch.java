package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.*;

public class LonLonRanch extends ExitMap {
    public LonLonRanch(final String seedName) {
        super(seedName);
        setPlace(PlaceWithMap.LON_LON_RANCH);
        setNiceName(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[25]);
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
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 48;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 44;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 48;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 44;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
