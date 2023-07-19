package com.siriusgg.oot.model.places;

import com.siriusgg.oot.constants.OoTMConstants;
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
        String symbolDir = OoTMConstants.SYMBOL_DIRECTORY + "/";
        switch (this) {
            case DOOR:
                return symbolDir + "door" + OoTMConstants.SYMBOL_EXTENSION;
            case DUNGEON:
                return symbolDir + "dungeon" + OoTMConstants.SYMBOL_EXTENSION;
            case GROTTO:
                return symbolDir + "grotto" + OoTMConstants.SYMBOL_EXTENSION;
            case OVERWORLD:
                return symbolDir + "overworld" + OoTMConstants.SYMBOL_EXTENSION;
            case OWL:
                return symbolDir + "owl" + OoTMConstants.SYMBOL_EXTENSION;
            case UNCHANGING:
                return symbolDir + "unchanging" + OoTMConstants.SYMBOL_EXTENSION;
            case WARP:
                return symbolDir + "warp" + OoTMConstants.SYMBOL_EXTENSION;
            default:
                throw new UnknownTransitionGraphicException(this);
        }
    }
}
