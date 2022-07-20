package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;

public class DeathMountainCrater extends ExitMap {
    public DeathMountainCrater() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[2]);
        initMap();
        setDoorEntrancesAmount(1);
        setDungeonEntrancesAmount(1);
        setGrottoEntrancesAmount(2);
        setOverworldTransitionsAmount(2);
        initExits();
        setExit(new DMCToGreatFairy(), 0);
        setExit(new DMCToFireTemple(), 1);
        setExit(new DMCToDMCUpperGrotto(), 2);
        setExit(new DMCToDMCHammerGrotto(), 3);
        setExit(new DMCToDMT(), 4);
        setExit(new DMCToGoronCity(), 5);
    }

    private static class DMCToGreatFairy extends Exit {
        public DMCToGreatFairy() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.DMC_GREAT_FAIRY_FOUNTAIN);
            setBothSidePositions(new Position(50.5, 50.0));
            setBothTopPositions(new Position(16.0, 60.0));
        }
    }

    private static class DMCToFireTemple extends Exit {
        public DMCToFireTemple() {
            super(ExitType.DUNGEON_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDungeonEntrance(DungeonEntrance.FIRE_TEMPLE);
            setBothSidePositions(new Position(79.5, 83.5));
            setBothTopPositions(new Position(44.0, 3.0));
        }
    }

    private static class DMCToDMCUpperGrotto extends Exit {
        public DMCToDMCUpperGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.DMC_UPPER_GROTTO);
            setBothSidePositions(new Position(23.5, 43.0));
            setBothTopPositions(new Position(44.8, 75.0));
        }
    }

    private static class DMCToDMCHammerGrotto extends Exit {
        public DMCToDMCHammerGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(false);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.DMC_HAMMER_GROTTO);
            setBothSidePositions(new Position(73.0, 60.5));
            setBothTopPositions(new Position(12.5, 30.0));
        }
    }

    private static class DMCToDMT extends Exit {
        public DMCToDMT() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.DEATH_MOUNTAIN_TRAIL);
            setBothSidePositions(new Position(32.0, 32.0));
            setBothTopPositions(new Position(3.5, 93.7));
        }
    }

    private static class DMCToGoronCity extends Exit {
        public DMCToGoronCity() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.GORON_CITY);
            setBothSidePositions(new Position(67.0, 56.0));
            setBothTopPositions(new Position(1.0, 41.5));
        }
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 50;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 45;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 50;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 45;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
