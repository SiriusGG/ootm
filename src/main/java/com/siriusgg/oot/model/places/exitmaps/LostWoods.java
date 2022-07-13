package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.PermanentlyLoadedInformation;
import com.siriusgg.oot.model.places.*;

public class LostWoods extends ExitMap {
    public LostWoods() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[26]);
        initMap();
        setGrottoEntrancesAmount(3);
        setOverworldTransitionsAmount(6);
        initExits();
        setExit(new LostWoodsToNearShortcutsGrotto(), 0);
        setExit(new LostWoodsToDekuTheater(), 1);
        setExit(new LostWoodsToScrubsGrotto(), 2);
        setExit(new LostWoodsToKokiriForestUpper(), 3);
        setExit(new LostWoodsToKokiriForestBridge(), 4);
        setExit(new LostWoodsToHyruleField(), 5);
        setExit(new LostWoodsToGoronCity(), 6);
        setExit(new LostWoodsToZorasRiver(), 7);
        setExit(new LostWoodsToSacredForestMeadow(), 8);
    }

    private static class LostWoodsToNearShortcutsGrotto extends Exit {
        public LostWoodsToNearShortcutsGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.LW_NEAR_SHORTCUTS_GROTTO);
        }
    }

    private static class LostWoodsToDekuTheater extends Exit {
        public LostWoodsToDekuTheater() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.DEKU_THEATER);
        }
    }

    private static class LostWoodsToScrubsGrotto extends Exit {
        public LostWoodsToScrubsGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.LW_SCRUBS_GROTTO);
        }
    }

    private static class LostWoodsToKokiriForestUpper extends Exit {
        public LostWoodsToKokiriForestUpper() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.KOKIRI_FOREST);
        }
    }

    private static class LostWoodsToKokiriForestBridge extends Exit {
        public LostWoodsToKokiriForestBridge() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.KOKIRI_FOREST);
        }
    }

    private static class LostWoodsToHyruleField extends Exit {
        public LostWoodsToHyruleField() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.HYRULE_FIELD);
        }
    }

    private static class LostWoodsToGoronCity extends Exit {
        public LostWoodsToGoronCity() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.GORON_CITY);
        }
    }

    private static class LostWoodsToZorasRiver extends Exit {
        public LostWoodsToZorasRiver() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.ZORAS_RIVER);
        }
    }

    private static class LostWoodsToSacredForestMeadow extends Exit {
        public LostWoodsToSacredForestMeadow() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.SACRED_FOREST_MEADOW);
        }
    }
}
