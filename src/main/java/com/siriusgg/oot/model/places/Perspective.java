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

    public static Perspective fromString(final String perspectiveString) {
        switch (perspectiveString) {
            case "SIDE":
            case "Side":
            case "side":
                return SIDE;
            case "TOP":
            case "Top":
            case "top":
                return TOP;
            default: throw new IllegalArgumentException("perspectiveString must be either SIDE or TOP, but was " + perspectiveString + " instead.");
        }
    }
}
