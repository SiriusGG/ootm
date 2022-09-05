package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.OoTMConstants;
import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.*;

public class HyruleCastle extends ExitMap {
    public HyruleCastle(final String seedName) {
        super(seedName);
        setPlace(PlaceWithMap.HYRULE_CASTLE);
        setNiceName(OoTMConstants.NICE_PLACES_WITH_MAP[14]);
        initMap();
        setDoorEntrancesAmount(2);
        setDungeonEntrancesAmount(1);
        setGrottoEntrancesAmount(1);
        setOverworldTransitionsAmount(1);
        setUnchangingTransitionsAmount(1);
        initExits();
        setExit(new HyruleCastleToHCGreatFairy(this), 0);
        setExit(new OutsideGanonsCastleToOGCGreatFairy(this), 1);
        setExit(new OutsideGanonsCastleToInsideGanonsCastle(this), 2);
        setExit(new HyruleCastleToStormsGrotto(this), 3);
        setExit(new HyruleCastleToMarket(this), 4);
        setExit(new HyruleCastleToCastleGarden(this), 5);
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
