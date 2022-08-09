package com.siriusgg.oot.model.util;

import com.siriusgg.oot.exception.UnhandledExitTypeException;
import com.siriusgg.oot.exception.UnknownExitTypeException;
import com.siriusgg.oot.model.places.Exit;
import com.siriusgg.oot.model.places.ExitType;

public class UIFunctions {
    public static int getBoxWidth(final Exit exit) throws UnknownExitTypeException, UnhandledExitTypeException {
        ExitType exitType = exit.getExitType();
        switch (exitType) {
            case DOOR_ENTRANCE:
            case DOOR_EXIT:
                return 220;
            case DUNGEON_ENTRANCE:
            case DUNGEON_EXIT:
                return 165;
            case GROTTO_ENTRANCE:
            case GROTTO_EXIT:
                return 245;
            case OVERWORLD:
            case OWL_START:
                return 170;
            case OWL_LANDING:
            case UNCHANGING:
            case WARP:
                throw new UnhandledExitTypeException(exitType);
            default:
                throw new UnknownExitTypeException(exitType);
        }
    }
}
