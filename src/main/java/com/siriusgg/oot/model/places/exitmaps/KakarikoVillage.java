package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Constants;
import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.*;

public class KakarikoVillage extends ExitMap {
    public KakarikoVillage(final String seedName) {
        super(seedName);
        setPlace(PlaceWithMap.KAKARIKO_VILLAGE);
        setNiceName(Constants.NICE_PLACES_WITH_MAP[21]);
        initMap();
        setDoorEntrancesAmount(10);
        setDungeonEntrancesAmount(1);
        setGrottoEntrancesAmount(2);
        setOverworldTransitionsAmount(3);
        setHasOwlLanding(true);
        initExits();
        setExit(new KakarikoVillageToCarpenterBossHouse(this), 0);
        setExit(new KakarikoVillageToHouseOfSkulltula(this), 1);
        setExit(new KakarikoVillageToImpasHouseFront(this), 2);
        setExit(new KakarikoVillageToWindmill(this), 3);
        setExit(new KakarikoVillageToBazaar(this), 4);
        setExit(new KakarikoVillageToShootingGallery(this), 5);
        setExit(new KakarikoVillageToPotionShopFront(this), 6);
        setExit(new KakarikoVillageToOddMedicineBuilding(this), 7);
        setExit(new KakarikoVillageToPotionShopBack(this), 8);
        setExit(new KakarikoVillageToImpasHouseBack(this), 9);
        setExit(new KakarikoVillageToBottomOfTheWell(this), 10);
        setExit(new KakarikoVillageToRedeadGrotto(this), 11);
        setExit(new KakarikoVillageToOpenGrotto(this), 12);
        setExit(new KakarikoVillageToHyruleField(this), 13);
        setExit(new KakarikoVillageToGraveyard(this), 14);
        setExit(new KakarikoVillageToDeathMountainTrail(this), 15);
        setExit(new KakarikoVillageOwlLanding(this), 16);
        loadExitDestinationsFromSaveFile();
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 48;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 60;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 48;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 60;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
