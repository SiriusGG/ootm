package com.siriusgg.oot.exception;

public class UnknownMapIdException extends Exception {
    public UnknownMapIdException(final String mapId) {
        super("Unknown map ID: " + mapId);
    }
}
