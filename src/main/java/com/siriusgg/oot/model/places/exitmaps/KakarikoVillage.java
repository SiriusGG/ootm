package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;

public class KakarikoVillage extends ExitMap {
    public KakarikoVillage() {
        super();
        setPlace(PlaceWithMap.KAKARIKO_VILLAGE);
        setName(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[21]);
        initMap();
        setDoorEntrancesAmount(10);
        setDungeonEntrancesAmount(1);
        setGrottoEntrancesAmount(2);
        setOverworldTransitionsAmount(3);
        setHasOwlLanding(true);
        initExits();
        setExit(new KakarikoVillageToCarpenterBossHouse(this), 0);
        setExit(new KakarikoVillageToHouseOfSkulltula(this), 1);
        setExit(new KakarikoVillageToImpasHouseFront(this), 2);
        setExit(new KakarikoVillageToWindmill(this), 3);
        setExit(new KakarikoVillageToBazaar(this), 4);
        setExit(new KakarikoVillageToShootingGallery(this), 5);
        setExit(new KakarikoVillageToPotionShopFront(this), 6);
        setExit(new KakarikoVillageToOddMedicineBuilding(this), 7);
        setExit(new KakarikoVillageToPotionShopBack(this), 8);
        setExit(new KakarikoVillageToImpasHouseBack(this), 9);
        setExit(new KakarikoVillageToBottomOfTheWell(this), 10);
        setExit(new KakarikoVillageToRedeadGrotto(this), 11);
        setExit(new KakarikoVillageToOpenGrotto(this), 12);
        setExit(new KakarikoVillageToHyruleField(this), 13);
        setExit(new KakarikoVillageToGraveyard(this), 14);
        setExit(new KakarikoVillageToDeathMountainTrail(this), 15);
        setExit(new KakarikoVillageOwlLanding(this), 16);
    }

    private static class KakarikoVillageToCarpenterBossHouse extends Exit {
        public KakarikoVillageToCarpenterBossHouse(final ExitMap exitMap) {
            super(exitMap, ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.KAK_CARPENTER_BOSS_HOUSE);
            setBothSidePositions(new Position(46.84, 42.06));
            setBothTopPositions(new Position(60.82, 57.59));
        }
    }

    private static class KakarikoVillageToHouseOfSkulltula extends Exit {
        public KakarikoVillageToHouseOfSkulltula(final ExitMap exitMap) {
            super(exitMap, ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.KAK_HOUSE_OF_SKULLTULA);
            setBothSidePositions(new Position(53.52, 45.31));
            setBothTopPositions(new Position(56.52, 76.13));
        }
    }

    private static class KakarikoVillageToImpasHouseFront extends Exit {
        public KakarikoVillageToImpasHouseFront(final ExitMap exitMap) {
            super(exitMap, ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.KAK_IMPAS_HOUSE_FRONT);
            setBothSidePositions(new Position(61.89, 46.93));
            setBothTopPositions(new Position(56.31, 92.24));
        }
    }

    private static class KakarikoVillageToWindmill extends Exit {
        public KakarikoVillageToWindmill(final ExitMap exitMap) {
            super(exitMap, ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.KAK_WINDMILL);
            setBothSidePositions(new Position(66.79, 29.78));
            setBothTopPositions(new Position(77.68, 65.12));
        }
    }

    private static class KakarikoVillageToBazaar extends Exit {
        public KakarikoVillageToBazaar(final ExitMap exitMap) {
            super(exitMap, ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(false);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.KAK_BAZAAR);
            setBothSidePositions(new Position(34.19, 30.82));
            setBothTopPositions(new Position(57.82, 37.31));
        }
    }

    private static class KakarikoVillageToShootingGallery extends Exit {
        public KakarikoVillageToShootingGallery(final ExitMap exitMap) {
            super(exitMap, ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(false);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.KAK_SHOOTING_GALLERY);
            setBothSidePositions(new Position(56.9, 40.09));
            setBothTopPositions(new Position(64.64, 70.68));
        }
    }

    private static class KakarikoVillageToPotionShopFront extends Exit {
        public KakarikoVillageToPotionShopFront(final ExitMap exitMap) {
            super(exitMap, ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.KAK_POTION_SHOP_FRONT);
            setBothSidePositions(new Position(38.65, 29.2));
            setBothTopPositions(new Position(62.66, 39.17));
        }
    }

    private static class KakarikoVillageToOddMedicineBuilding extends Exit {
        public KakarikoVillageToOddMedicineBuilding(final ExitMap exitMap) {
            super(exitMap, ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.KAK_ODD_MEDICINE_BUILDING);
            setBothSidePositions(new Position(56.99, 31.4));
            setBothTopPositions(new Position(71.4, 53.07));
        }
    }

    private static class KakarikoVillageToPotionShopBack extends Exit {
        public KakarikoVillageToPotionShopBack(final ExitMap exitMap) {
            super(exitMap, ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.KAK_POTION_SHOP_BACK);
            setBothSidePositions(new Position(45.5, 27.11));
            setBothTopPositions(new Position(68.94, 38.01));
        }
    }

    private static class KakarikoVillageToImpasHouseBack extends Exit {
        public KakarikoVillageToImpasHouseBack(final ExitMap exitMap) {
            super(exitMap, ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.KAK_IMPAS_HOUSE_BACK);
            setBothSidePositions(new Position(69.28, 42.41));
            setBothTopPositions(new Position(63.89, 92.35));
        }
    }

    private static class KakarikoVillageToBottomOfTheWell extends Exit {
        public KakarikoVillageToBottomOfTheWell(final ExitMap exitMap) {
            super(exitMap, ExitType.DUNGEON_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDungeonEntrance(DungeonEntrance.BOTTOM_OF_THE_WELL);
            setBothSidePositions(new Position(61.18, 36.73));
            setBothTopPositions(new Position(71.4, 64.43));
        }
    }

    private static class KakarikoVillageToRedeadGrotto extends Exit {
        public KakarikoVillageToRedeadGrotto(final ExitMap exitMap) {
            super(exitMap, ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.KAK_REDEAD_GROTTO);
            setBothSidePositions(new Position(43.1, 45.08));
            setBothTopPositions(new Position(55.77, 61.3));
        }
    }

    private static class KakarikoVillageToOpenGrotto extends Exit {
        public KakarikoVillageToOpenGrotto(final ExitMap exitMap) {
            super(exitMap, ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.KAK_OPEN_GROTTO);
            setBothSidePositions(new Position(52.18, 29.43));
            setBothTopPositions(new Position(73.11, 45.77));
        }
    }

    private static class KakarikoVillageToHyruleField extends Exit {
        public KakarikoVillageToHyruleField(final ExitMap exitMap) {
            super(exitMap, ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.HYRULE_FIELD);
            setBothSidePositions(new Position(7.3, 86.33));
            setBothTopPositions(new Position(2.39, 85.52));
        }
    }

    private static class KakarikoVillageToGraveyard extends Exit {
        public KakarikoVillageToGraveyard(final ExitMap exitMap) {
            super(exitMap, ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.GRAVEYARD);
            setBothSidePositions(new Position(93.77, 30.24));
            setBothTopPositions(new Position(94.95, 81.58));
        }
    }

    private static class KakarikoVillageToDeathMountainTrail extends Exit {
        public KakarikoVillageToDeathMountainTrail(final ExitMap exitMap) {
            super(exitMap, ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.DEATH_MOUNTAIN_TRAIL);
            setBothSidePositions(new Position(9.53, 19.0));
            setBothTopPositions(new Position(55.7, 3.48));
        }
    }

    private static class KakarikoVillageOwlLanding extends Exit {
        public KakarikoVillageOwlLanding(final ExitMap exitMap) {
            super(exitMap, ExitType.OWL_LANDING);
            intendedAccessibleAsChild(false);
            intendedAccessibleAsAdult(false);
            setOwlLanding(OwlLanding.KAKARIKO);
            setChildSidePosition(new Position(65.89, 40.44));
            setChildTopPosition(new Position(60.2, 92.24));
        }
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 48;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 60;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 48;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 60;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
