package com.siriusgg.oot.exception;

import com.siriusgg.oot.model.places.Perspective;

public class UnknownPerspectiveException extends Exception {
    public UnknownPerspectiveException(final Perspective perspective) {
        super("Unknown perspective: " + perspective.toString());
    }
}
