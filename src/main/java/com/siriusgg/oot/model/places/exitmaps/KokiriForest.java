package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.*;

public class KokiriForest extends ExitMap {
    public KokiriForest(final String seedName) {
        super(seedName);
        setPlace(PlaceWithMap.KOKIRI_FOREST);
        setNiceName(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[22]);
        initMap();
        setDoorEntrancesAmount(6);
        setDungeonEntrancesAmount(1);
        setGrottoEntrancesAmount(1);
        setOverworldTransitionsAmount(2);
        initExits();
        setExit(new KokiriForestToLinksHouse(this), 0);
        setExit(new KokiriForestToMidosHouse(this), 1);
        setExit(new KokiriForestToSariasHouse(this), 2);
        setExit(new KokiriForestToHouseOfTwins(this), 3);
        setExit(new KokiriForestToKnowItAllHouse(this), 4);
        setExit(new KokiriForestToKokiriShop(this), 5);
        setExit(new KokiriForestToInsideTheDekuTree(this), 6);
        setExit(new KokiriForestToStormsGrotto(this), 7);
        setExit(new KokiriForestUpperToLostWoodsMain(this), 8);
        setExit(new KokiriForestMainToLostWoodsBridge(this), 9);
        loadExitDestinationsFromSaveFile();
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 54;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 54;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 54;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 54;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
