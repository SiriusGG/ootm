package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.constants.OoTMConstants;
import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.SeedSettings;
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
        setOverworldTransitionsAmount(2);
        setHasOwlStart(true);
        initExits();
        setExit(new LakeHyliaToFishingHole(this), 0);
        setExit(new LakeHyliaToLakesideLaboratory(this), 1);
        setExit(new LakeHyliaToWaterTemple(this), 2);
        setExit(new LakeHyliaToGrotto(this), 3);
        setExit(new LakeHyliaToHyruleField(this), 4);
        setExit(new LakeHyliaToZorasDomain(this), 5);
        setExit(new LakeHyliaOwlStart(this), 6);
        loadExitDestinationsFromSaveFile();
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
		SeedSettings s = SeedSettings.getInstance(getSeedName());
        if (s.getPerspective() == Perspective.SIDE) {
            return 40;
        } else if (s.getPerspective() == Perspective.TOP) {
            return 32;
        } else {
            throw new UnknownPerspectiveException(s.getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
		SeedSettings s = SeedSettings.getInstance(getSeedName());
        if (s.getPerspective() == Perspective.SIDE) {
            return 40;
        } else if (s.getPerspective() == Perspective.TOP) {
            return 32;
        } else {
            throw new UnknownPerspectiveException(s.getPerspective());
        }
    }
}
