package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.*;
import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.SeedSettings;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.WaterTempleToLakeHylia;

public class WaterTemple extends ExitMap {
    public WaterTemple(final String seedName) {
        super(seedName);
        setPlace(PlaceWithMap.WATER_TEMPLE);
        setNiceName(OoTMConstants.NICE_PLACES_WITH_MAP[35]);
        initMap();
        setDungeonExitsAmount(1);
        initExits();
        setExit(new WaterTempleToLakeHylia(this), 0);
        loadExitDestinationsFromSaveFile();
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
		SeedSettings s = SeedSettings.getInstance(getSeedName());
        if (s.getPerspective() == Perspective.SIDE) {
            return 40;
        } else if (s.getPerspective() == Perspective.TOP) {
            return 40;
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
            return 40;
        } else {
            throw new UnknownPerspectiveException(s.getPerspective());
        }
    }
}
