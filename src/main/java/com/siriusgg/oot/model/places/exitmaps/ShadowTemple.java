package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;

public class ShadowTemple extends ExitMap {
    public ShadowTemple() {
        super();
        setPlace(PlaceWithMap.SHADOW_TEMPLE);
        setName(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[30]);
        initMap();
        setDungeonExitsAmount(1);
        initExits();
        setExit(new ShadowTempleToGraveyard(this), 0);
    }

    private static class ShadowTempleToGraveyard extends Exit {
        public ShadowTempleToGraveyard(final ExitMap exitMap) {
            super(exitMap, ExitType.DUNGEON_EXIT);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDungeonExit(DungeonExit.SHADOW_TEMPLE);
            setBothSidePositions(new Position(63.87, 24.76));
            setBothTopPositions(new Position(46.38, 22.34));
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
