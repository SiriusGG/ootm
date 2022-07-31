package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;

public class LakeHylia extends ExitMap {
    public LakeHylia() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[23]);
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
            setBothSidePositions(new Position(73.76, 64.2));
            setBothTopPositions(new Position(75.33, 49.31));
        }
    }

    private static class LakeHyliaToLab extends Exit {
        public LakeHyliaToLab() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.LH_LAB);
            setBothSidePositions(new Position(43.16, 37.06));
            setBothTopPositions(new Position(26.14, 49.07));
        }
    }

    private static class LakeHyliaToWaterTemple extends Exit {
        public LakeHyliaToWaterTemple() {
            super(ExitType.DUNGEON_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDungeonEntrance(DungeonEntrance.WATER_TEMPLE);
            setBothSidePositions(new Position(34.9, 83.64));
            setBothTopPositions(new Position(46.08, 72.8));
        }
    }

    private static class LakeHyliaToGrotto extends Exit {
        public LakeHyliaToGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.LH_GROTTO);
            setBothSidePositions(new Position(21.03, 47.13));
            setBothTopPositions(new Position(20.26, 69.1));
        }
    }

    private static class LakeHyliaToHyruleField extends Exit {
        public LakeHyliaToHyruleField() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.HYRULE_FIELD);
            setBothSidePositions(new Position(89.45, 8.39));
            setBothTopPositions(new Position(38.24, 3.36));
        }
    }

    private static class LakeHyliaOwlStart extends Exit {
        public LakeHyliaOwlStart() {
            super(ExitType.OWL_START);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(false);
            setOwlStart(OwlStart.LAKE_HYLIA);
            setChildSidePosition(new Position(19.92, 44.76));
            setChildTopPosition(new Position(16.83, 69.1));
        }
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 40;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 32;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 40;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 32;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
