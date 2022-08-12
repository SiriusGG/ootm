package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.*;

public class ZorasFountain extends ExitMap {
    public ZorasFountain(final String seedName) {
        super(seedName);
        setPlace(PlaceWithMap.ZORAS_FOUNTAIN);
        setName(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[38]);
        initMap();
        setDoorEntrancesAmount(1);
        setDungeonEntrancesAmount(2);
        setOverworldTransitionsAmount(1);
        initExits();
        setExit(new ZorasFountainToGreatFairy(this), 0);
        setExit(new ZorasFountainToInsideJabuJabusBelly(this), 1);
        setExit(new ZorasFountainToIceCavern(this), 2);
        setExit(new ZorasFountainToZorasDomain(this), 3);
        loadExitDestinationsFromSaveFile();
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 60;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 50;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 60;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 50;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
