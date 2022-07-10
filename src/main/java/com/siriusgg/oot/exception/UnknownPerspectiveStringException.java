package com.siriusgg.oot.exception;

public class UnknownPerspectiveStringException extends Exception {
    public UnknownPerspectiveStringException(final String perspectiveString) {
        super("Unknown perspective string: " + perspectiveString);
    }
}
