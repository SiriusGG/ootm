package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.OoTMConstants;
import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.*;

public class ZorasFountain extends ExitMap {
    public ZorasFountain(final String seedName) {
        super(seedName);
        setPlace(PlaceWithMap.ZORAS_FOUNTAIN);
        setNiceName(OoTMConstants.NICE_PLACES_WITH_MAP[38]);
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
		Settings s = Settings.getInstance(getSeedName());
        if (s.getPerspective() == Perspective.SIDE) {
            return 60;
        } else if (s.getPerspective() == Perspective.TOP) {
            return 50;
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
            return 50;
        } else {
            throw new UnknownPerspectiveException(s.getPerspective());
        }
    }
}
