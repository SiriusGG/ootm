package com.siriusgg.oot.exception;

import com.siriusgg.oot.model.places.ExitType;

public class UnhandledExitTypeException extends Exception {
    public UnhandledExitTypeException(final ExitType exitTyp) {
        super("Unhandled ExitType: " + exitTyp.name());
    }
}
