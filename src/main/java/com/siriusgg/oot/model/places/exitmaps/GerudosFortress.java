package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.PermanentlyLoadedInformation;
import com.siriusgg.oot.model.places.*;

public class GerudosFortress extends ExitMap {
    public GerudosFortress() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[8]);
        initMap();
        setDungeonEntrancesAmount(1);
        setGrottoEntrancesAmount(1);
        setOverworldTransitionsAmount(2);
        setUnchangingTransitionsAmount(13);
        setAccessibility(false, true);
        initExits();
        setExit(new GerudosFortressToGerudoTrainingGround(), 0);
        setExit(new GerudosFortressToStormsGrotto(), 1);
        setExit(new GerudosFortressToThievesHideoutB(), 2);
        setExit(new GerudosFortressToThievesHideoutC(), 3);
        setExit(new GerudosFortressToThievesHideoutD(), 4);
        setExit(new GerudosFortressToThievesHideoutE(), 5);
        setExit(new GerudosFortressToThievesHideoutF(), 6);
        setExit(new GerudosFortressToThievesHideoutG(), 7);
        setExit(new GerudosFortressToThievesHideoutH(), 8);
        setExit(new GerudosFortressToThievesHideoutI(), 9);
        setExit(new GerudosFortressToThievesHideoutJ(), 10);
        setExit(new GerudosFortressToThievesHideoutK(), 11);
        setExit(new GerudosFortressToThievesHideoutL(), 12);
        setExit(new GerudosFortressToThievesHideoutM(), 13);
        setExit(new GerudosFortressToThievesHideoutN(), 14);
    }

    private static class GerudosFortressToGerudoTrainingGround extends Exit {
        public GerudosFortressToGerudoTrainingGround() {
            super(ExitType.DUNGEON_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDungeonEntrance(DungeonEntrance.GERUDO_TRAINING_GROUND);
        }
    }

    private static class GerudosFortressToStormsGrotto extends Exit {
        public GerudosFortressToStormsGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.GF_STORMS_GROTTO);
        }
    }

    private static class GerudosFortressToThievesHideoutB extends Exit {
        public GerudosFortressToThievesHideoutB() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_B_IN);
        }
    }

    private static class GerudosFortressToThievesHideoutC extends Exit {
        public GerudosFortressToThievesHideoutC() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_C_IN);
        }
    }

    private static class GerudosFortressToThievesHideoutD extends Exit {
        public GerudosFortressToThievesHideoutD() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_D_IN);
        }
    }

    private static class GerudosFortressToThievesHideoutE extends Exit {
        public GerudosFortressToThievesHideoutE() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_E_IN);
        }
    }

    private static class GerudosFortressToThievesHideoutF extends Exit {
        public GerudosFortressToThievesHideoutF() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_F_IN);
        }
    }

    private static class GerudosFortressToThievesHideoutG extends Exit {
        public GerudosFortressToThievesHideoutG() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_G_IN);
        }
    }

    private static class GerudosFortressToThievesHideoutH extends Exit {
        public GerudosFortressToThievesHideoutH() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_H_IN);
        }
    }

    private static class GerudosFortressToThievesHideoutI extends Exit {
        public GerudosFortressToThievesHideoutI() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_I_IN);
        }
    }

    private static class GerudosFortressToThievesHideoutJ extends Exit {
        public GerudosFortressToThievesHideoutJ() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_J_IN);
        }
    }

    private static class GerudosFortressToThievesHideoutK extends Exit {
        public GerudosFortressToThievesHideoutK() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_K_IN);
        }
    }

    private static class GerudosFortressToThievesHideoutL extends Exit {
        public GerudosFortressToThievesHideoutL() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_L_IN);
        }
    }

    private static class GerudosFortressToThievesHideoutM extends Exit {
        public GerudosFortressToThievesHideoutM() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_M_IN);
        }
    }

    private static class GerudosFortressToThievesHideoutN extends Exit {
        public GerudosFortressToThievesHideoutN() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.THIEVES_HIDEOUT_N_IN);
        }
    }
}
