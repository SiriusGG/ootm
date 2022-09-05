package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.OoTMConstants;
import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.*;

public class HyruleField extends ExitMap {
    public HyruleField(final String seedName) {
        super(seedName);
        setPlace(PlaceWithMap.HYRULE_FIELD);
        setNiceName(OoTMConstants.NICE_PLACES_WITH_MAP[15]);
        initMap();
        setGrottoEntrancesAmount(8);
        setOverworldTransitionsAmount(7);
        setHasOwlLanding(true);
        initExits();
        setExit(new HyruleFieldToHFSouthEastGrotto(this), 0);
        setExit(new HyruleFieldToHFOpenGrotto(this), 1);
        setExit(new HyruleFieldToHFInsideFenceGrotto(this), 2);
        setExit(new HyruleFieldToHFCowGrotto(this), 3);
        setExit(new HyruleFieldToHFNearMarketGrotto(this), 4);
        setExit(new HyruleFieldToHFFairyGrotto(this), 5);
        setExit(new HyruleFieldToHFNearKakGrotto(this), 6);
        setExit(new HyruleFieldToHFTektikeGrotto(this), 7);
        setExit(new HyruleFieldToKokiriForest(this), 8);
        setExit(new HyruleFieldToLakeHylia(this), 9);
        setExit(new HyruleFieldToGerudoValley(this), 10);
        setExit(new HyruleFieldToMarketEntrance(this), 11);
        setExit(new HyruleFieldToKakarikoVillage(this), 12);
        setExit(new HyruleFieldToZorasRiver(this), 13);
        setExit(new HyruleFieldToLonLonRanch(this), 14);
        setExit(new HyruleFieldOwlLanding(this), 15);
        loadExitDestinationsFromSaveFile();
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 40;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 32;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 40;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 32;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
