package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;

public class SacredForestMeadow extends ExitMap {
    public SacredForestMeadow() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[29]);
        initMap();
        setDungeonEntrancesAmount(1);
        setGrottoEntrancesAmount(3);
        setOverworldTransitionsAmount(1);
        initExits();
        setExit(new SacredForestMeadowToForestTemple(), 0);
        setExit(new SacredForestMeadowToWolfosGrotto(), 1);
        setExit(new SacredForestMeadowToFairyGrotto(), 2);
        setExit(new SacredForestMeadowToStormsGrotto(), 3);
        setExit(new SacredForestMeadowToLostWoods(), 4);
    }

    private static class SacredForestMeadowToForestTemple extends Exit {
        public SacredForestMeadowToForestTemple() {
            super(ExitType.DUNGEON_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDungeonEntrance(DungeonEntrance.FOREST_TEMPLE);
            setBothSidePositions(new Position(90.28, 23.03));
            setBothTopPositions(new Position(43.78, 0.46));
        }
    }

    private static class SacredForestMeadowToWolfosGrotto extends Exit {
        public SacredForestMeadowToWolfosGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.SFM_WOLFOS_GROTTO);
            setBothSidePositions(new Position(14.92, 87.62));
            setBothTopPositions(new Position(31.84, 84.26));
        }
    }

    private static class SacredForestMeadowToFairyGrotto extends Exit {
        public SacredForestMeadowToFairyGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.SFM_FAIRY_GROTTO);
            setBothSidePositions(new Position(41.89, 72.69));
            setBothTopPositions(new Position(46.77, 57.29));
        }
    }

    private static class SacredForestMeadowToStormsGrotto extends Exit {
        public SacredForestMeadowToStormsGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.SFM_STORMS_GROTTO);
            setBothSidePositions(new Position(82.07, 41.32));
            setBothTopPositions(new Position(66.17, 15.16));
        }
    }

    private static class SacredForestMeadowToLostWoods extends Exit {
        public SacredForestMeadowToLostWoods() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.LOST_WOODS);
            setBothSidePositions(new Position(5.13, 92.13));
            setBothTopPositions(new Position(28.86, 93.29));
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
