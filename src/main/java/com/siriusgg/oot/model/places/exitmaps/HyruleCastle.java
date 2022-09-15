package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.*;
import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.SeedSettings;
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
