package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;

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

    private static class HauntedWastelandToGerudosFortress extends Exit {
        public HauntedWastelandToGerudosFortress(final ExitMap exitMap) {
            super(exitMap, ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.GERUDOS_FORTRESS);
            setBothSidePositions(new Position(23.96, 14.73));
            setBothTopPositions(new Position(82.11, 60.76));
        }
    }

    private static class HauntedWastelandToDesertColossus extends Exit {
        public HauntedWastelandToDesertColossus(final ExitMap exitMap) {
            super(exitMap, ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.DESERT_COLOSSUS);
            setBothSidePositions(new Position(66.73, 78.96));
            setBothTopPositions(new Position(2.32, 33.45));
        }
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
