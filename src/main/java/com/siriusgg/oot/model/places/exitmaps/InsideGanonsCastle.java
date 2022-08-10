package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.InsideGanonsCastleToOutsideGanonsCastle;

public class InsideGanonsCastle extends ExitMap {
    public InsideGanonsCastle() {
        super();
        setPlace(PlaceWithMap.INSIDE_GANONS_CASTLE);
        setName(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[17]);
        initMap();
        setDungeonExitsAmount(1);
        initExits();
        setExit(new InsideGanonsCastleToOutsideGanonsCastle(this), 0);
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 54;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 60;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 54;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 60;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
