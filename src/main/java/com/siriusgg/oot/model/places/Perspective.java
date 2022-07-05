package com.siriusgg.oot.model.places;

import com.siriusgg.oot.exception.UnknownPerspectiveException;

public enum Perspective {
    SIDE,
    TOP;

    public static String getPerspectiveString(final Perspective perspective) throws UnknownPerspectiveException {
        if (perspective == Perspective.SIDE) {
            return "side";
        } else if (perspective == Perspective.TOP) {
            return "top";
        } else {
            throw new UnknownPerspectiveException(perspective);
        }
    }
}
