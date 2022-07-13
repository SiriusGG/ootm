package com.siriusgg.oot.model.places;

import com.siriusgg.oot.exception.UnknownTransitionGraphicException;
import com.siriusgg.oot.model.BuildData;
import com.siriusgg.oot.model.util.FileFunctions;

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
                return FileFunctions.getInstance().getFilePathFromResource(symbolDir + "door" + BuildData.SYMBOL_EXTENSION);
            case DUNGEON:
                return FileFunctions.getInstance().getFilePathFromResource(symbolDir + "dungeon" + BuildData.SYMBOL_EXTENSION);
            case GROTTO:
                return FileFunctions.getInstance().getFilePathFromResource(symbolDir + "grotto" + BuildData.SYMBOL_EXTENSION);
            case OVERWORLD:
                return FileFunctions.getInstance().getFilePathFromResource(symbolDir + "overworld" + BuildData.SYMBOL_EXTENSION);
            case OWL:
                return FileFunctions.getInstance().getFilePathFromResource(symbolDir + "owl" + BuildData.SYMBOL_EXTENSION);
            default:
                throw new UnknownTransitionGraphicException(this);
        }
    }
}
