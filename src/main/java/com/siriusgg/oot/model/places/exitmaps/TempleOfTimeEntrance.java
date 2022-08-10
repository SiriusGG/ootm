package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exitmaps.exits.*;

public class TempleOfTimeEntrance extends ExitMap {
    public TempleOfTimeEntrance() {
        super();
        setPlace(PlaceWithMap.TEMPLE_OF_TIME_ENTRANCE);
        setName(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[33]);
        initMap();
        setDoorEntrancesAmount(1);
        setOverworldTransitionsAmount(1);
        initExits();
        setExit(new TempleOfTimeEntranceToTempleOfTime(this), 0);
        setExit(new TempleOfTimeEntranceToMarket(this), 1);
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 120;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 120;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 120;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 120;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
