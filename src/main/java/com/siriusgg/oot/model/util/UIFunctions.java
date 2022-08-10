package com.siriusgg.oot.model.util;

import com.siriusgg.oot.exception.*;
import com.siriusgg.oot.model.places.*;

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

    public static int getSafeListWidth(final Exit exit) {
        int newListWidth;
        try {
            newListWidth = UIFunctions.getBoxWidth(exit);
        } catch (final UnknownExitTypeException | UnhandledExitTypeException e) {
            System.err.println("Could not determine width of list in BidirectionalTransitionDialog. Using 245.");
            newListWidth = 245;
        }
        return newListWidth;
    }
}
