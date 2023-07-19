package com.siriusgg.oot.model;

public enum RememberWayBackMode {
    DO_NOT_REMEMBER,
    REMEMBER_YES,
    REMEMBER_NO;

    public static RememberWayBackMode fromString(final String rememberWayBackModeString) {
        switch (rememberWayBackModeString) {
            case "DO_NOT_REMEMBER":
                return DO_NOT_REMEMBER;
            case "REMEMBER_YES":
                return REMEMBER_YES;
            case "REMEMBER_NO":
                return REMEMBER_NO;
            default:
                throw new IllegalArgumentException("rememberWayBackModeString is neither DO_NOT_REMEMBER, " +
                        "REMEMBER_YES nor REMEMBER_NO.");
        }
    }
}
