package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;

public class HyruleField extends ExitMap {
    public HyruleField() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[15]);
        initMap();
        setGrottoEntrancesAmount(8);
        setOverworldTransitionsAmount(7);
        setHasOwlLanding(true);
        initExits();
        setExit(new HyruleFieldToHFSouthEastGrotto(), 0);
        setExit(new HyruleFieldToHFOpenGrotto(), 1);
        setExit(new HyruleFieldToHFInsideFenceGrotto(), 2);
        setExit(new HyruleFieldToHFCowGrotto(), 3);
        setExit(new HyruleFieldToHFNearMarketGrotto(), 4);
        setExit(new HyruleFieldToHFFairyGrotto(), 5);
        setExit(new HyruleFieldToHFNearKakGrotto(), 6);
        setExit(new HyruleFieldToHFTektikeGrotto(), 7);
        setExit(new HyruleFieldToKokiriForest(), 8);
        setExit(new HyruleFieldToLakeHylia(), 9);
        setExit(new HyruleFieldToGerudoValley(), 10);
        setExit(new HyruleFieldToMarketEntrance(), 11);
        setExit(new HyruleFieldToKakarikoVillage(), 12);
        setExit(new HyruleFieldToZorasRiver(), 13);
        setExit(new HyruleFieldToLonLonRanch(), 14);
        setExit(new HyruleFieldOwlLanding(), 15);
    }

    private static class HyruleFieldToHFSouthEastGrotto extends Exit {
        public HyruleFieldToHFSouthEastGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.HF_SOUTHEAST_GROTTO);
            setBothSidePositions(new Position(36.2, 81.21));
            setBothTopPositions(new Position(59.01, 74.19));
        }
    }

    private static class HyruleFieldToHFOpenGrotto extends Exit {
        public HyruleFieldToHFOpenGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.HF_OPEN_GROTTO);
            setBothSidePositions(new Position(17.12, 74.5));
            setBothTopPositions(new Position(37.64, 82.75));
        }
    }

    private static class HyruleFieldToHFInsideFenceGrotto extends Exit {
        public HyruleFieldToHFInsideFenceGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.HF_INSIDE_FENCE_GROTTO);
            setBothSidePositions(new Position(13.67, 71.36));
            setBothTopPositions(new Position(32.1, 82.87));
        }
    }

    private static class HyruleFieldToHFCowGrotto extends Exit {
        public HyruleFieldToHFCowGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.HF_COW_GROTTO);
            setBothSidePositions(new Position(28.65, 21.92));
            setBothTopPositions(new Position(15.7, 42.94));
        }
    }

    private static class HyruleFieldToHFNearMarketGrotto extends Exit {
        public HyruleFieldToHFNearMarketGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.HF_NEAR_MARKET_GROTTO);
            setBothSidePositions(new Position(74.15, 18.34));
            setBothTopPositions(new Position(52.08, 7.52));
        }
    }

    private static class HyruleFieldToHFFairyGrotto extends Exit {
        public HyruleFieldToHFFairyGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.HF_FAIRY_GROTTO);
            setBothSidePositions(new Position(67.58, 4.92));
            setBothTopPositions(new Position(34.99, 0.93));
        }
    }

    private static class HyruleFieldToHFNearKakGrotto extends Exit {
        public HyruleFieldToHFNearKakGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.HF_NEAR_KAK_GROTTO);
            setBothSidePositions(new Position(90.63, 29.98));
            setBothTopPositions(new Position(72.63, 3.01));
        }
    }

    private static class HyruleFieldToHFTektikeGrotto extends Exit {
        public HyruleFieldToHFTektikeGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.HF_TEKTITE_GROTTO);
            setBothSidePositions(new Position(54.36, 16.11));
            setBothTopPositions(new Position(32.1, 19.68));
        }
    }

    private static class HyruleFieldToKokiriForest extends Exit {
        public HyruleFieldToKokiriForest() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.KOKIRI_FOREST);
            setBothSidePositions(new Position(70.38, 84.12));
            setBothTopPositions(new Position(90.18, 52.31));
        }
    }

    private static class HyruleFieldToLakeHylia extends Exit {
        public HyruleFieldToLakeHylia() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.LAKE_HYLIA);
            setBothSidePositions(new Position(3.65, 78.3));
            setBothTopPositions(new Position(25.87, 95.25));
        }
    }

    private static class HyruleFieldToGerudoValley extends Exit {
        public HyruleFieldToGerudoValley() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.GERUDO_VALLEY);
            setBothSidePositions(new Position(21.22, 9.17));
            setBothTopPositions(new Position(0.1, 43.29));
        }
    }

    private static class HyruleFieldToMarketEntrance extends Exit {
        public HyruleFieldToMarketEntrance() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.MARKET_ENTRANCE);
            setBothSidePositions(new Position(80.14, 21.03));
            setBothTopPositions(new Position(60.28, 4.4));
        }
    }

    private static class HyruleFieldToKakarikoVillage extends Exit {
        public HyruleFieldToKakarikoVillage() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.KAKARIKO_VILLAGE);
            setBothSidePositions(new Position(95.77, 36.02));
            setBothTopPositions(new Position(84.53, 5.56));
        }
    }

    private static class HyruleFieldToZorasRiver extends Exit {
        public HyruleFieldToZorasRiver() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.ZORAS_RIVER);
            setBothSidePositions(new Position(93.42, 65.77));
            setBothTopPositions(new Position(95.73, 25.35));
        }
    }

    private static class HyruleFieldToLonLonRanch extends Exit {
        public HyruleFieldToLonLonRanch() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.KOKIRI_FOREST);
            setBothSidePositions(new Position(52.41, 33.33));
            setBothTopPositions(new Position(48.61, 38.89));
        }
    }

    private static class HyruleFieldOwlLanding extends Exit {
        public HyruleFieldOwlLanding() {
            super(ExitType.OWL_LANDING);
            intendedAccessibleAsChild(false);
            intendedAccessibleAsAdult(false);
            setOwlLanding(OwlLanding.HYRULE_FIELD);
            setChildSidePosition(new Position(76.63, 29.75));
            setChildTopPosition(new Position(60.39, 12.62));
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
