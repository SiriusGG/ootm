package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;

public class ThievesHideout extends ExitMap {
    public ThievesHideout() {
        super();
        setPlace(PlaceWithMap.THIEVES_HIDEOUT);
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[34]);
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
    }

    private static class ThievesHideoutBToGerudosFortress extends Exit {
        public ThievesHideoutBToGerudosFortress(final ExitMap exitMap) {
            super(exitMap, ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_B_OUT);
            setBothSidePositions(new Position(0.5, 79.5));
            setBothTopPositions(new Position(0.45, 22.22));
        }
    }

    private static class ThievesHideoutCToGerudosFortress extends Exit {
        public ThievesHideoutCToGerudosFortress(final ExitMap exitMap) {
            super(exitMap, ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_C_OUT);
            setBothSidePositions(new Position(22.9, 92.9));
            setBothTopPositions(new Position(5.61, 57.06));
        }
    }

    private static class ThievesHideoutDToGerudosFortress extends Exit {
        public ThievesHideoutDToGerudosFortress(final ExitMap exitMap) {
            super(exitMap, ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_D_OUT);
            setBothSidePositions(new Position(24.61, 83.96));
            setBothTopPositions(new Position(0.45, 65.63));
        }
    }

    private static class ThievesHideoutEToGerudosFortress extends Exit {
        public ThievesHideoutEToGerudosFortress(final ExitMap exitMap) {
            super(exitMap, ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_E_OUT);
            setBothSidePositions(new Position(33.27, 79.11));
            setBothTopPositions(new Position(0.45, 82.0));
        }
    }

    private static class ThievesHideoutFToGerudosFortress extends Exit {
        public ThievesHideoutFToGerudosFortress(final ExitMap exitMap) {
            super(exitMap, ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_F_OUT);
            setBothSidePositions(new Position(43.42, 62.93));
            setBothTopPositions(new Position(15.39, 81.94));
        }
    }

    private static class ThievesHideoutGToGerudosFortress extends Exit {
        public ThievesHideoutGToGerudosFortress(final ExitMap exitMap) {
            super(exitMap, ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_G_OUT);
            setBothSidePositions(new Position(49.54, 45.64));
            setBothTopPositions(new Position(34.66, 70.49));
        }
    }

    private static class ThievesHideoutHToGerudosFortress extends Exit {
        public ThievesHideoutHToGerudosFortress(final ExitMap exitMap) {
            super(exitMap, ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_H_OUT);
            setBothSidePositions(new Position(63.48, 89.35));
            setBothTopPositions(new Position(51.21, 77.2));
        }
    }

    private static class ThievesHideoutIToGerudosFortress extends Exit {
        public ThievesHideoutIToGerudosFortress(final ExitMap exitMap) {
            super(exitMap, ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_I_OUT);
            setBothSidePositions(new Position(89.39, 55.46));
            setBothTopPositions(new Position(95.26, 71.06));
        }
    }

    private static class ThievesHideoutJToGerudosFortress extends Exit {
        public ThievesHideoutJToGerudosFortress(final ExitMap exitMap) {
            super(exitMap, ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_J_OUT);
            setBothSidePositions(new Position(75.98, 12.03));
            setBothTopPositions(new Position(94.87, 22.8));
        }
    }

    private static class ThievesHideoutKToGerudosFortress extends Exit {
        public ThievesHideoutKToGerudosFortress(final ExitMap exitMap) {
            super(exitMap, ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_K_OUT);
            setBothSidePositions(new Position(85.35, 42.46));
            setBothTopPositions(new Position(72.6, 66.9));
        }
    }

    private static class ThievesHideoutLToGerudosFortress extends Exit {
        public ThievesHideoutLToGerudosFortress(final ExitMap exitMap) {
            super(exitMap, ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_L_OUT);
            setBothSidePositions(new Position(13.54, 63.35));
            setBothTopPositions(new Position(26.7, 52.43));
        }
    }

    private static class ThievesHideoutMToGerudosFortress extends Exit {
        public ThievesHideoutMToGerudosFortress(final ExitMap exitMap) {
            super(exitMap, ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_M_OUT);
            setBothSidePositions(new Position(52.47, 31.67));
            setBothTopPositions(new Position(65.25, 22.69));
        }
    }

    private static class ThievesHideoutNToGerudosFortress extends Exit {
        public ThievesHideoutNToGerudosFortress(final ExitMap exitMap) {
            super(exitMap, ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_N_OUT);
            setBothSidePositions(new Position(2.86, 16.04));
            setBothTopPositions(new Position(0.45, 7.95));
        }
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
