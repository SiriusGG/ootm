package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.Constants;
import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.*;

public class ThievesHideout extends ExitMap {
    public ThievesHideout(final String seedName) {
        super(seedName);
        setPlace(PlaceWithMap.THIEVES_HIDEOUT);
        setNiceName(Constants.NICE_PLACES_WITH_MAP[34]);
        initMap();
        setDoorExitsAmount(13);
        setAccessibility(true, true);
        initExits();
        setExit(new ThievesHideoutBToGerudosFortress(this), 0);
        setExit(new ThievesHideoutCToGerudosFortress(this), 1);
        setExit(new ThievesHideoutDToGerudosFortress(this), 2);
        setExit(new ThievesHideoutEToGerudosFortress(this), 3);
        setExit(new ThievesHideoutFToGerudosFortress(this), 4);
        setExit(new ThievesHideoutGToGerudosFortress(this), 5);
        setExit(new ThievesHideoutHToGerudosFortress(this), 6);
        setExit(new ThievesHideoutIToGerudosFortress(this), 7);
        setExit(new ThievesHideoutJToGerudosFortress(this), 8);
        setExit(new ThievesHideoutKToGerudosFortress(this), 9);
        setExit(new ThievesHideoutLToGerudosFortress(this), 10);
        setExit(new ThievesHideoutMToGerudosFortress(this), 11);
        setExit(new ThievesHideoutNToGerudosFortress(this), 12);
        loadExitDestinationsFromSaveFile();
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 50;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 46;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 50;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 46;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
