package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;

public class KokiriForest extends ExitMap {
    public KokiriForest() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[22]);
        initMap();
        setDoorEntrancesAmount(6);
        setDungeonEntrancesAmount(1);
        setGrottoEntrancesAmount(1);
        setOverworldTransitionsAmount(2);
        initExits();
        setExit(new KokiriForestToLinksHouse(), 0);
        setExit(new KokiriForestToMidosHouse(), 1);
        setExit(new KokiriForestToSariasHouse(), 2);
        setExit(new KokiriForestToHouseOfTwins(), 3);
        setExit(new KokiriForestToKnowItAllHouse(), 4);
        setExit(new KokiriForestToKokiriShop(), 5);
        setExit(new KokiriForestToInsideTheDekuTree(), 6);
        setExit(new KokiriForestToStormsGrotto(), 7);
        setExit(new KokiriForestUpperToLostWoodsMain(), 8);
        setExit(new KokiriForestMainToLostWoodsBridge(), 9);
    }

    private static class KokiriForestToLinksHouse extends Exit {
        public KokiriForestToLinksHouse() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.KF_LINKS_HOUSE);
            setBothSidePositions(new Position(12.57, 47.76));
            setBothTopPositions(new Position(25.56, 70.72));
        }
    }

    private static class KokiriForestToMidosHouse extends Exit {
        public KokiriForestToMidosHouse() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.KF_MIDOS_HOUSE);
            setBothSidePositions(new Position(24.5, 26.23));
            setBothTopPositions(new Position(20.3, 37.73));
        }
    }

    private static class KokiriForestToSariasHouse extends Exit {
        public KokiriForestToSariasHouse() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.KF_SARIAS_HOUSE);
            setBothSidePositions(new Position(22.54, 49.25));
            setBothTopPositions(new Position(33.08, 62.15));
        }
    }

    private static class KokiriForestToHouseOfTwins extends Exit {
        public KokiriForestToHouseOfTwins() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.KF_HOUSE_OF_TWINS);
            setBothSidePositions(new Position(28.34, 54.37));
            setBothTopPositions(new Position(40.23, 60.19));
        }
    }

    private static class KokiriForestToKnowItAllHouse extends Exit {
        public KokiriForestToKnowItAllHouse() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.KF_KNOW_IT_ALL_HOUSE);
            setBothSidePositions(new Position(9.9, 23.88));
            setBothTopPositions(new Position(11.95, 55.67));
        }
    }

    private static class KokiriForestToKokiriShop extends Exit {
        public KokiriForestToKokiriShop() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.KF_KOKIRI_SHOP);
            setBothSidePositions(new Position(35.11, 43.5));
            setBothTopPositions(new Position(36.99, 41.32));
        }
    }

    private static class KokiriForestToInsideTheDekuTree extends Exit {
        public KokiriForestToInsideTheDekuTree() {
            super(ExitType.DUNGEON_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDungeonEntrance(DungeonEntrance.INSIDE_THE_DEKU_TREE);
            setBothSidePositions(new Position(72.51, 69.94));
            setBothTopPositions(new Position(77.14, 24.42));
        }
    }

    private static class KokiriForestToStormsGrotto extends Exit {
        public KokiriForestToStormsGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.KF_STORMS_GROTTO);
            setBothSidePositions(new Position(30.23, 4.48));
            setBothTopPositions(new Position(19.62, 23.84));
        }
    }

    private static class KokiriForestUpperToLostWoodsMain extends Exit {
        public KokiriForestUpperToLostWoodsMain() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.LOST_WOODS);
            setBothSidePositions(new Position(34.46, 2.35));
            setBothTopPositions(new Position(22.11, 20.25));
        }
    }

    private static class KokiriForestMainToLostWoodsBridge extends Exit {
        public KokiriForestMainToLostWoodsBridge() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.LOST_WOODS);
            setBothSidePositions(new Position(12.38, 19.83));
            setBothTopPositions(new Position(4.81, 42.01));
        }
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 54;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 54;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 54;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 54;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
