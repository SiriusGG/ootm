package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.places.*;

public class KakarikoVillage extends ExitMap {
    public KakarikoVillage() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[21]);
        initMap();
        setDoorEntrancesAmount(10);
        setDungeonEntrancesAmount(1);
        setGrottoEntrancesAmount(2);
        setOverworldTransitionsAmount(3);
        setHasOwlLanding(true);
        initExits();
        setExit(new KakarikoVillageToCarpenterBossHouse(), 0);
        setExit(new KakarikoVillageToHouseOfSkulltula(), 1);
        setExit(new KakarikoVillageToImpasHouseFront(), 2);
        setExit(new KakarikoVillageToWindmill(), 3);
        setExit(new KakarikoVillageToBazaar(), 4);
        setExit(new KakarikoVillageToShootingGallery(), 5);
        setExit(new KakarikoVillageToPotionShopFront(), 6);
        setExit(new KakarikoVillageToOddMedicineBuilding(), 7);
        setExit(new KakarikoVillageToPotionShopBack(), 8);
        setExit(new KakarikoVillageToImpasHouseBack(), 9);
        setExit(new KakarikoVillageToBottomOfTheWell(), 10);
        setExit(new KakarikoVillageToRedeadGrotto(), 11);
        setExit(new KakarikoVillageToOpenGrotto(), 12);
        setExit(new KakarikoVillageToHyruleField(), 13);
        setExit(new KakarikoVillageToGraveyard(), 14);
        setExit(new KakarikoVillageToDeathMountainTrail(), 15);
        setExit(new KakarikoVillageOwlLanding(), 16);
    }

    private static class KakarikoVillageToCarpenterBossHouse extends Exit {
        public KakarikoVillageToCarpenterBossHouse() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.KAK_CARPENTER_BOSS_HOUSE);
        }
    }

    private static class KakarikoVillageToHouseOfSkulltula extends Exit {
        public KakarikoVillageToHouseOfSkulltula() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.KAK_HOUSE_OF_SKULLTULA);
        }
    }

    private static class KakarikoVillageToImpasHouseFront extends Exit {
        public KakarikoVillageToImpasHouseFront() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.KAK_IMPAS_HOUSE_FRONT);
        }
    }

    private static class KakarikoVillageToWindmill extends Exit {
        public KakarikoVillageToWindmill() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.KAK_WINDMILL);
        }
    }

    private static class KakarikoVillageToBazaar extends Exit {
        public KakarikoVillageToBazaar() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.KAK_BAZAAR);
        }
    }

    private static class KakarikoVillageToShootingGallery extends Exit {
        public KakarikoVillageToShootingGallery() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(false);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.KAK_SHOOTING_GALLERY);
        }
    }

    private static class KakarikoVillageToPotionShopFront extends Exit {
        public KakarikoVillageToPotionShopFront() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.KAK_POTION_SHOP_FRONT);
        }
    }

    private static class KakarikoVillageToOddMedicineBuilding extends Exit {
        public KakarikoVillageToOddMedicineBuilding() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.KAK_ODD_MEDICINE_BUILDING);
        }
    }

    private static class KakarikoVillageToPotionShopBack extends Exit {
        public KakarikoVillageToPotionShopBack() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.KAK_POTION_SHOP_BACK);
        }
    }

    private static class KakarikoVillageToImpasHouseBack extends Exit {
        public KakarikoVillageToImpasHouseBack() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.KAK_IMPAS_HOUSE_BACK);
        }
    }

    private static class KakarikoVillageToBottomOfTheWell extends Exit {
        public KakarikoVillageToBottomOfTheWell() {
            super(ExitType.DUNGEON_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDungeonEntrance(DungeonEntrance.BOTTOM_OF_THE_WELL);
        }
    }

    private static class KakarikoVillageToRedeadGrotto extends Exit {
        public KakarikoVillageToRedeadGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.KAK_REDEAD_GROTTO);
        }
    }

    private static class KakarikoVillageToOpenGrotto extends Exit {
        public KakarikoVillageToOpenGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.KAK_OPEN_GROTTO);
        }
    }

    private static class KakarikoVillageToHyruleField extends Exit {
        public KakarikoVillageToHyruleField() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.HYRULE_FIELD);
        }
    }

    private static class KakarikoVillageToGraveyard extends Exit {
        public KakarikoVillageToGraveyard() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.GRAVEYARD);
        }
    }

    private static class KakarikoVillageToDeathMountainTrail extends Exit {
        public KakarikoVillageToDeathMountainTrail() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.DEATH_MOUNTAIN_TRAIL);
        }
    }

    private static class KakarikoVillageOwlLanding extends Exit {
        public KakarikoVillageOwlLanding() {
            super(ExitType.OWL_LANDING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOwlLanding(OwlLanding.KAKARIKO);
        }
    }
}
