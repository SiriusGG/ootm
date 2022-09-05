package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.OoTMConstants;
import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.*;

public class GerudosFortress extends ExitMap {
    public GerudosFortress(final String seedName) {
        super(seedName);
        setPlace(PlaceWithMap.GERUDOS_FORTRESS);
        setNiceName(OoTMConstants.NICE_PLACES_WITH_MAP[8]);
        initMap();
        setDungeonEntrancesAmount(1);
        setGrottoEntrancesAmount(1);
        setOverworldTransitionsAmount(2);
        setAccessibility(false, true);
        setZoom(UnchangingTransition.GERUDOS_FORTRESS_TO_THIEVES_HIDEOUT_OUTSIDE);
        initExits();
        setExit(new GerudosFortressToGerudoTrainingGround(this), 0);
        setExit(new GerudosFortressToStormsGrotto(this), 1);
        setExit(new GerudosFortressToGerudoValley(this), 2);
        setExit(new GerudosFortressToHauntedWasteland(this), 3);
        loadExitDestinationsFromSaveFile();
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 36;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 50;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 36;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 50;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
