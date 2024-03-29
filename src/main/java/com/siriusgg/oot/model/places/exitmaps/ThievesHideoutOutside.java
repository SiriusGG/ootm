package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.constants.OoTMConstants;
import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.SeedSettings;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.*;

public class ThievesHideoutOutside extends ExitMap {
    public ThievesHideoutOutside(final String seedName) {
        super(seedName);
        setPlace(PlaceWithMap.THIEVES_HIDEOUT_OUTSIDE);
        setNiceName(OoTMConstants.NICE_PLACES_WITH_MAP[40]);
        initMap();
        setUnchangingTransitionsAmount(13);
        setAccessibility(true, true);
        setZoom(UnchangingTransition.THIEVES_HIDEOUT_OUTSIDE_TO_GERUDOS_FORTRESS);
        initExits();
        setExit(new GerudosFortressToThievesHideoutB(this), 0);
        setExit(new GerudosFortressToThievesHideoutC(this), 1);
        setExit(new GerudosFortressToThievesHideoutD(this), 2);
        setExit(new GerudosFortressToThievesHideoutE(this), 3);
        setExit(new GerudosFortressToThievesHideoutF(this), 4);
        setExit(new GerudosFortressToThievesHideoutG(this), 5);
        setExit(new GerudosFortressToThievesHideoutH(this), 6);
        setExit(new GerudosFortressToThievesHideoutI(this), 7);
        setExit(new GerudosFortressToThievesHideoutJ(this), 8);
        setExit(new GerudosFortressToThievesHideoutK(this), 9);
        setExit(new GerudosFortressToThievesHideoutL(this), 10);
        setExit(new GerudosFortressToThievesHideoutM(this), 11);
        setExit(new GerudosFortressToThievesHideoutN(this), 12);
        loadExitDestinationsFromSaveFile();
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
		SeedSettings s = SeedSettings.getInstance(getSeedName());
        if (s.getPerspective() == Perspective.SIDE) {
            return 60;
        } else if (s.getPerspective() == Perspective.TOP) {
            return 60;
        } else {
            throw new UnknownPerspectiveException(s.getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
		SeedSettings s = SeedSettings.getInstance(getSeedName());
        if (s.getPerspective() == Perspective.SIDE) {
            return 60;
        } else if (s.getPerspective() == Perspective.TOP) {
            return 60;
        } else {
            throw new UnknownPerspectiveException(s.getPerspective());
        }
    }
}
