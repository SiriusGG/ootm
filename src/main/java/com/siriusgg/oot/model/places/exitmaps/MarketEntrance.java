package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.*;

public class MarketEntrance extends ExitMap {
    public MarketEntrance(final String seedName) {
        super(seedName);
        setPlace(PlaceWithMap.MARKET_ENTRANCE);
        setName(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[28]);
        initMap();
        setDoorEntrancesAmount(1);
        setOverworldTransitionsAmount(2);
        initExits();
        setExit(new MarketEntranceToGuardHouse(this), 0);
        setExit(new MarketEntranceToHyruleField(this), 1);
        setExit(new MarketEntranceToMarket(this), 2);
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
