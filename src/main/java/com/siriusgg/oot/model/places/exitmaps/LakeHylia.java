package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.OoTMConstants;
import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.*;

public class LakeHylia extends ExitMap {
    public LakeHylia(final String seedName) {
        super(seedName);
        setPlace(PlaceWithMap.LAKE_HYLIA);
        setNiceName(OoTMConstants.NICE_PLACES_WITH_MAP[23]);
        initMap();
        setDoorEntrancesAmount(2);
        setDungeonEntrancesAmount(1);
        setGrottoEntrancesAmount(1);
        setOverworldTransitionsAmount(1);
        setHasOwlStart(true);
        initExits();
        setExit(new LakeHyliaToFishingHole(this), 0);
        setExit(new LakeHyliaToLakesideLaboratory(this), 1);
        setExit(new LakeHyliaToWaterTemple(this), 2);
        setExit(new LakeHyliaToGrotto(this), 3);
        setExit(new LakeHyliaToHyruleField(this), 4);
        setExit(new LakeHyliaOwlStart(this), 5);
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
