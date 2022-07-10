package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.places.*;

public class Market extends ExitMap {
    public Market() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[27]);
        initMap();
        setDoorEntrancesAmount(9);
        setOverworldTransitionsAmount(3);
        initExits();
        setExit(new MarketToTreasureChestGame(), 0);
        setExit(new MarketToBombchuShop(), 1);
        setExit(new MarketToDogLadyHouse(), 2);
        setExit(new MarketToManInGreenHouse(), 3);
        setExit(new MarketToBombchuBowling(), 4);
        setExit(new MarketToShootingGallery(), 5);
        setExit(new MarketToMaskShop(), 6);
        setExit(new MarketToPotionShop(), 7);
        setExit(new MarketToBazaar(), 8);
        setExit(new MarketToMarketEntrance(), 9);
        setExit(new MarketToToTEntrance(), 10);
        setExit(new MarketToHyruleCastle(), 11);
    }

    private static class MarketToTreasureChestGame extends Exit {
        public MarketToTreasureChestGame() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(false);
            setDoorEntrance(DoorEntrance.MARKET_TREASURE_CHEST_GAME);
        }
    }

    private static class MarketToBombchuShop extends Exit {
        public MarketToBombchuShop() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(false);
            setDoorEntrance(DoorEntrance.MARKET_BOMBCHU_SHOP);
        }
    }

    private static class MarketToDogLadyHouse extends Exit {
        public MarketToDogLadyHouse() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(false);
            setDoorEntrance(DoorEntrance.MARKET_DOG_LADY_HOUSE);
        }
    }

    private static class MarketToManInGreenHouse extends Exit {
        public MarketToManInGreenHouse() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(false);
            setDoorEntrance(DoorEntrance.MARKET_MAN_IN_GREEN_HOUSE);
        }
    }

    private static class MarketToBombchuBowling extends Exit {
        public MarketToBombchuBowling() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(false);
            setDoorEntrance(DoorEntrance.MARKET_BOMBCHU_BOWLING);
        }
    }

    private static class MarketToShootingGallery extends Exit {
        public MarketToShootingGallery() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(false);
            setDoorEntrance(DoorEntrance.MARKET_SHOOTING_GALLERY);
        }
    }

    private static class MarketToMaskShop extends Exit {
        public MarketToMaskShop() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(false);
            setDoorEntrance(DoorEntrance.MARKET_MASK_SHOP);
        }
    }

    private static class MarketToPotionShop extends Exit {
        public MarketToPotionShop() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(false);
            setDoorEntrance(DoorEntrance.MARKET_POTION_SHOP);
        }
    }

    private static class MarketToBazaar extends Exit {
        public MarketToBazaar() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(false);
            setDoorEntrance(DoorEntrance.MARKET_BAZAAR);
        }
    }

    private static class MarketToMarketEntrance extends Exit {
        public MarketToMarketEntrance() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.MARKET_ENTRANCE);
        }
    }

    private static class MarketToToTEntrance extends Exit {
        public MarketToToTEntrance() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.TOT_ENTRANCE);
        }
    }

    private static class MarketToHyruleCastle extends Exit {
        public MarketToHyruleCastle() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.HYRULE_CASTLE);
        }
    }
}
