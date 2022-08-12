package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.*;

public class ZorasDomain extends ExitMap {
    public ZorasDomain(final String seedName) {
        super(seedName);
        setPlace(PlaceWithMap.ZORAS_DOMAIN);
        setName(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[37]);
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
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 60;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 60;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 60;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 60;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
