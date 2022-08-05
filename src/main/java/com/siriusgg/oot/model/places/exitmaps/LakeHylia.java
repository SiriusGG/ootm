package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;

public class LakeHylia extends ExitMap {
    public LakeHylia() {
        super();
        setPlace(PlaceWithMap.LAKE_HYLIA);
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[23]);
        initMap();
        setDoorEntrancesAmount(2);
        setDungeonEntrancesAmount(1);
        setGrottoEntrancesAmount(1);
        setOverworldTransitionsAmount(1);
        setHasOwlStart(true);
        initExits();
        setExit(new LakeHyliaToFishingHole(this), 0);
        setExit(new LakeHyliaToLab(this), 1);
        setExit(new LakeHyliaToWaterTemple(this), 2);
        setExit(new LakeHyliaToGrotto(this), 3);
        setExit(new LakeHyliaToHyruleField(this), 4);
        setExit(new LakeHyliaOwlStart(this), 5);
    }

    private static class LakeHyliaToFishingHole extends Exit {
        public LakeHyliaToFishingHole(final ExitMap exitMap) {
            super(exitMap, ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.LH_FISHING_HOLE);
            setBothSidePositions(new Position(73.76, 64.2));
            setBothTopPositions(new Position(75.33, 49.31));
        }
    }

    private static class LakeHyliaToLab extends Exit {
        public LakeHyliaToLab(final ExitMap exitMap) {
            super(exitMap, ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.LH_LAB);
            setBothSidePositions(new Position(43.16, 37.06));
            setBothTopPositions(new Position(26.14, 49.07));
        }
    }

    private static class LakeHyliaToWaterTemple extends Exit {
        public LakeHyliaToWaterTemple(final ExitMap exitMap) {
            super(exitMap, ExitType.DUNGEON_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDungeonEntrance(DungeonEntrance.WATER_TEMPLE);
            setBothSidePositions(new Position(34.9, 83.64));
            setBothTopPositions(new Position(46.08, 72.8));
        }
    }

    private static class LakeHyliaToGrotto extends Exit {
        public LakeHyliaToGrotto(final ExitMap exitMap) {
            super(exitMap, ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.LH_GROTTO);
            setBothSidePositions(new Position(21.03, 47.13));
            setBothTopPositions(new Position(20.26, 69.1));
        }
    }

    private static class LakeHyliaToHyruleField extends Exit {
        public LakeHyliaToHyruleField(final ExitMap exitMap) {
            super(exitMap, ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.HYRULE_FIELD);
            setBothSidePositions(new Position(89.45, 8.39));
            setBothTopPositions(new Position(38.24, 3.36));
        }
    }

    private static class LakeHyliaOwlStart extends Exit {
        public LakeHyliaOwlStart(final ExitMap exitMap) {
            super(exitMap, ExitType.OWL_START);
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
