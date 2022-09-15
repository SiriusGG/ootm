package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.*;
import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.SeedSettings;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.*;

public class Graveyard extends ExitMap {
    public Graveyard(final String seedName) {
        super(seedName);
        setPlace(PlaceWithMap.GRAVEYARD);
        setNiceName(OoTMConstants.NICE_PLACES_WITH_MAP[12]);
        initMap();
        setDoorEntrancesAmount(1);
        setDungeonEntrancesAmount(1);
        setGrottoEntrancesAmount(4);
        setOverworldTransitionsAmount(1);
        initExits();
        setExit(new GraveyardToDampesHouse(this), 0);
        setExit(new GraveyardToShadowTemple(this), 1);
        setExit(new GraveyardToShieldGrave(this), 2);
        setExit(new GraveyardToHeartPieceGrave(this), 3);
        setExit(new GraveyardToRoyalFamilyTomb(this), 4);
        setExit(new GraveyardToDampesGrave(this), 5);
        setExit(new GraveyardToKakarikoVillage(this), 6);
        loadExitDestinationsFromSaveFile();
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
		SeedSettings s = SeedSettings.getInstance(getSeedName());
        if (s.getPerspective() == Perspective.SIDE) {
            return 34;
        } else if (s.getPerspective() == Perspective.TOP) {
            return 30;
        } else {
            throw new UnknownPerspectiveException(s.getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
		SeedSettings s = SeedSettings.getInstance(getSeedName());
        if (s.getPerspective() == Perspective.SIDE) {
            return 34;
        } else if (s.getPerspective() == Perspective.TOP) {
            return 30;
        } else {
            throw new UnknownPerspectiveException(s.getPerspective());
        }
    }
}
