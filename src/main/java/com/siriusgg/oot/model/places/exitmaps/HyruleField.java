package com.siriusgg.oot.model.places.exitmaps;

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
        }
    }

    private static class HyruleFieldToHFOpenGrotto extends Exit {
        public HyruleFieldToHFOpenGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.HF_OPEN_GROTTO);
        }
    }

    private static class HyruleFieldToHFInsideFenceGrotto extends Exit {
        public HyruleFieldToHFInsideFenceGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.HF_INSIDE_FENCE_GROTTO);
        }
    }

    private static class HyruleFieldToHFCowGrotto extends Exit {
        public HyruleFieldToHFCowGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.HF_COW_GROTTO);
        }
    }

    private static class HyruleFieldToHFNearMarketGrotto extends Exit {
        public HyruleFieldToHFNearMarketGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.HF_NEAR_MARKET_GROTTO);
        }
    }

    private static class HyruleFieldToHFFairyGrotto extends Exit {
        public HyruleFieldToHFFairyGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.HF_FAIRY_GROTTO);
        }
    }

    private static class HyruleFieldToHFNearKakGrotto extends Exit {
        public HyruleFieldToHFNearKakGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.HF_NEAR_KAK_GROTTO);
        }
    }

    private static class HyruleFieldToHFTektikeGrotto extends Exit {
        public HyruleFieldToHFTektikeGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.HF_TEKTITE_GROTTO);
        }
    }

    private static class HyruleFieldToKokiriForest extends Exit {
        public HyruleFieldToKokiriForest() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.KOKIRI_FOREST);
        }
    }

    private static class HyruleFieldToLakeHylia extends Exit {
        public HyruleFieldToLakeHylia() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.LAKE_HYLIA);
        }
    }

    private static class HyruleFieldToGerudoValley extends Exit {
        public HyruleFieldToGerudoValley() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.GERUDO_VALLEY);
        }
    }

    private static class HyruleFieldToMarketEntrance extends Exit {
        public HyruleFieldToMarketEntrance() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.MARKET_ENTRANCE);
        }
    }

    private static class HyruleFieldToKakarikoVillage extends Exit {
        public HyruleFieldToKakarikoVillage() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.KAKARIKO_VILLAGE);
        }
    }

    private static class HyruleFieldToZorasRiver extends Exit {
        public HyruleFieldToZorasRiver() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.ZORAS_RIVER);
        }
    }

    private static class HyruleFieldToLonLonRanch extends Exit {
        public HyruleFieldToLonLonRanch() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.KOKIRI_FOREST);
        }
    }

    private static class HyruleFieldOwlLanding extends Exit {
        public HyruleFieldOwlLanding() {
            super(ExitType.OWL_LANDING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOwlLanding(OwlLanding.HYRULE_FIELD);
        }
    }
}
