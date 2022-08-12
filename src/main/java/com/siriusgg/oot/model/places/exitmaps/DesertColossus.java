package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.*;

public class DesertColossus extends ExitMap {
    public DesertColossus(final String seedName) {
        super(seedName);
        setPlace(PlaceWithMap.DESERT_COLOSSUS);
        setNiceName(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[4]);
        initMap();
        setDoorEntrancesAmount(1);
        setDungeonEntrancesAmount(1);
        setGrottoEntrancesAmount(1);
        setOverworldTransitionsAmount(1);
        setUnchangingTransitionsAmount(2);
        initExits();
        setExit(new DesertColossusToGreatFairy(this), 0);
        setExit(new DesertColossusToSpiritTemple(this), 1);
        setExit(new DesertColossusToColossusGrotto(this), 2);
        setExit(new DesertColossusToHauntedWasteland(this), 3);
        setExit(new DesertColossusToSpiritTempleLeftHand(this), 4);
        setExit(new DesertColossusToSpiritTempleRightHand(this), 5);
        loadExitDestinationsFromSaveFile();
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 50;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 40;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 50;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 40;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
