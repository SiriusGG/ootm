package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;

public class GerudoValley extends ExitMap {
    public GerudoValley() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[10]);
        initMap();
        setDoorEntrancesAmount(1);
        setGrottoEntrancesAmount(2);
        setOverworldTransitionsAmount(2);
        setUnchangingTransitionsAmount(1);
        initExits();
        setExit(new GerudoValleyToCarpenterTent(), 0);
        setExit(new GerudoValleyToOctorokGrotto(), 1);
        setExit(new GerudoValleyToStormsGrotto(), 2);
        setExit(new GerudoValleyToHyruleField(), 3);
        setExit(new GerudoValleyToGerudosFortress(), 4);
        setExit(new GerudoValleyToLakeHylia(), 5);
    }

    private static class GerudoValleyToCarpenterTent extends Exit {
        public GerudoValleyToCarpenterTent() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(false);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.GV_CARPENTER_TENT);
            setBothSidePositions(new Position(42.82, 20.49));
            setBothTopPositions(new Position(46.02, 44.1));
        }
    }

    private static class GerudoValleyToOctorokGrotto extends Exit {
        public GerudoValleyToOctorokGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(false);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.GV_OCTOROK_GROTTO);
            setBothSidePositions(new Position(21.11, 52.43));
            setBothTopPositions(new Position(61.31, 63.66));
        }
    }

    private static class GerudoValleyToStormsGrotto extends Exit {
        public GerudoValleyToStormsGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(false);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.GV_STORMS_GROTTO);
            setBothSidePositions(new Position(45.01, 18.29));
            setBothTopPositions(new Position(42.54, 38.66));
        }
    }

    private static class GerudoValleyToHyruleField extends Exit {
        public GerudoValleyToHyruleField() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.HYRULE_FIELD);
            setBothSidePositions(new Position(66.67, 39.24));
            setBothTopPositions(new Position(94.09, 64.47));
        }
    }

    private static class GerudoValleyToGerudosFortress extends Exit {
        public GerudoValleyToGerudosFortress() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.GERUDOS_FORTRESS);
            setBothSidePositions(new Position(11.01, 3.01));
            setBothTopPositions(new Position(1.29, 35.76));
        }
    }

    private static class GerudoValleyToLakeHylia extends Exit {
        public GerudoValleyToLakeHylia() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.GERUDO_VALLEY_TO_LAKE_HYLIA);
            setBothSidePositions(new Position(5.43, 91.44));
            setBothTopPositions(new Position(79.56, 90.28));
        }
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 40;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 40;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 40;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 40;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
