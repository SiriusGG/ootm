package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.Constants;
import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.*;

public class LostWoods extends ExitMap {
    public LostWoods(final String seedName) {
        super(seedName);
        setPlace(PlaceWithMap.LOST_WOODS);
        setNiceName(Constants.NICE_PLACES_WITH_MAP[26]);
        initMap();
        setGrottoEntrancesAmount(3);
        setOverworldTransitionsAmount(6);
        initExits();
        setExit(new LostWoodsToNearShortcutsGrotto(this), 0);
        setExit(new LostWoodsToDekuTheater(this), 1);
        setExit(new LostWoodsToScrubsGrotto(this), 2);
        setExit(new LostWoodsToKokiriForestUpper(this), 3);
        setExit(new LostWoodsToKokiriForestBridge(this), 4);
        setExit(new LostWoodsToHyruleField(this), 5);
        setExit(new LostWoodsToGoronCity(this), 6);
        setExit(new LostWoodsToZorasRiver(this), 7);
        setExit(new LostWoodsToSacredForestMeadow(this), 8);
        loadExitDestinationsFromSaveFile();
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 32;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 40;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 32;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 40;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
