package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;

public class TempleOfTime extends ExitMap {
    public TempleOfTime() {
        super();
        setPlace(PlaceWithMap.TEMPLE_OF_TIME);
        setName(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[32]);
        initMap();
        setDoorExitsAmount(1);
        initExits();
        setExit(new TempleOfTimeToToTEntrance(this), 0);
    }

    private static class TempleOfTimeToToTEntrance extends Exit {
        public TempleOfTimeToToTEntrance(final ExitMap exitMap) {
            super(exitMap, ExitType.DOOR_EXIT);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorExit(DoorExit.TEMPLE_OF_TIME);
            setBothSidePositions(new Position(6.67, 91.67));
            setBothTopPositions(new Position(4.69, 45.81));
        }
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 60;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 60;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 60;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 60;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
