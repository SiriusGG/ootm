package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
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
            setBothSidePositions(new Position(44.61, 55.56));
            setBothTopPositions(new Position(39.06, 45.74));
        }
    }

    private static class ZorasRiverToFairyGrotto extends Exit {
        public ZorasRiverToFairyGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.ZR_FAIRY_GROTTO);
            setBothSidePositions(new Position(41.4, 50.12));
            setBothTopPositions(new Position(43.62, 32.46));
        }
    }

    private static class ZorasRiverToStormsGrotto extends Exit {
        public ZorasRiverToStormsGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.ZR_STORMS_GROTTO);
            setBothSidePositions(new Position(5.28, 76.5));
            setBothTopPositions(new Position(12.3, 38.72));
        }
    }

    private static class ZorasRiverToHyruleField extends Exit {
        public ZorasRiverToHyruleField() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.HYRULE_FIELD);
            setBothSidePositions(new Position(34.63, 92.59));
            setBothTopPositions(new Position(6.97, 89.1));
        }
    }

    private static class ZorasRiverToZorasDomain extends Exit {
        public ZorasRiverToZorasDomain() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.ZORAS_DOMAIN);
            setBothSidePositions(new Position(85.21, 11.92));
            setBothTopPositions(new Position(92.84, 6.02));
        }
    }

    private static class ZorasRiverToLostWoods extends Exit {
        public ZorasRiverToLostWoods() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.LOST_WOODS);
            setBothSidePositions(new Position(91.51, 26.27));
            setBothTopPositions(new Position(89.71, 18.42));
        }
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 40;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 40;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 40;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 40;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
