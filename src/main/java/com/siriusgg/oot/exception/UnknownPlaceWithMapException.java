package com.siriusgg.oot.exception;

import com.siriusgg.oot.model.places.PlaceWithMap;

public class UnknownPlaceWithMapException extends Exception {
    public UnknownPlaceWithMapException(final PlaceWithMap placeWithMap) {
        super("Unknown place: " + placeWithMap);
    }
}
