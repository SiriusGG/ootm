package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.InsideTheDekuTreeToKokiriForest;

public class InsideTheDekuTree extends ExitMap {
    public InsideTheDekuTree(final String seedName) {
        super(seedName);
        setPlace(PlaceWithMap.INSIDE_THE_DEKU_TREE);
        setNiceName(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[19]);
        initMap();
        setDungeonExitsAmount(1);
        initExits();
        setExit(new InsideTheDekuTreeToKokiriForest(this), 0);
        loadExitDestinationsFromSaveFile();
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
