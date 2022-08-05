package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;

public class Graveyard extends ExitMap {
    public Graveyard() {
        super();
        setPlace(PlaceWithMap.GRAVEYARD);
        setName(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[12]);
        initMap();
        setDoorEntrancesAmount(1);
        setDungeonEntrancesAmount(1);
        setGrottoEntrancesAmount(4);
        setOverworldTransitionsAmount(1);
        initExits();
        setExit(new GraveyardToDampesHouse(this), 0);
        setExit(new GraveyardToShadowTemple(this), 1);
        setExit(new GraveyardToShieldGrave(this), 2);
        setExit(new GraveyardToHeartPieceGrave(this), 3);
        setExit(new GraveyardToRoyalFamilyTomb(this), 4);
        setExit(new GraveyardToDampesGrave(this), 5);
        setExit(new GraveyardToKakarikoVillage(this), 6);
    }

    private static class GraveyardToDampesHouse extends Exit {
        public GraveyardToDampesHouse(final ExitMap exitMap) {
            super(exitMap, ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.GRAVEYARD_DAMPES_HOUSE);
            setBothSidePositions(new Position(26.56, 74.68));
            setBothTopPositions(new Position(21.03, 80.16));
        }
    }

    private static class GraveyardToShadowTemple extends Exit {
        public GraveyardToShadowTemple(final ExitMap exitMap) {
            super(exitMap, ExitType.DUNGEON_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDungeonEntrance(DungeonEntrance.SHADOW_TEMPLE);
            setBothSidePositions(new Position(92.9, 10.38));
            setBothTopPositions(new Position(92.12, 43.12));
        }
    }

    private static class GraveyardToShieldGrave extends Exit {
        public GraveyardToShieldGrave(final ExitMap exitMap) {
            super(exitMap, ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.GRAVEYARD_SHIELD_GRAVE);
            setBothSidePositions(new Position(26.95, 63.73));
            setBothTopPositions(new Position(28.71, 50.26));
        }
    }

    private static class GraveyardToHeartPieceGrave extends Exit {
        public GraveyardToHeartPieceGrave(final ExitMap exitMap) {
            super(exitMap, ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.GRAVEYARD_HEART_PIECE_GRAVE);
            setBothSidePositions(new Position(38.61, 56.19));
            setBothTopPositions(new Position(37.43, 61.38));
        }
    }

    private static class GraveyardToRoyalFamilyTomb extends Exit {
        public GraveyardToRoyalFamilyTomb(final ExitMap exitMap) {
            super(exitMap, ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.GRAVEYARD_ROYAL_FAMILYS_TOMB);
            setBothSidePositions(new Position(44.73, 41.82));
            setBothTopPositions(new Position(47.92, 43.65));
        }
    }

    private static class GraveyardToDampesGrave extends Exit {
        public GraveyardToDampesGrave(final ExitMap exitMap) {
            super(exitMap, ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(false);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.DAMPES_GRAVE);
            setBothSidePositions(new Position(13.93, 57.18));
            setBothTopPositions(new Position(24.74, 14.29));
        }
    }

    private static class GraveyardToKakarikoVillage extends Exit {
        public GraveyardToKakarikoVillage(final ExitMap exitMap) {
            super(exitMap, ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.KAKARIKO_VILLAGE);
            setBothSidePositions(new Position(2.8, 90.61));
            setBothTopPositions(new Position(0.72, 71.96));
        }
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 34;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 30;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 34;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 30;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
