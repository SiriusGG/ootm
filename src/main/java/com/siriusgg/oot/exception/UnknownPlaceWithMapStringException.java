package com.siriusgg.oot.exception;

public class UnknownPlaceWithMapStringException extends Exception {
    public UnknownPlaceWithMapStringException(final String placeWithMapString) {
        super("Unknown string for place with map: " + placeWithMapString);
    }
}
