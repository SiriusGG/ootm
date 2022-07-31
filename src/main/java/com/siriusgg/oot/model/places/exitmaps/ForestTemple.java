package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;

public class ForestTemple extends ExitMap {
    public ForestTemple() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[7]);
        initMap();
        setDungeonExitsAmount(1);
        initExits();
        setExit(new ForestTempleToSFM(), 0);
    }

    private static class ForestTempleToSFM extends Exit {
        public ForestTempleToSFM() {
            super(ExitType.DUNGEON_EXIT);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDungeonExit(DungeonExit.FOREST_TEMPLE);
            setBothSidePositions(new Position(0.3, 77.5));
            setBothTopPositions(new Position(42.3, 92.5));
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
