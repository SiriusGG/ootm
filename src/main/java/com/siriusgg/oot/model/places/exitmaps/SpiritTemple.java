package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.*;
import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.SeedSettings;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.*;

public class SpiritTemple extends ExitMap {
    public SpiritTemple(final String seedName) {
        super(seedName);
        setPlace(PlaceWithMap.SPIRIT_TEMPLE);
        setNiceName(OoTMConstants.NICE_PLACES_WITH_MAP[31]);
        initMap();
        setDungeonExitsAmount(1);
        setUnchangingTransitionsAmount(2);
        initExits();
        setExit(new SpiritTempleToDesertColossus(this), 0);
        setExit(new SpiritTempleLeftHandToDesertColossus(this), 1);
        setExit(new SpiritTempleRightHandToDesertColossus(this), 2);
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
