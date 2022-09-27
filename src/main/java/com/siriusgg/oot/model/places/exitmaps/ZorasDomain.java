package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.constants.OoTMConstants;
import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.SeedSettings;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.*;

public class ZorasDomain extends ExitMap {
    public ZorasDomain(final String seedName) {
        super(seedName);
        setPlace(PlaceWithMap.ZORAS_DOMAIN);
        setNiceName(OoTMConstants.NICE_PLACES_WITH_MAP[37]);
        initMap();
        setDoorEntrancesAmount(1);
        setGrottoEntrancesAmount(1);
        setOverworldTransitionsAmount(3);
        initExits();
        setExit(new ZorasDomainToZoraShop(this), 0);
        setExit(new ZorasDomainToStormsGrotto(this), 1);
        setExit(new ZorasDomainToZorasRiver(this), 2);
        setExit(new ZorasDomainToLakeHylia(this), 3);
        setExit(new ZorasDomainToZorasFountain(this), 4);
        loadExitDestinationsFromSaveFile();
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
		SeedSettings s = SeedSettings.getInstance(getSeedName());
        if (s.getPerspective() == Perspective.SIDE) {
            return 60;
        } else if (s.getPerspective() == Perspective.TOP) {
            return 60;
        } else {
            throw new UnknownPerspectiveException(s.getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
		SeedSettings s = SeedSettings.getInstance(getSeedName());
        if (s.getPerspective() == Perspective.SIDE) {
            return 60;
        } else if (s.getPerspective() == Perspective.TOP) {
            return 60;
        } else {
            throw new UnknownPerspectiveException(s.getPerspective());
        }
    }
}
