package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.PermanentlyLoadedInformation;
import com.siriusgg.oot.model.places.*;

public class Graveyard extends ExitMap {
    public Graveyard() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[12]);
        initMap();
        setDoorEntrancesAmount(1);
        setDungeonEntrancesAmount(1);
        setGrottoEntrancesAmount(4);
        setOverworldTransitionsAmount(1);
        initExits();
        setExit(new GraveyardToDampesHouse(), 0);
        setExit(new GraveyardToShadowTemple(), 1);
        setExit(new GraveyardToShieldGrave(), 2);
        setExit(new GraveyardToHeartPieceGrave(), 3);
        setExit(new GraveyardToRoyalFamilyTomb(), 4);
        setExit(new GraveyardToDampesGrave(), 5);
        setExit(new GraveyardToKakarikoVillage(), 6);
    }

    private static class GraveyardToDampesHouse extends Exit {
        public GraveyardToDampesHouse() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.GRAVEYARD_DAMPES_HOUSE);
        }
    }

    private static class GraveyardToShadowTemple extends Exit {
        public GraveyardToShadowTemple() {
            super(ExitType.DUNGEON_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDungeonEntrance(DungeonEntrance.SHADOW_TEMPLE);
        }
    }

    private static class GraveyardToShieldGrave extends Exit {
        public GraveyardToShieldGrave() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.GRAVEYARD_SHIELD_GRAVE);
        }
    }

    private static class GraveyardToHeartPieceGrave extends Exit {
        public GraveyardToHeartPieceGrave() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.GRAVEYARD_HEART_PIECE_GRAVE);
        }
    }

    private static class GraveyardToRoyalFamilyTomb extends Exit {
        public GraveyardToRoyalFamilyTomb() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.GRAVEYARD_ROYAL_FAMILYS_TOMB);
        }
    }

    private static class GraveyardToDampesGrave extends Exit {
        public GraveyardToDampesGrave() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.DAMPES_GRAVE);
        }
    }

    private static class GraveyardToKakarikoVillage extends Exit {
        public GraveyardToKakarikoVillage() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.KAKARIKO_VILLAGE);
        }
    }
}
