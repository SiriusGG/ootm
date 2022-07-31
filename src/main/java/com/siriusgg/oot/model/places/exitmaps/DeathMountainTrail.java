package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;

public class DeathMountainTrail extends ExitMap {
    public DeathMountainTrail() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[3]);
        initMap();
        setDoorEntrancesAmount(1);
        setDungeonEntrancesAmount(1);
        setGrottoEntrancesAmount(2);
        setOverworldTransitionsAmount(3);
        setHasOwlStart(true);
        initExits();
        setExit(new DMTToGreatFairy(), 0);
        setExit(new DMTToDodongosCavern(), 1);
        setExit(new DMTToCowGrotto(), 2);
        setExit(new DMTToStormsGrotto(), 3);
        setExit(new DMTToKakarikoVillage(), 4);
        setExit(new DMTToGoronCity(), 5);
        setExit(new DMTToDMC(), 6);
        setExit(new DMTOwl(), 7);
    }

    private static class DMTToGreatFairy extends Exit {
        public DMTToGreatFairy() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.DMT_GREAT_FAIRY_FOUNTAIN);
            setBothSidePositions(new Position(71.3, 20.0));
            setBothTopPositions(new Position(47.5, 17.5));
        }
    }

    private static class DMTToDodongosCavern extends Exit {
        public DMTToDodongosCavern() {
            super(ExitType.DUNGEON_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDungeonEntrance(DungeonEntrance.DODONGOS_CAVERN);
            setBothSidePositions(new Position(37.3, 33.8));
            setBothTopPositions(new Position(16.0, 60.0));
        }
    }

    private static class DMTToCowGrotto extends Exit {
        public DMTToCowGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.DMT_COW_GROTTO);
            setBothSidePositions(new Position(38.0, 52.5));
            setBothTopPositions(new Position(38.0, 62.0));
        }
    }

    private static class DMTToStormsGrotto extends Exit {
        public DMTToStormsGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.DMT_STORMS_GROTTO);
            setBothSidePositions(new Position(47.0, 58.8));
            setBothTopPositions(new Position(80.0, 75.0));
        }
    }

    private static class DMTToKakarikoVillage extends Exit {
        public DMTToKakarikoVillage() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.KAKARIKO_VILLAGE);
            setBothSidePositions(new Position(3.5, 66.0));
            setBothTopPositions(new Position(25.0, 90.0));
        }
    }

    private static class DMTToGoronCity extends Exit {
        public DMTToGoronCity() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.GORON_CITY);
            setBothSidePositions(new Position(54.3, 57.5));
            setBothTopPositions(new Position(80.0, 66.0));
        }
    }

    private static class DMTToDMC extends Exit {
        public DMTToDMC() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.DEATH_MOUNTAIN_CRATER);
            setBothSidePositions(new Position(76.0, 20.0));
            setBothTopPositions(new Position(63.0, 9.0));
        }
    }

    private static class DMTOwl extends Exit {
        public DMTOwl() {
            super(ExitType.OWL_START);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(false);
            setOwlStart(OwlStart.DEATH_MOUNTAIN_TRAIL);
            setChildSidePosition(new Position(73.0, 23.5));
            setChildTopPosition(new Position(53.0, 21.5));
        }
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 44;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 40;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 44;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 40;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
