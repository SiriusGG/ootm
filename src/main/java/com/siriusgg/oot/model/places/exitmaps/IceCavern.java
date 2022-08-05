package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;

public class IceCavern extends ExitMap {
    public IceCavern() {
        super();
        setPlace(PlaceWithMap.ICE_CAVERN);
        setName(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[16]);
        initMap();
        setDungeonExitsAmount(1);
        initExits();
        setExit(new IceCavernToZorasFountain(this), 0);
    }

    private static class IceCavernToZorasFountain extends Exit {
        public IceCavernToZorasFountain(final ExitMap exitMap) {
            super(exitMap, ExitType.DUNGEON_EXIT);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDungeonExit(DungeonExit.ICE_CAVERN);
            setBothSidePositions(new Position(3.84, 91.25));
            setBothTopPositions(new Position(51.91, 92.59));
        }
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 60;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 44;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 60;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 44;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
