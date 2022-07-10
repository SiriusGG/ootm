package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.places.*;

public class ZorasRiver extends ExitMap {
    public ZorasRiver() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[39]);
        initMap();
        setGrottoEntrancesAmount(3);
        setOverworldTransitionsAmount(3);
        initExits();
        setExit(new ZorasRiverToOpenGrotto(), 0);
        setExit(new ZorasRiverToFairyGrotto(), 1);
        setExit(new ZorasRiverToStormsGrotto(), 2);
        setExit(new ZorasRiverToHyruleField(), 3);
        setExit(new ZorasRiverToZorasDomain(), 4);
        setExit(new ZorasRiverToLostWoods(), 5);
    }

    private static class ZorasRiverToOpenGrotto extends Exit {
        public ZorasRiverToOpenGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.ZR_OPEN_GROTTO);
        }
    }

    private static class ZorasRiverToFairyGrotto extends Exit {
        public ZorasRiverToFairyGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.ZR_FAIRY_GROTTO);
        }
    }

    private static class ZorasRiverToStormsGrotto extends Exit {
        public ZorasRiverToStormsGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.ZR_STORMS_GROTTO);
        }
    }

    private static class ZorasRiverToHyruleField extends Exit {
        public ZorasRiverToHyruleField() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.HYRULE_FIELD);
        }
    }

    private static class ZorasRiverToZorasDomain extends Exit {
        public ZorasRiverToZorasDomain() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.ZORAS_DOMAIN);
        }
    }

    private static class ZorasRiverToLostWoods extends Exit {
        public ZorasRiverToLostWoods() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.LOST_WOODS);
        }
    }
}
