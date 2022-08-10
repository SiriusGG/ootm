package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exitmaps.exits.*;

public class HauntedWasteland extends ExitMap {
    public HauntedWasteland() {
        super();
        setPlace(PlaceWithMap.HAUNTED_WASTELAND);
        setName(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[13]);
        initMap();
        setOverworldTransitionsAmount(2);
        setAccessibility(false, true);
        initExits();
        setExit(new HauntedWastelandToGerudosFortress(this), 0);
        setExit(new HauntedWastelandToDesertColossus(this), 1);
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 32;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 40;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 32;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 40;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
