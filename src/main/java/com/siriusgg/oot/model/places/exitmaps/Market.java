package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;

public class Market extends ExitMap {
    public Market() {
        super();
        setPlace(PlaceWithMap.MARKET);
        setName(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[27]);
        initMap();
        setDoorEntrancesAmount(9);
        setOverworldTransitionsAmount(3);
        initExits();
        setExit(new MarketToTreasureChestGame(this), 0);
        setExit(new MarketToBombchuShop(this), 1);
        setExit(new MarketToDogLadyHouse(this), 2);
        setExit(new MarketToManInGreenHouse(this), 3);
        setExit(new MarketToBombchuBowling(this), 4);
        setExit(new MarketToShootingGallery(this), 5);
        setExit(new MarketToMaskShop(this), 6);
        setExit(new MarketToPotionShop(this), 7);
        setExit(new MarketToBazaar(this), 8);
        setExit(new MarketToMarketEntrance(this), 9);
        setExit(new MarketToTempleOfTimeEntrance(this), 10);
        setExit(new MarketToHyruleCastle(this), 11);
    }

    private static class MarketToTreasureChestGame extends Exit {
        public MarketToTreasureChestGame(final ExitMap exitMap) {
            super(exitMap, ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(false);
            setDoorEntrance(DoorEntrance.MARKET_TREASURE_CHEST_GAME);
            setChildSidePosition(new Position(44.92, 71.21));
            setChildTopPosition(new Position(51.61, 80.32));
        }
    }

    private static class MarketToBombchuShop extends Exit {
        public MarketToBombchuShop(final ExitMap exitMap) {
            super(exitMap, ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(false);
            setDoorEntrance(DoorEntrance.MARKET_BOMBCHU_SHOP);
            setChildSidePosition(new Position(14.71, 51.69));
            setChildTopPosition(new Position(26.86, 81.25));
        }
    }

    private static class MarketToManInGreenHouse extends Exit {
        public MarketToManInGreenHouse(final ExitMap exitMap) {
            super(exitMap, ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(false);
            setDoorEntrance(DoorEntrance.MARKET_MAN_IN_GREEN_HOUSE);
            setChildSidePosition(new Position(41.86, 22.47));
            setChildTopPosition(new Position(10.81, 20.14));
        }
    }

    private static class MarketToBombchuBowling extends Exit {
        public MarketToBombchuBowling(final ExitMap exitMap) {
            super(exitMap, ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(false);
            setDoorEntrance(DoorEntrance.MARKET_BOMBCHU_BOWLING);
            setChildSidePosition(new Position(59.11, 60.81));
            setChildTopPosition(new Position(51.92, 51.97));
        }
    }

    private static class MarketToShootingGallery extends Exit {
        public MarketToShootingGallery(final ExitMap exitMap) {
            super(exitMap, ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(false);
            setDoorEntrance(DoorEntrance.MARKET_SHOOTING_GALLERY);
            setChildSidePosition(new Position(77.86, 53.23));
            setChildTopPosition(new Position(58.97, 23.26));
        }
    }

    private static class MarketToMaskShop extends Exit {
        public MarketToMaskShop(final ExitMap exitMap) {
            super(exitMap, ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(false);
            setDoorEntrance(DoorEntrance.MARKET_MASK_SHOP);
            setChildSidePosition(new Position(89.84, 63.62));
            setChildTopPosition(new Position(76.82, 24.07));
        }
    }

    private static class MarketToPotionShop extends Exit {
        public MarketToPotionShop(final ExitMap exitMap) {
            super(exitMap, ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(false);
            setDoorEntrance(DoorEntrance.MARKET_POTION_SHOP);
            setChildSidePosition(new Position(84.57, 75.84));
            setChildTopPosition(new Position(83.32, 46.06));
        }
    }

    private static class MarketToBazaar extends Exit {
        public MarketToBazaar(final ExitMap exitMap) {
            super(exitMap, ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(false);
            setDoorEntrance(DoorEntrance.MARKET_BAZAAR);
            setChildSidePosition(new Position(77.15, 81.18));
            setChildTopPosition(new Position(82.62, 62.73));
        }
    }

    private static class MarketToMarketEntrance extends Exit {
        public MarketToMarketEntrance(final ExitMap exitMap) {
            super(exitMap, ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.MARKET_ENTRANCE);
            setChildSidePosition(new Position(48.37, 86.52));
            setChildTopPosition(new Position(66.63, 93.75));
            setAdultSidePosition(new Position(13.48, 85.24));
            setAdultTopPosition(new Position(40.31, 93.63));
        }
    }

    private static class MarketToTempleOfTimeEntrance extends Exit {
        public MarketToTempleOfTimeEntrance(final ExitMap exitMap) {
            super(exitMap, ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.TEMPLE_OF_TIME_ENTRANCE);
            setChildSidePosition(new Position(96.55, 75.84));
            setChildTopPosition(new Position(95.54, 28.36));
            setAdultSidePosition(new Position(95.05, 69.24));
            setAdultTopPosition(new Position(92.02, 27.89));
        }
    }

    private static class MarketToHyruleCastle extends Exit {
        public MarketToHyruleCastle(final ExitMap exitMap) {
            super(exitMap, ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.HYRULE_CASTLE);
            setChildSidePosition(new Position(91.93, 53.51));
            setChildTopPosition(new Position(66.64, 8.1));
            setAdultSidePosition(new Position(78.06, 25.13));
            setAdultTopPosition(new Position(40.31, 7.87));
        }
    }

    private static class MarketToDogLadyHouse extends Exit {
        public MarketToDogLadyHouse(final ExitMap exitMap) {
            super(exitMap, ExitType.UNCHANGING);
            setDestinationString("Market Dog Lady House");
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(false);
            setUnchangingTransition(UnchangingTransition.MARKET_DOG_LADY_HOUSE_IN);
            setChildSidePosition(new Position(11.13, 47.75));
            setChildTopPosition(new Position(20.13, 80.21));
        }
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 50;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 50;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 50;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 50;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
