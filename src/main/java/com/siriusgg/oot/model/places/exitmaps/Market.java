package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.constants.OoTMConstants;
import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.SeedSettings;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.*;

public class Market extends ExitMap {
    public Market(final String seedName) {
        super(seedName);
        setPlace(PlaceWithMap.MARKET);
        setNiceName(OoTMConstants.NICE_PLACES_WITH_MAP[27]);
        initMap();
        setDoorEntrancesAmount(9);
        setOverworldTransitionsAmount(3);
        initExits();
        setExit(new MarketToTreasureChestGame(this), 0);
        setExit(new MarketToBombchuShop(this), 1);
        setExit(new MarketToDogLadyHouse(this), 2);
        setExit(new MarketToManInGreenHouse(this), 3);
        setExit(new MarketToBombchuBowling(this), 4);
        setExit(new MarketToShootingGallery(this), 5);
        setExit(new MarketToMaskShop(this), 6);
        setExit(new MarketToPotionShop(this), 7);
        setExit(new MarketToBazaar(this), 8);
        setExit(new MarketToMarketEntrance(this), 9);
        setExit(new MarketToTempleOfTimeEntrance(this), 10);
        setExit(new MarketToHyruleCastle(this), 11);
        loadExitDestinationsFromSaveFile();
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
		SeedSettings s = SeedSettings.getInstance(getSeedName());
        if (s.getPerspective() == Perspective.SIDE) {
            return 50;
        } else if (s.getPerspective() == Perspective.TOP) {
            return 50;
        } else {
            throw new UnknownPerspectiveException(s.getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
		SeedSettings s = SeedSettings.getInstance(getSeedName());
        if (s.getPerspective() == Perspective.SIDE) {
            return 50;
        } else if (s.getPerspective() == Perspective.TOP) {
            return 50;
        } else {
            throw new UnknownPerspectiveException(s.getPerspective());
        }
    }
}
