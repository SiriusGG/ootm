package com.siriusgg.oot.model.places;

import com.siriusgg.oot.exception.UnknownExitTypeException;

public enum ExitType {
    DOOR_ENTRANCE,
    DOOR_EXIT,
    DUNGEON_ENTRANCE,
    DUNGEON_EXIT,
    GROTTO_ENTRANCE,
    GROTTO_EXIT,
    OVERWORLD,
    OWL_START,
    OWL_LANDING,
    UNCHANGING,
    WARP;

    public static String getExitTypeString(final ExitType exitType) throws UnknownExitTypeException {
        switch (exitType) {
            case DOOR_ENTRANCE: return "Door Entrance";
            case DOOR_EXIT: return "Door Exit";
            case DUNGEON_ENTRANCE: return "Dungeon Entrance";
            case DUNGEON_EXIT: return "Dungeon Exit";
            case GROTTO_ENTRANCE: return "Grotto Entrance";
            case GROTTO_EXIT: return "Grotto Exit";
            case OVERWORLD: return "Overworld";
            case OWL_START: return "Owl Start";
            case OWL_LANDING: return "Owl Landing";
            case UNCHANGING: return "Unchanging";
            case WARP: return "Warp";
            default: throw new UnknownExitTypeException(exitType);
        }
    }

    public static ExitType invert(final ExitType exitType) throws UnknownExitTypeException {
        switch (exitType) {
            case DOOR_ENTRANCE: return DOOR_EXIT;
            case DOOR_EXIT: return DOOR_ENTRANCE;
            case DUNGEON_ENTRANCE: return DUNGEON_EXIT;
            case DUNGEON_EXIT: return DUNGEON_ENTRANCE;
            case GROTTO_ENTRANCE: return GROTTO_EXIT;
            case GROTTO_EXIT: return GROTTO_ENTRANCE;
            case OVERWORLD: return OVERWORLD;
            case OWL_START: return OWL_LANDING;
            case OWL_LANDING: return OWL_START;
            case UNCHANGING: return UNCHANGING;
            case WARP: return WARP;
            default: throw new UnknownExitTypeException(exitType);
        }
    }
}
