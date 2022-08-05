package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;

public class DeathMountainCrater extends ExitMap {
    public DeathMountainCrater() {
        super();
        setPlace(PlaceWithMap.DEATH_MOUNTAIN_CRATER);
        setName(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[2]);
        initMap();
        setDoorEntrancesAmount(1);
        setDungeonEntrancesAmount(1);
        setGrottoEntrancesAmount(2);
        setOverworldTransitionsAmount(2);
        initExits();
        setExit(new DMCToGreatFairy(this), 0);
        setExit(new DMCToFireTemple(this), 1);
        setExit(new DMCToDMCUpperGrotto(this), 2);
        setExit(new DMCToDMCHammerGrotto(this), 3);
        setExit(new DMCToDMT(this), 4);
        setExit(new DMCToGoronCity(this), 5);
    }

    private static class DMCToGreatFairy extends Exit {
        public DMCToGreatFairy(final ExitMap exitMap) {
            super(exitMap, ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.DMC_GREAT_FAIRY_FOUNTAIN);
            setBothSidePositions(new Position(51.0, 49.4));
            setBothTopPositions(new Position(16.0, 60.0));
        }
    }

    private static class DMCToFireTemple extends Exit {
        public DMCToFireTemple(final ExitMap exitMap) {
            super(exitMap, ExitType.DUNGEON_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDungeonEntrance(DungeonEntrance.FIRE_TEMPLE);
            setBothSidePositions(new Position(79.5, 83.5));
            setBothTopPositions(new Position(44.0, 3.0));
        }
    }

    private static class DMCToDMCUpperGrotto extends Exit {
        public DMCToDMCUpperGrotto(final ExitMap exitMap) {
            super(exitMap, ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.DMC_UPPER_GROTTO);
            setBothSidePositions(new Position(23.5, 43.0));
            setBothTopPositions(new Position(44.8, 75.0));
        }
    }

    private static class DMCToDMCHammerGrotto extends Exit {
        public DMCToDMCHammerGrotto(final ExitMap exitMap) {
            super(exitMap, ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(false);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.DMC_HAMMER_GROTTO);
            setBothSidePositions(new Position(73.0, 60.5));
            setBothTopPositions(new Position(12.5, 30.0));
        }
    }

    private static class DMCToDMT extends Exit {
        public DMCToDMT(final ExitMap exitMap) {
            super(exitMap, ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.DEATH_MOUNTAIN_TRAIL);
            setBothSidePositions(new Position(32.0, 32.0));
            setBothTopPositions(new Position(3.5, 93.7));
        }
    }

    private static class DMCToGoronCity extends Exit {
        public DMCToGoronCity(final ExitMap exitMap) {
            super(exitMap, ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.GORON_CITY);
            setBothSidePositions(new Position(67.1, 56.1));
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
