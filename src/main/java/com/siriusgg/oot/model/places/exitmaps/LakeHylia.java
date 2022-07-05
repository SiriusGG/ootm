package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;

public class LakeHylia extends ExitMap {
    public LakeHylia(final Settings settings) {
        super(settings);
        setName("Lake Hylia");
        initMap();
        setDoorEntrancesAmount(2);
        setDungeonEntrancesAmount(1);
        setGrottoEntrancesAmount(1);
        setOverworldTransitionsAmount(1);
        setHasOwlStart(true);
        initExits();
        setExit(new LakeHyliaToFishingHole(), 0);
        setExit(new LakeHyliaToLab(), 1);
        setExit(new LakeHyliaToWaterTemple(), 2);
        setExit(new LakeHyliaToGrotto(), 3);
        setExit(new LakeHyliaToHyruleField(), 4);
        setExit(new LakeHyliaOwlStart(), 5);
    }

    private static class LakeHyliaToFishingHole extends Exit {
        public LakeHyliaToFishingHole() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.LH_FISHING_HOLE);
        }
    }

    private static class LakeHyliaToLab extends Exit {
        public LakeHyliaToLab() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.LH_LAB);
        }
    }

    private static class LakeHyliaToWaterTemple extends Exit {
        public LakeHyliaToWaterTemple() {
            super(ExitType.DUNGEON_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDungeonEntrance(DungeonEntrance.WATER_TEMPLE);
        }
    }

    private static class LakeHyliaToGrotto extends Exit {
        public LakeHyliaToGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.LH_GROTTO);
        }
    }

    private static class LakeHyliaToHyruleField extends Exit {
        public LakeHyliaToHyruleField() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.HYRULE_FIELD);
        }
    }

    private static class LakeHyliaOwlStart extends Exit {
        public LakeHyliaOwlStart() {
            super(ExitType.OWL_START);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOwlStart(OwlStart.LAKE_HYLIA);
        }
    }
}
