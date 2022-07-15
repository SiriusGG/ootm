package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;

public class BottomOfTheWell extends ExitMap {
    public BottomOfTheWell() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[0]);
        initMap();
        setDungeonExitsAmount(1);
        initExits();
        setExit(new BottomOfTheWellToKakariko(), 0);
    }

    private static class BottomOfTheWellToKakariko extends Exit {
        public BottomOfTheWellToKakariko() {
            super(ExitType.DUNGEON_EXIT);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDungeonExit(DungeonExit.BOTTOM_OF_THE_WELL);
            setBothSidePositions(new Position(7.0, 42.0));
            setBothTopPositions(new Position(46.5, 85.0));
        }
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
