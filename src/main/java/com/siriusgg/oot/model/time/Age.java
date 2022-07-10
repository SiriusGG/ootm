package com.siriusgg.oot.model.time;

import com.siriusgg.oot.exception.UnknownAgeException;

public enum Age {
    CHILD,
    ADULT;

    public static String getAgeString(final Age age) throws UnknownAgeException {
        if (age == Age.CHILD) {
            return "Child";
        } else if (age == Age.ADULT) {
            return "Adult";
        } else {
            throw new UnknownAgeException(age);
        }
    }
}
