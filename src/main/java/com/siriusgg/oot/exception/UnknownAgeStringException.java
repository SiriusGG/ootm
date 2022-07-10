package com.siriusgg.oot.exception;

public class UnknownAgeStringException extends Exception {
    public UnknownAgeStringException(final String ageString) {
        super("Unknown age string: " + ageString);
    }
}
