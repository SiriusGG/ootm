package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;

public class LinksHouse extends ExitMap {
    public LinksHouse() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[24]);
        initMap();
        setDoorExitsAmount(1);
        initExits();
        setExit(new LinksHouseToKokiriForest(), 0);
    }

    private static class LinksHouseToKokiriForest extends Exit {
        public LinksHouseToKokiriForest() {
            super(ExitType.DOOR_EXIT);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorExit(DoorExit.KF_LINKS_HOUSE);
            setSidePosition(new Position(9.77, 35.0));
            setTopPosition(new Position(11.5, 20.5));
        }
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 80;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 128;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 80;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 128;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
