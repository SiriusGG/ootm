package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.BottomOfTheWellToKakariko;

public class BottomOfTheWell extends ExitMap {
    public BottomOfTheWell() {
        super();
        setPlace(PlaceWithMap.BOTTOM_OF_THE_WELL);
        setName(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[0]);
        initMap();
        setDungeonExitsAmount(1);
        initExits();
        setExit(new BottomOfTheWellToKakariko(this), 0);
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 80;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 66;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 80;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 66;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
