package com.siriusgg.oot.model.places;

import com.siriusgg.oot.exception.UnknownPerspectiveException;

public enum Perspective {
    SIDE,
    TOP;

    public static String getPerspectiveString(final Perspective perspective) throws UnknownPerspectiveException {
        if (perspective == Perspective.SIDE) {
            return "Side";
        } else if (perspective == Perspective.TOP) {
            return "Top";
        } else {
            throw new UnknownPerspectiveException(perspective);
        }
    }
}
