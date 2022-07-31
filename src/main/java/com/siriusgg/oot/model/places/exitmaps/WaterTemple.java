package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;

public class WaterTemple extends ExitMap {
    public WaterTemple() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[35]);
        initMap();
        setDungeonExitsAmount(1);
        initExits();
        setExit(new WaterTempleToLakeHylia(), 0);
    }

    private static class WaterTempleToLakeHylia extends Exit {
        public WaterTempleToLakeHylia() {
            super(ExitType.DUNGEON_EXIT);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDungeonExit(DungeonExit.WATER_TEMPLE);
            setBothSidePositions(new Position(39.46, 60.42));
            setBothTopPositions(new Position(40.06, 69.33));
        }
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 40;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 40;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 40;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 40;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
