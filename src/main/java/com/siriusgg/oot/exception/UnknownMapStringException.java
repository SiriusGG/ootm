package com.siriusgg.oot.exception;

public class UnknownMapStringException extends Exception {
    public UnknownMapStringException(final String mapString) {
        super("Unknown map string: " + mapString);
    }
}
