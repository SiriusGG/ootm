package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.InsideJabuJabusBellyToZorasFountain;

public class InsideJabuJabusBelly extends ExitMap {
    public InsideJabuJabusBelly(final String seedName) {
        super(seedName);
        setPlace(PlaceWithMap.INSIDE_JABU_JABUS_BELLY);
        setName(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[18]);
        initMap();
        setDungeonExitsAmount(1);
        initExits();
        setExit(new InsideJabuJabusBellyToZorasFountain(this), 0);
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
