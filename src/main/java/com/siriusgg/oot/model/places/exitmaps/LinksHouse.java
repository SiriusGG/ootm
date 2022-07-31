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
            setBothSidePositions(new Position(7.1, 22.55));
            setBothTopPositions(new Position(3.91, 6.37));
        }
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 160;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 300;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 160;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 300;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
