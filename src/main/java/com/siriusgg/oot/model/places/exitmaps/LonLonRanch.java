package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;

public class LonLonRanch extends ExitMap {
    public LonLonRanch() {
        super();
        setPlace(PlaceWithMap.LON_LON_RANCH);
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[25]);
        initMap();
        setDoorEntrancesAmount(3);
        setGrottoEntrancesAmount(1);
        setOverworldTransitionsAmount(1);
        initExits();
        setExit(new LonLonRanchToTalonsHouse(this), 0);
        setExit(new LonLonRanchToStable(this), 1);
        setExit(new LonLonRanchToTower(this), 2);
        setExit(new LonLonRanchToGrotto(this), 3);
        setExit(new LonLonRanchToHyruleField(this), 4);
    }

    private static class LonLonRanchToTalonsHouse extends Exit {
        public LonLonRanchToTalonsHouse(final ExitMap exitMap) {
            super(exitMap, ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.LLR_TALONS_HOUSE);
            setBothSidePositions(new Position(17.97, 76.03));
            setBothTopPositions(new Position(72.57, 12.96));
        }
    }

    private static class LonLonRanchToStable extends Exit {
        public LonLonRanchToStable(final ExitMap exitMap) {
            super(exitMap, ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.LLR_STABLES);
            setBothSidePositions(new Position(23.37, 77.32));
            setBothTopPositions(new Position(64.26, 16.9));
        }
    }

    private static class LonLonRanchToTower extends Exit {
        public LonLonRanchToTower(final ExitMap exitMap) {
            super(exitMap, ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.LLR_TOWER);
            setBothSidePositions(new Position(91.6, 48.6));
            setBothTopPositions(new Position(14.89, 86.69));
        }
    }

    private static class LonLonRanchToGrotto extends Exit {
        public LonLonRanchToGrotto(final ExitMap exitMap) {
            super(exitMap, ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(false);
            setGrottoEntrance(GrottoEntrance.LLR_GROTTO);
            setBothSidePositions(new Position(57.23, 13.61));
            setBothTopPositions(new Position(87.77, 86.0));
        }
    }

    private static class LonLonRanchToHyruleField extends Exit {
        public LonLonRanchToHyruleField(final ExitMap exitMap) {
            super(exitMap, ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.HYRULE_FIELD);
            setBothSidePositions(new Position(2.73, 85.1));
            setBothTopPositions(new Position(86.21, 1.04));
        }
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 48;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 44;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 48;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 44;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
