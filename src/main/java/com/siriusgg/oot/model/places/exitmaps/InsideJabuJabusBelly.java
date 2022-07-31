package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;

public class InsideJabuJabusBelly extends ExitMap {
    public InsideJabuJabusBelly() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[18]);
        initMap();
        setDungeonExitsAmount(1);
        initExits();
        setExit(new InsideJabuJabusBellyToZorasFountain(), 0);
    }

    private static class InsideJabuJabusBellyToZorasFountain extends Exit {
        public InsideJabuJabusBellyToZorasFountain() {
            super(ExitType.DUNGEON_EXIT);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDungeonExit(DungeonExit.INSIDE_JABU_JABUS_BELLY);
            setBothSidePositions(new Position(4.93, 54.75));
            setBothTopPositions(new Position(23.89, 92.82));
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
