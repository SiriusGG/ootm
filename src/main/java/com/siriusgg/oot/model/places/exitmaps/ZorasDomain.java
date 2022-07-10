package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.places.*;

public class ZorasDomain extends ExitMap {
    public ZorasDomain() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[37]);
        initMap();
        setDoorEntrancesAmount(1);
        setGrottoEntrancesAmount(1);
        setOverworldTransitionsAmount(3);
        initExits();
        setExit(new ZorasDomainToZoraShop(), 0);
        setExit(new ZorasDomainToStormsGrotto(), 1);
        setExit(new ZorasDomainToZorasRiver(), 2);
        setExit(new ZorasDomainToLakeHylia(), 3);
        setExit(new ZorasDomainToZorasFountain(), 4);
    }

    private static class ZorasDomainToZoraShop extends Exit {
        public ZorasDomainToZoraShop() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.ZD_SHOP);
        }
    }

    private static class ZorasDomainToStormsGrotto extends Exit {
        public ZorasDomainToStormsGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.ZD_STORMS_GROTTO);
        }
    }

    private static class ZorasDomainToZorasRiver extends Exit {
        public ZorasDomainToZorasRiver() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.ZORAS_RIVER);
        }
    }

    private static class ZorasDomainToLakeHylia extends Exit {
        public ZorasDomainToLakeHylia() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(false);
            setOverworld(Overworld.LAKE_HYLIA);
        }
    }

    private static class ZorasDomainToZorasFountain extends Exit {
        public ZorasDomainToZorasFountain() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.ZORAS_FOUNTAIN);
        }
    }
}
