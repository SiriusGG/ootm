package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;

public class DesertColossus extends ExitMap {
    public DesertColossus(final Settings settings) {
        super(settings);
        setName("Desert Colossus");
        initMap();
        setDoorEntrancesAmount(1);
        setDungeonEntrancesAmount(1);
        setGrottoEntrancesAmount(1);
        setOverworldTransitionsAmount(1);
        setUnchangingTransitionsAmount(2);
        initExits();
        setExit(new DesertColossusToGreatFairy(), 0);
        setExit(new DesertColossusToSpiritTemple(), 1);
        setExit(new DesertColossusToColossusGrotto(), 2);
        setExit(new DesertColossusToHauntedWasteland(), 3);
        setExit(new DesertColossusToSpiritTempleLeftHand(), 4);
        setExit(new DesertColossusToSpiritTempleRightHand(), 5);
    }

    private static class DesertColossusToGreatFairy extends Exit {
        public DesertColossusToGreatFairy() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.COLOSSUS_GREAT_FAIRY_FOUNTAIN);
        }
    }

    private static class DesertColossusToSpiritTemple extends Exit {
        public DesertColossusToSpiritTemple() {
            super(ExitType.DUNGEON_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDungeonEntrance(DungeonEntrance.SPIRIT_TEMPLE);
        }
    }

    private static class DesertColossusToColossusGrotto extends Exit {
        public DesertColossusToColossusGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(false);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.COLOSSUS_GROTTO);
        }
    }

    private static class DesertColossusToHauntedWasteland extends Exit {
        public DesertColossusToHauntedWasteland() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.HAUNTED_WASTELAND);
        }
    }

    private static class DesertColossusToSpiritTempleLeftHand extends Exit {
        public DesertColossusToSpiritTempleLeftHand() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.DESERT_COLOSSUS_TO_SPIRIT_TEMPLE_LEFT_HAND);
        }
    }

    private static class DesertColossusToSpiritTempleRightHand extends Exit {
        public DesertColossusToSpiritTempleRightHand() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.DESERT_COLOSSUS_TO_SPIRIT_TEMPLE_RIGHT_HAND);
        }
    }
}
