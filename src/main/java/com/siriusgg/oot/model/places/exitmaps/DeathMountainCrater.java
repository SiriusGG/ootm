package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;

public class DeathMountainCrater extends ExitMap {
    public DeathMountainCrater(final Settings settings) {
        super(settings);
        setName("Death Mountain Crater");
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
        }
    }

    private static class DMCToFireTemple extends Exit {
        public DMCToFireTemple() {
            super(ExitType.DUNGEON_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDungeonEntrance(DungeonEntrance.FIRE_TEMPLE);
        }
    }

    private static class DMCToDMCUpperGrotto extends Exit {
        public DMCToDMCUpperGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.DMC_UPPER_GROTTO);
        }
    }

    private static class DMCToDMCHammerGrotto extends Exit {
        public DMCToDMCHammerGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.DMC_HAMMER_GROTTO);
        }
    }

    private static class DMCToDMT extends Exit {
        public DMCToDMT() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.DEATH_MOUNTAIN_TRAIL);
        }
    }

    private static class DMCToGoronCity extends Exit {
        public DMCToGoronCity() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.GORON_CITY);
        }
    }
}
