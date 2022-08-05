package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;

public class ZorasDomain extends ExitMap {
    public ZorasDomain() {
        super();
        setPlace(PlaceWithMap.ZORAS_DOMAIN);
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[37]);
        initMap();
        setDoorEntrancesAmount(1);
        setGrottoEntrancesAmount(1);
        setOverworldTransitionsAmount(3);
        initExits();
        setExit(new ZorasDomainToZoraShop(this), 0);
        setExit(new ZorasDomainToStormsGrotto(this), 1);
        setExit(new ZorasDomainToZorasRiver(this), 2);
        setExit(new ZorasDomainToLakeHylia(this), 3);
        setExit(new ZorasDomainToZorasFountain(this), 4);
    }

    private static class ZorasDomainToZoraShop extends Exit {
        public ZorasDomainToZoraShop(final ExitMap exitMap) {
            super(exitMap, ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.ZD_SHOP);
            setBothSidePositions(new Position(86.87, 68.4));
            setBothTopPositions(new Position(71.88, 84.38));
        }
    }

    private static class ZorasDomainToStormsGrotto extends Exit {
        public ZorasDomainToStormsGrotto(final ExitMap exitMap) {
            super(exitMap, ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.ZD_STORMS_GROTTO);
            setBothSidePositions(new Position(37.31, 74.88));
            setBothTopPositions(new Position(26.28, 64.12));
        }
    }

    private static class ZorasDomainToZorasRiver extends Exit {
        public ZorasDomainToZorasRiver(final ExitMap exitMap) {
            super(exitMap, ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.ZORAS_RIVER);
            setBothSidePositions(new Position(32.24, 81.83));
            setBothTopPositions(new Position(1.28, 79.17));
        }
    }

    private static class ZorasDomainToLakeHylia extends Exit {
        public ZorasDomainToLakeHylia(final ExitMap exitMap) {
            super(exitMap, ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(false);
            setOverworld(Overworld.LAKE_HYLIA);
            setBothSidePositions(new Position(65.77, 73.5));
            setBothTopPositions(new Position(47.59, 71.53));
        }
    }

    private static class ZorasDomainToZorasFountain extends Exit {
        public ZorasDomainToZorasFountain(final ExitMap exitMap) {
            super(exitMap, ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.ZORAS_FOUNTAIN);
            setBothSidePositions(new Position(4.98, 11.11));
            setBothTopPositions(new Position(52.56, 1.5));
        }
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 60;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 60;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 60;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 60;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
