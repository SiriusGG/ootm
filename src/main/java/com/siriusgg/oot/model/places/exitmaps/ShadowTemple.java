package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.Constants;
import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.ShadowTempleToGraveyard;

public class ShadowTemple extends ExitMap {
    public ShadowTemple(final String seedName) {
        super(seedName);
        setPlace(PlaceWithMap.SHADOW_TEMPLE);
        setNiceName(Constants.NICE_PLACES_WITH_MAP[30]);
        initMap();
        setDungeonExitsAmount(1);
        initExits();
        setExit(new ShadowTempleToGraveyard(this), 0);
        loadExitDestinationsFromSaveFile();
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 40;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 40;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 40;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 40;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
