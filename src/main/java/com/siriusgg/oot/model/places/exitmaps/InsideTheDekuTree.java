package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;

public class InsideTheDekuTree extends ExitMap {
    public InsideTheDekuTree() {
        super();
        setPlace(PlaceWithMap.INSIDE_THE_DEKU_TREE);
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[19]);
        initMap();
        setDungeonExitsAmount(1);
        initExits();
        setExit(new InsideTheDekuTreeToKokiriForest(this), 0);
    }

    private static class InsideTheDekuTreeToKokiriForest extends Exit {
        public InsideTheDekuTreeToKokiriForest(final ExitMap exitMap) {
            super(exitMap, ExitType.DUNGEON_EXIT);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDungeonExit(DungeonExit.INSIDE_THE_DEKU_TREE);
            setBothSidePositions(new Position(46.09, 30.67));
            setBothTopPositions(new Position(29.18, 61.92));
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
