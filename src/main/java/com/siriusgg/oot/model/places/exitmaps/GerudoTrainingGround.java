package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exitmaps.exits.GerudoTrainingGroundToGerudosFortress;

public class GerudoTrainingGround extends ExitMap {
    public GerudoTrainingGround() {
        super();
        setPlace(PlaceWithMap.GERUDO_TRAINING_GROUND);
        setName(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[9]);
        initMap();
        setDungeonExitsAmount(1);
        initExits();
        setExit(new GerudoTrainingGroundToGerudosFortress(this), 0);
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 40;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 44;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 40;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 44;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
