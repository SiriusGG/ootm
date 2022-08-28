package com.siriusgg.oot.model.places;

import com.siriusgg.oot.Constants;
import com.siriusgg.oot.exception.UnknownTransitionGraphicException;

public enum TransitionGraphic {
    DOOR,
    DUNGEON,
    GROTTO,
    OVERWORLD,
    OWL,
    UNCHANGING,
    WARP;

    public String getTransitionGraphicPath() throws UnknownTransitionGraphicException {
        String symbolDir = Constants.SYMBOL_DIRECTORY + "/";
        switch (this) {
            case DOOR:
                return symbolDir + "door" + Constants.SYMBOL_EXTENSION;
            case DUNGEON:
                return symbolDir + "dungeon" + Constants.SYMBOL_EXTENSION;
            case GROTTO:
                return symbolDir + "grotto" + Constants.SYMBOL_EXTENSION;
            case OVERWORLD:
                return symbolDir + "overworld" + Constants.SYMBOL_EXTENSION;
            case OWL:
                return symbolDir + "owl" + Constants.SYMBOL_EXTENSION;
            case UNCHANGING:
                return symbolDir + "unchanging" + Constants.SYMBOL_EXTENSION;
            case WARP:
                return symbolDir + "warp" + Constants.SYMBOL_EXTENSION;
            default:
                throw new UnknownTransitionGraphicException(this);
        }
    }
}
