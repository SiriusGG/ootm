package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;

public class GoronCity extends ExitMap {
    public GoronCity() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[11]);
        initMap();
        setDoorEntrancesAmount(1);
        setGrottoEntrancesAmount(1);
        setOverworldTransitionsAmount(3);
        initExits();
        setExit(new GoronCityToGoronShop(), 0);
        setExit(new GoronCityToGoronGrotto(), 1);
        setExit(new GoronCityToDMT(), 2);
        setExit(new GoronCityToLostWoods(), 3);
        setExit(new GoronCityToDMC(), 4);
    }

    private static class GoronCityToGoronShop extends Exit {
        public GoronCityToGoronShop() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.GC_SHOP);
            setBothSidePositions(new Position(44.29, 89.58));
            setBothTopPositions(new Position(44.39, 45.37));
        }
    }

    private static class GoronCityToGoronGrotto extends Exit {
        public GoronCityToGoronGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.GC_GROTTO);
            setBothSidePositions(new Position(92.86, 18.87));
            setBothTopPositions(new Position(90.75, 7.75));
        }
    }

    private static class GoronCityToDMT extends Exit {
        public GoronCityToDMT() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.DEATH_MOUNTAIN_TRAIL);
            setBothSidePositions(new Position(17.5, 25.23));
            setBothTopPositions(new Position(53.9, 92.71));
        }
    }

    private static class GoronCityToLostWoods extends Exit {
        public GoronCityToLostWoods() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.LOST_WOODS);
            setBothSidePositions(new Position(29.52, 81.02));
            setBothTopPositions(new Position(71.07, 91.78));
        }
    }

    private static class GoronCityToDMC extends Exit {
        public GoronCityToDMC() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.DEATH_MOUNTAIN_CRATER);
            setBothSidePositions(new Position(79.52, 80.79));
            setBothTopPositions(new Position(55.22, 0.46));
        }
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 50;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 60;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 50;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 60;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
