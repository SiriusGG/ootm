package com.siriusgg.oot.exception;

import com.siriusgg.oot.model.places.ExitType;

public class UnknownExitTypeException extends Exception {
    public UnknownExitTypeException(final ExitType exitTyp) {
        super("Unknown ExitType: " + exitTyp.name());
    }
}
