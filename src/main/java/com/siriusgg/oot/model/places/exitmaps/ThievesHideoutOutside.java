package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;

public class ThievesHideoutOutside extends ExitMap {
    public ThievesHideoutOutside() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[40]);
        initMap();
        setUnchangingTransitionsAmount(13);
        setAccessibility(true, true);
        setZoom(UnchangingTransition.THIEVES_HIDEOUT_OUTSIDE_TO_GERUDOS_FORTRESS);
        initExits();
        setExit(new GerudosFortressToThievesHideoutB(), 0);
        setExit(new GerudosFortressToThievesHideoutC(), 1);
        setExit(new GerudosFortressToThievesHideoutD(), 2);
        setExit(new GerudosFortressToThievesHideoutE(), 3);
        setExit(new GerudosFortressToThievesHideoutF(), 4);
        setExit(new GerudosFortressToThievesHideoutG(), 5);
        setExit(new GerudosFortressToThievesHideoutH(), 6);
        setExit(new GerudosFortressToThievesHideoutI(), 7);
        setExit(new GerudosFortressToThievesHideoutJ(), 8);
        setExit(new GerudosFortressToThievesHideoutK(), 9);
        setExit(new GerudosFortressToThievesHideoutL(), 10);
        setExit(new GerudosFortressToThievesHideoutM(), 11);
        setExit(new GerudosFortressToThievesHideoutN(), 12);
    }

    private static class GerudosFortressToThievesHideoutB extends Exit {
        public GerudosFortressToThievesHideoutB() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_B_IN);
            setBothSidePositions(new Position(19.61, 61.81));
            setBothTopPositions(new Position(25.71, 20.95));
        }
    }

    private static class GerudosFortressToThievesHideoutC extends Exit {
        public GerudosFortressToThievesHideoutC() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_C_IN);
            setBothSidePositions(new Position(42.48, 70.02));
            setBothTopPositions(new Position(31.0, 47.11));
        }
    }

    private static class GerudosFortressToThievesHideoutD extends Exit {
        public GerudosFortressToThievesHideoutD() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_D_IN);
            setBothSidePositions(new Position(55.34, 68.63));
            setBothTopPositions(new Position(44.43, 53.47));
        }
    }

    private static class GerudosFortressToThievesHideoutE extends Exit {
        public GerudosFortressToThievesHideoutE() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_E_IN);
            setBothSidePositions(new Position(61.8, 64.58));
            setBothTopPositions(new Position(44.43, 65.16));
        }
    }

    private static class GerudosFortressToThievesHideoutF extends Exit {
        public GerudosFortressToThievesHideoutF() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_F_IN);
            setBothSidePositions(new Position(71.17, 45.25));
            setBothTopPositions(new Position(58.14, 65.16));
        }
    }

    private static class GerudosFortressToThievesHideoutG extends Exit {
        public GerudosFortressToThievesHideoutG() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_G_IN);
            setBothSidePositions(new Position(71.9, 27.2));
            setBothTopPositions(new Position(72.43, 50.93));
        }
    }

    private static class GerudosFortressToThievesHideoutH extends Exit {
        public GerudosFortressToThievesHideoutH() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_H_IN);
            setBothSidePositions(new Position(65.43, 68.17));
            setBothTopPositions(new Position(30.71, 78.01));
        }
    }

    private static class GerudosFortressToThievesHideoutI extends Exit {
        public GerudosFortressToThievesHideoutI() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_I_IN);
            setBothSidePositions(new Position(73.42, 49.07));
            setBothTopPositions(new Position(54.71, 75.23));
        }
    }

    private static class GerudosFortressToThievesHideoutJ extends Exit {
        public GerudosFortressToThievesHideoutJ() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_J_IN);
            setBothSidePositions(new Position(43.36, 50.35));
            setBothTopPositions(new Position(43.29, 37.73));
        }
    }

    private static class GerudosFortressToThievesHideoutK extends Exit {
        public GerudosFortressToThievesHideoutK() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_K_IN);
            setBothSidePositions(new Position(54.39, 79.98));
            setBothTopPositions(new Position(26.29, 66.78));
        }
    }

    private static class GerudosFortressToThievesHideoutL extends Exit {
        public GerudosFortressToThievesHideoutL() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_L_IN);
            setBothSidePositions(new Position(59.11, 33.91));
            setBothTopPositions(new Position(69.29, 37.62));
        }
    }

    private static class GerudosFortressToThievesHideoutM extends Exit {
        public GerudosFortressToThievesHideoutM() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_M_IN);
            setBothSidePositions(new Position(32.61, 34.84));
            setBothTopPositions(new Position(49.86, 20.02));
        }
    }

    private static class GerudosFortressToThievesHideoutN extends Exit {
        public GerudosFortressToThievesHideoutN() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_N_IN);
            setBothSidePositions(new Position(7.99, 10.65));
            setBothTopPositions(new Position(35.0, 5.09));
        }
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 60;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 60;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 60;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 60;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
