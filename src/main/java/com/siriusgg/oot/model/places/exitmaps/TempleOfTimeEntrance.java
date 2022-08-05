package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;

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

    private static class TempleOfTimeEntranceToTempleOfTime extends Exit {
        public TempleOfTimeEntranceToTempleOfTime(final ExitMap exitMap) {
            super(exitMap, ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.TEMPLE_OF_TIME);
            setBothSidePositions(new Position(31.86, 24.31));
            setBothTopPositions(new Position(31.86, 24.31));
        }
    }

    private static class TempleOfTimeEntranceToMarket extends Exit {
        public TempleOfTimeEntranceToMarket(final ExitMap exitMap) {
            super(exitMap, ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.MARKET);
            setBothSidePositions(new Position(62.41, 85.07));
            setBothTopPositions(new Position(62.41, 85.07));
        }
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
