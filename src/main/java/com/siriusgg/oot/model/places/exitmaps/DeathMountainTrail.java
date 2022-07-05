package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;

public class DeathMountainTrail extends ExitMap {
    public DeathMountainTrail(final Settings settings) {
        super(settings);
        setName("Death Mountain Trail");
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
            setCanBeUsedAsChild(true);
            setCanBeUsedAsAdult(true);
            setDoorEntrance(DoorEntrance.DMT_GREAT_FAIRY_FOUNTAIN);
        }
    }

    private static class DMTToDodongosCavern extends Exit {
        public DMTToDodongosCavern() {
            super(ExitType.DUNGEON_ENTRANCE);
            setCanBeUsedAsChild(true);
            setCanBeUsedAsAdult(true);
            setDungeonEntrance(DungeonEntrance.DODONGOS_CAVERN);
        }
    }

    private static class DMTToCowGrotto extends Exit {
        public DMTToCowGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            setCanBeUsedAsChild(true);
            setCanBeUsedAsAdult(true);
            setGrottoEntrance(GrottoEntrance.DMT_COW_GROTTO);
        }
    }

    private static class DMTToStormsGrotto extends Exit {
        public DMTToStormsGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            setCanBeUsedAsChild(true);
            setCanBeUsedAsAdult(true);
            setGrottoEntrance(GrottoEntrance.DMT_STORMS_GROTTO);
        }
    }

    private static class DMTToKakarikoVillage extends Exit {
        public DMTToKakarikoVillage() {
            super(ExitType.OVERWORLD);
            setCanBeUsedAsChild(true);
            setCanBeUsedAsAdult(true);
            setOverworld(Overworld.KAKARIKO_VILLAGE);
        }
    }

    private static class DMTToGoronCity extends Exit {
        public DMTToGoronCity() {
            super(ExitType.OVERWORLD);
            setCanBeUsedAsChild(true);
            setCanBeUsedAsAdult(true);
            setOverworld(Overworld.GORON_CITY);
        }
    }

    private static class DMTToDMC extends Exit {
        public DMTToDMC() {
            super(ExitType.OVERWORLD);
            setCanBeUsedAsChild(true);
            setCanBeUsedAsAdult(true);
            setOverworld(Overworld.DEATH_MOUNTAIN_CRATER);
        }
    }

    private static class DMTOwl extends Exit {
        public DMTOwl() {
            super(ExitType.OWL_START);
            setCanBeUsedAsChild(true);
            setCanBeUsedAsAdult(false);
            setOwlStart(OwlStart.DEATH_MOUNTAIN_TRAIL);
        }
    }
}
