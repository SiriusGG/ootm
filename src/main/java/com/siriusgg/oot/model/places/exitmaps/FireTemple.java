package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;

public class FireTemple extends ExitMap {
    public FireTemple() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[6]);
        initMap();
        setDungeonExitsAmount(1);
        initExits();
        setExit(new FireTempleToDMC(), 0);
    }

    private static class FireTempleToDMC extends Exit {
        public FireTempleToDMC() {
            super(ExitType.DUNGEON_EXIT);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDungeonExit(DungeonExit.FIRE_TEMPLE);
            setBothSidePositions(new Position(40.3, 85.0));
            setBothTopPositions(new Position(46.5, 90.0));
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
