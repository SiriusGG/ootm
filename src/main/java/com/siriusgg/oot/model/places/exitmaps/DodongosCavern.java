package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;

public class DodongosCavern extends ExitMap {
    public DodongosCavern() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[5]);
        initMap();
        setDungeonExitsAmount(1);
        initExits();
        setExit(new DodongosCavernToDMT(), 0);
    }

    private static class DodongosCavernToDMT extends Exit {
        public DodongosCavernToDMT() {
            super(ExitType.DUNGEON_EXIT);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDungeonExit(DungeonExit.DODONGOS_CAVERN);
            setBothSidePositions(new Position(11.3, 73.3));
            setBothTopPositions(new Position(30.5, 92.0));
        }
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 60;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 50;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 60;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 50;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
