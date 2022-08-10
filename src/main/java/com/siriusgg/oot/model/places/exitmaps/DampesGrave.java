package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.*;

public class DampesGrave extends ExitMap {
    public DampesGrave() {
        super();
        setPlace(PlaceWithMap.DAMPES_GRAVE);
        setName(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[1]);
        initMap();
        setGrottoExitsAmount(1);
        setUnchangingTransitionsAmount(1);
        initExits();
        setExit(new DampesGraveToGraveyard(this), 0);
        setExit(new DampesGraveToWindmill(this), 1);
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 70;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 60;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 70;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 60;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
