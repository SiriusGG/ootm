package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.*;

public class ZorasRiver extends ExitMap {
    public ZorasRiver(final String seedName) {
        super(seedName);
        setPlace(PlaceWithMap.ZORAS_RIVER);
        setName(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[39]);
        initMap();
        setGrottoEntrancesAmount(3);
        setOverworldTransitionsAmount(3);
        initExits();
        setExit(new ZorasRiverToOpenGrotto(this), 0);
        setExit(new ZorasRiverToFairyGrotto(this), 1);
        setExit(new ZorasRiverToStormsGrotto(this), 2);
        setExit(new ZorasRiverToHyruleField(this), 3);
        setExit(new ZorasRiverToZorasDomain(this), 4);
        setExit(new ZorasRiverToLostWoods(this), 5);
        loadExitDestinationsFromSaveFile();
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 40;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 40;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 40;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 40;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
