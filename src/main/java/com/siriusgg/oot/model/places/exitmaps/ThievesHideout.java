package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;

public class ThievesHideout extends ExitMap {
    public ThievesHideout(final Settings settings) {
        super(settings);
        setName("Thieves' Hideout");
        initMap();
        setDoorExitsAmount(13);
        initExits();
        setExit(new ThievesHideoutBToGerudosFortress(), 0);
        setExit(new ThievesHideoutCToGerudosFortress(), 1);
        setExit(new ThievesHideoutDToGerudosFortress(), 2);
        setExit(new ThievesHideoutEToGerudosFortress(), 3);
        setExit(new ThievesHideoutFToGerudosFortress(), 4);
        setExit(new ThievesHideoutGToGerudosFortress(), 5);
        setExit(new ThievesHideoutHToGerudosFortress(), 6);
        setExit(new ThievesHideoutIToGerudosFortress(), 7);
        setExit(new ThievesHideoutJToGerudosFortress(), 8);
        setExit(new ThievesHideoutKToGerudosFortress(), 9);
        setExit(new ThievesHideoutLToGerudosFortress(), 10);
        setExit(new ThievesHideoutMToGerudosFortress(), 11);
        setExit(new ThievesHideoutNToGerudosFortress(), 12);
    }

    private static class ThievesHideoutBToGerudosFortress extends Exit {
        public ThievesHideoutBToGerudosFortress() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_B_OUT);
        }
    }

    private static class ThievesHideoutCToGerudosFortress extends Exit {
        public ThievesHideoutCToGerudosFortress() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_C_OUT);
        }
    }

    private static class ThievesHideoutDToGerudosFortress extends Exit {
        public ThievesHideoutDToGerudosFortress() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_D_OUT);
        }
    }

    private static class ThievesHideoutEToGerudosFortress extends Exit {
        public ThievesHideoutEToGerudosFortress() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_E_OUT);
        }
    }

    private static class ThievesHideoutFToGerudosFortress extends Exit {
        public ThievesHideoutFToGerudosFortress() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_F_OUT);
        }
    }

    private static class ThievesHideoutGToGerudosFortress extends Exit {
        public ThievesHideoutGToGerudosFortress() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_G_OUT);
        }
    }

    private static class ThievesHideoutHToGerudosFortress extends Exit {
        public ThievesHideoutHToGerudosFortress() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_H_OUT);
        }
    }

    private static class ThievesHideoutIToGerudosFortress extends Exit {
        public ThievesHideoutIToGerudosFortress() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_I_OUT);
        }
    }

    private static class ThievesHideoutJToGerudosFortress extends Exit {
        public ThievesHideoutJToGerudosFortress() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_J_OUT);
        }
    }

    private static class ThievesHideoutKToGerudosFortress extends Exit {
        public ThievesHideoutKToGerudosFortress() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_K_OUT);
        }
    }

    private static class ThievesHideoutLToGerudosFortress extends Exit {
        public ThievesHideoutLToGerudosFortress() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_L_OUT);
        }
    }

    private static class ThievesHideoutMToGerudosFortress extends Exit {
        public ThievesHideoutMToGerudosFortress() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_M_OUT);
        }
    }

    private static class ThievesHideoutNToGerudosFortress extends Exit {
        public ThievesHideoutNToGerudosFortress() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_N_OUT);
        }
    }
}
