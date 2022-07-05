package com.siriusgg.oot.exception;

import com.siriusgg.oot.model.time.Age;

public class UnknownAgeException extends Exception {
    public UnknownAgeException(final Age age) {
        super("Unknown age: " + age.toString());
    }
}
