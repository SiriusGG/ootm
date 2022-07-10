package com.siriusgg.oot.model.places.exitmaps;

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
        }
    }

    private static class SacredForestMeadowToWolfosGrotto extends Exit {
        public SacredForestMeadowToWolfosGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.SFM_WOLFOS_GROTTO);
        }
    }

    private static class SacredForestMeadowToFairyGrotto extends Exit {
        public SacredForestMeadowToFairyGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.SFM_FAIRY_GROTTO);
        }
    }

    private static class SacredForestMeadowToStormsGrotto extends Exit {
        public SacredForestMeadowToStormsGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.SFM_STORMS_GROTTO);
        }
    }

    private static class SacredForestMeadowToLostWoods extends Exit {
        public SacredForestMeadowToLostWoods() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.LOST_WOODS);
        }
    }
}
