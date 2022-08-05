package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;

public class GerudosFortress extends ExitMap {
    public GerudosFortress() {
        super();
        setPlace(PlaceWithMap.GERUDOS_FORTRESS);
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[8]);
        initMap();
        setDungeonEntrancesAmount(1);
        setGrottoEntrancesAmount(1);
        setOverworldTransitionsAmount(2);
        setAccessibility(false, true);
        setZoom(UnchangingTransition.GERUDOS_FORTRESS_TO_THIEVES_HIDEOUT_OUTSIDE);
        initExits();
        setExit(new GerudosFortressToGerudoTrainingGround(this), 0);
        setExit(new GerudosFortressToStormsGrotto(this), 1);
        setExit(new GerudosFortressToGerudoValley(this), 2);
        setExit(new GerudosFortressToHauntedWasteland(this), 3);
    }

    private static class GerudosFortressToGerudoTrainingGround extends Exit {
        public GerudosFortressToGerudoTrainingGround(final ExitMap exitMap) {
            super(exitMap, ExitType.DUNGEON_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDungeonEntrance(DungeonEntrance.GERUDO_TRAINING_GROUND);
            setBothSidePositions(new Position(42.8, 78.75));
            setBothTopPositions(new Position(34.0, 60.5));
        }
    }

    private static class GerudosFortressToStormsGrotto extends Exit {
        public GerudosFortressToStormsGrotto(final ExitMap exitMap) {
            super(exitMap, ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.GF_STORMS_GROTTO);
            setBothSidePositions(new Position(41.0, 75.5));
            setBothTopPositions(new Position(38.0, 53.0));
        }
    }

    private static class GerudosFortressToGerudoValley extends Exit {
        public GerudosFortressToGerudoValley(final ExitMap exitMap) {
            super(exitMap, ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.GERUDO_VALLEY);
            setBothSidePositions(new Position(53.75, 95.5));
            setBothTopPositions(new Position(31.0, 76.5));
        }
    }

    private static class GerudosFortressToHauntedWasteland extends Exit {
        public GerudosFortressToHauntedWasteland(final ExitMap exitMap) {
            super(exitMap, ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.HAUNTED_WASTELAND);
            setBothSidePositions(new Position(7.1, 90.75));
            setBothTopPositions(new Position(2.3, 36.0));
        }
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 36;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 50;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 36;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 50;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
