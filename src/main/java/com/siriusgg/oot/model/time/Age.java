package com.siriusgg.oot.model.time;

import com.siriusgg.oot.exception.UnknownAgeException;

public enum Age {
    CHILD,
    ADULT;

    public static String getAgeString(final Age age) throws UnknownAgeException {
        if (age == Age.CHILD) {
            return "child";
        } else if (age == Age.ADULT) {
            return "adult";
        } else {
            throw new UnknownAgeException(age);
        }
    }
}
