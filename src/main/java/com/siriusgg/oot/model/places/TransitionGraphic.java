package com.siriusgg.oot.model.places;

import com.siriusgg.oot.exception.UnknownTransitionGraphicException;
import com.siriusgg.oot.Constants;

public enum TransitionGraphic {
    DOOR,
    DUNGEON,
    GROTTO,
    OVERWORLD,
    OWL,
    UNCHANGING;

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
            default:
                throw new UnknownTransitionGraphicException(this);
        }
    }
}
