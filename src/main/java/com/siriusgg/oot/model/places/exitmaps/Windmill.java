package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;

public class Windmill extends ExitMap {
    public Windmill() {
        super();
        setPlace(PlaceWithMap.WINDMILL);
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[36]);
        initMap();
        setDoorExitsAmount(1);
        initExits();
        setExit(new WindmillToKakariko(this), 0);
    }

    private static class WindmillToKakariko extends Exit {
        public WindmillToKakariko(final ExitMap exitMap) {
            super(exitMap, ExitType.DOOR_EXIT);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorExit(DoorExit.KAK_WINDMILL);
            setBothSidePositions(new Position(7.67, 79.51));
            setBothTopPositions(new Position(2.09, 47.34));
        }
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 120;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 120;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 120;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 120;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
