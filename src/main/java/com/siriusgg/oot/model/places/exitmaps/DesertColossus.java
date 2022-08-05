package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;

public class DesertColossus extends ExitMap {
    public DesertColossus() {
        super();
        setPlace(PlaceWithMap.DESERT_COLOSSUS);
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[4]);
        initMap();
        setDoorEntrancesAmount(1);
        setDungeonEntrancesAmount(1);
        setGrottoEntrancesAmount(1);
        setOverworldTransitionsAmount(1);
        setUnchangingTransitionsAmount(2);
        initExits();
        setExit(new DesertColossusToGreatFairy(this), 0);
        setExit(new DesertColossusToSpiritTemple(this), 1);
        setExit(new DesertColossusToColossusGrotto(this), 2);
        setExit(new DesertColossusToHauntedWasteland(this), 3);
        setExit(new DesertColossusToSpiritTempleLeftHand(this), 4);
        setExit(new DesertColossusToSpiritTempleRightHand(this), 5);
    }

    private static class DesertColossusToGreatFairy extends Exit {
        public DesertColossusToGreatFairy(final ExitMap exitMap) {
            super(exitMap, ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.COLOSSUS_GREAT_FAIRY_FOUNTAIN);
            setBothSidePositions(new Position(67.5, 58.0));
            setBothTopPositions(new Position(63.0, 24.0));
        }
    }

    private static class DesertColossusToSpiritTemple extends Exit {
        public DesertColossusToSpiritTemple(final ExitMap exitMap) {
            super(exitMap, ExitType.DUNGEON_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDungeonEntrance(DungeonEntrance.SPIRIT_TEMPLE);
            setBothSidePositions(new Position(24.0, 49.8));
            setBothTopPositions(new Position(20.0, 46.0));
        }
    }

    private static class DesertColossusToColossusGrotto extends Exit {
        public DesertColossusToColossusGrotto(final ExitMap exitMap) {
            super(exitMap, ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(false);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.COLOSSUS_GROTTO);
            setBothSidePositions(new Position(47.3, 51.0));
            setBothTopPositions(new Position(36.0, 27.0));
        }
    }

    private static class DesertColossusToHauntedWasteland extends Exit {
        public DesertColossusToHauntedWasteland(final ExitMap exitMap) {
            super(exitMap, ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.HAUNTED_WASTELAND);
            setBothSidePositions(new Position(79.5, 83.5));
            setBothTopPositions(new Position(89.0, 43.5));
        }
    }

    private static class DesertColossusToSpiritTempleLeftHand extends Exit {
        public DesertColossusToSpiritTempleLeftHand(final ExitMap exitMap) {
            super(exitMap, ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.DESERT_COLOSSUS_TO_SPIRIT_TEMPLE_LEFT_HAND);
            setBothSidePositions(new Position(26.0, 30.0));
            setBothTopPositions(new Position(16.0, 40.0));
        }
    }

    private static class DesertColossusToSpiritTempleRightHand extends Exit {
        public DesertColossusToSpiritTempleRightHand(final ExitMap exitMap) {
            super(exitMap, ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.DESERT_COLOSSUS_TO_SPIRIT_TEMPLE_RIGHT_HAND);
            setBothSidePositions(new Position(18.0, 35.0));
            setBothTopPositions(new Position(16.0, 52.0));
        }
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 50;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 40;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 50;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 40;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
