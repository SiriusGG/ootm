package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.PermanentlyLoadedInformation;
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
        }
    }

    private static class KokiriForestToMidosHouse extends Exit {
        public KokiriForestToMidosHouse() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.KF_MIDOS_HOUSE);
        }
    }

    private static class KokiriForestToSariasHouse extends Exit {
        public KokiriForestToSariasHouse() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.KF_SARIAS_HOUSE);
        }
    }

    private static class KokiriForestToHouseOfTwins extends Exit {
        public KokiriForestToHouseOfTwins() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.KF_HOUSE_OF_TWINS);
        }
    }

    private static class KokiriForestToKnowItAllHouse extends Exit {
        public KokiriForestToKnowItAllHouse() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.KF_KNOW_IT_ALL_HOUSE);
        }
    }

    private static class KokiriForestToKokiriShop extends Exit {
        public KokiriForestToKokiriShop() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.KF_KOKIRI_SHOP);
        }
    }

    private static class KokiriForestToInsideTheDekuTree extends Exit {
        public KokiriForestToInsideTheDekuTree() {
            super(ExitType.DUNGEON_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDungeonEntrance(DungeonEntrance.INSIDE_THE_DEKU_TREE);
        }
    }

    private static class KokiriForestToStormsGrotto extends Exit {
        public KokiriForestToStormsGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.KF_STORMS_GROTTO);
        }
    }

    private static class KokiriForestUpperToLostWoodsMain extends Exit {
        public KokiriForestUpperToLostWoodsMain() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.LOST_WOODS);
        }
    }

    private static class KokiriForestMainToLostWoodsBridge extends Exit {
        public KokiriForestMainToLostWoodsBridge() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.LOST_WOODS);
        }
    }
}
