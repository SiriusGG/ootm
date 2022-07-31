package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;

public class InsideGanonsCastle extends ExitMap {
    public InsideGanonsCastle() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[17]);
        initMap();
        setDungeonExitsAmount(1);
        initExits();
        setExit(new InsideGanonsCastleToHyruleCastle(), 0);
    }

    private static class InsideGanonsCastleToHyruleCastle extends Exit {
        public InsideGanonsCastleToHyruleCastle() {
            super(ExitType.DUNGEON_EXIT);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDungeonExit(DungeonExit.INSIDE_GANONS_CASTLE);
            setBothSidePositions(new Position(10.49, 58.17));
            setBothTopPositions(new Position(40.6, 89.12));
        }
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 54;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 60;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 54;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 60;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
