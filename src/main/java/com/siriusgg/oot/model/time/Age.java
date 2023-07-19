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

    public static Age fromString(final String ageString) {
        switch (ageString) {
            case "CHILD":
            case "Child":
            case "child":
                return CHILD;
            case "ADULT":
            case "Adult":
            case "adult":
                return ADULT;
            default:
                throw new IllegalArgumentException("ageString must be either CHILD or ADULT, but was " +
                        ageString + " instead.");
        }
    }
}
