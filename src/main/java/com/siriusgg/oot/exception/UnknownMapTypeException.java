package com.siriusgg.oot.exception;

import com.siriusgg.oot.model.places.MapType;

public class UnknownMapTypeException extends Exception {
    public UnknownMapTypeException(final MapType mapType) {
        super("Unknown map type: " + mapType);
    }
}
