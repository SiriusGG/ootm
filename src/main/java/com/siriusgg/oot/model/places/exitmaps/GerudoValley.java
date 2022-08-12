package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.*;

public class GerudoValley extends ExitMap {
    public GerudoValley(final String seedName) {
        super(seedName);
        setPlace(PlaceWithMap.GERUDO_VALLEY);
        setName(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[10]);
        initMap();
        setDoorEntrancesAmount(1);
        setGrottoEntrancesAmount(2);
        setOverworldTransitionsAmount(2);
        setUnchangingTransitionsAmount(1);
        initExits();
        setExit(new GerudoValleyToCarpenterTent(this), 0);
        setExit(new GerudoValleyToOctorokGrotto(this), 1);
        setExit(new GerudoValleyToStormsGrotto(this), 2);
        setExit(new GerudoValleyToHyruleField(this), 3);
        setExit(new GerudoValleyToGerudosFortress(this), 4);
        setExit(new GerudoValleyToLakeHylia(this), 5);
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
