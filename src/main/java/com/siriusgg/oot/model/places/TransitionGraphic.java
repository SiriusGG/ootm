package com.siriusgg.oot.model.places;

import com.siriusgg.oot.exception.UnknownTransitionGraphicException;
import com.siriusgg.oot.model.BuildData;

public enum TransitionGraphic {
    DOOR,
    DUNGEON,
    GROTTO,
    OVERWORLD,
    OWL;

    public String getTransitionGraphicPath() throws UnknownTransitionGraphicException {
        String symbolDir = BuildData.SYMBOL_DIRECTORY + "/";
        switch (this) {
            case DOOR:
                return symbolDir + "door" + BuildData.SYMBOL_EXTENSION;
            case DUNGEON:
                return symbolDir + "dungeon" + BuildData.SYMBOL_EXTENSION;
            case GROTTO:
                return symbolDir + "grotto" + BuildData.SYMBOL_EXTENSION;
            case OVERWORLD:
                return symbolDir + "overworld" + BuildData.SYMBOL_EXTENSION;
            case OWL:
                return symbolDir + "owl" + BuildData.SYMBOL_EXTENSION;
            default:
                throw new UnknownTransitionGraphicException(this);
        }
    }
}
