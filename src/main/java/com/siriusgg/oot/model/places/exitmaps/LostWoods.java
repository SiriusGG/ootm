package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;

public class LostWoods extends ExitMap {
    public LostWoods() {
        super();
        setPlace(PlaceWithMap.LOST_WOODS);
        setName(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[26]);
        initMap();
        setGrottoEntrancesAmount(3);
        setOverworldTransitionsAmount(6);
        initExits();
        setExit(new LostWoodsToNearShortcutsGrotto(this), 0);
        setExit(new LostWoodsToDekuTheater(this), 1);
        setExit(new LostWoodsToScrubsGrotto(this), 2);
        setExit(new LostWoodsToKokiriForestUpper(this), 3);
        setExit(new LostWoodsToKokiriForestBridge(this), 4);
        setExit(new LostWoodsToHyruleField(this), 5);
        setExit(new LostWoodsToGoronCity(this), 6);
        setExit(new LostWoodsToZorasRiver(this), 7);
        setExit(new LostWoodsToSacredForestMeadow(this), 8);
    }

    private static class LostWoodsToNearShortcutsGrotto extends Exit {
        public LostWoodsToNearShortcutsGrotto(final ExitMap exitMap) {
            super(exitMap, ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.LW_NEAR_SHORTCUTS_GROTTO);
            setBothSidePositions(new Position(67.58, 57.08));
            setBothTopPositions(new Position(59.89, 34.84));
        }
    }

    private static class LostWoodsToDekuTheater extends Exit {
        public LostWoodsToDekuTheater(final ExitMap exitMap) {
            super(exitMap, ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.DEKU_THEATER);
            setBothSidePositions(new Position(65.69, 38.27));
            setBothTopPositions(new Position(41.65, 23.03));
        }
    }

    private static class LostWoodsToScrubsGrotto extends Exit {
        public LostWoodsToScrubsGrotto(final ExitMap exitMap) {
            super(exitMap, ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.LW_SCRUBS_GROTTO);
            setBothSidePositions(new Position(83.79, 30.75));
            setBothTopPositions(new Position(53.72, 5.56));
        }
    }

    private static class LostWoodsToKokiriForestUpper extends Exit {
        public LostWoodsToKokiriForestUpper(final ExitMap exitMap) {
            super(exitMap, ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.KOKIRI_FOREST);
            setBothSidePositions(new Position(41.34, 63.05));
            setBothTopPositions(new Position(38.99, 57.64));
        }
    }

    private static class LostWoodsToKokiriForestBridge extends Exit {
        public LostWoodsToKokiriForestBridge(final ExitMap exitMap) {
            super(exitMap, ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.KOKIRI_FOREST);
            setBothSidePositions(new Position(16.15, 81.19));
            setBothTopPositions(new Position(17.81, 82.64));
        }
    }

    private static class LostWoodsToHyruleField extends Exit {
        public LostWoodsToHyruleField(final ExitMap exitMap) {
            super(exitMap, ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.HYRULE_FIELD);
            setBothSidePositions(new Position(8.85, 68.14));
            setBothTopPositions(new Position(5.89, 82.64));
        }
    }

    private static class LostWoodsToGoronCity extends Exit {
        public LostWoodsToGoronCity(final ExitMap exitMap) {
            super(exitMap, ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.GORON_CITY);
            setBothSidePositions(new Position(66.93, 50.88));
            setBothTopPositions(new Position(57.5, 30.67));
        }
    }

    private static class LostWoodsToZorasRiver extends Exit {
        public LostWoodsToZorasRiver(final ExitMap exitMap) {
            super(exitMap, ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.ZORAS_RIVER);
            setBothSidePositions(new Position(84.64, 92.04));
            setBothTopPositions(new Position(92.57, 36.34));
        }
    }

    private static class LostWoodsToSacredForestMeadow extends Exit {
        public LostWoodsToSacredForestMeadow(final ExitMap exitMap) {
            super(exitMap, ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.SACRED_FOREST_MEADOW);
            setBothSidePositions(new Position(86.59, 29.42));
            setBothTopPositions(new Position(53.72, 4.98));
        }
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 32;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 40;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 32;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 40;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
