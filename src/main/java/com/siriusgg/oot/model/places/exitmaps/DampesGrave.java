package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;

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

    private static class DampesGraveToGraveyard extends Exit {
        public DampesGraveToGraveyard(final ExitMap exitMap) {
            super(exitMap, ExitType.GROTTO_EXIT);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoExit(GrottoExit.DAMPES_GRAVE);
            setBothSidePositions(new Position(90.8, 55.0));
            setBothTopPositions(new Position(22.0, 6.5));
        }
    }

    private static class DampesGraveToWindmill extends Exit {
        public DampesGraveToWindmill(final ExitMap exitMap) {
            super(exitMap, ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.DAMPES_GRAVE_TO_WINDMILL);
            setBothSidePositions(new Position(63.5, 0.5));
            setBothTopPositions(new Position(1.5, 84.0));
        }
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
