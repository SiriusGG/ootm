package com.siriusgg.oot.model;

public enum HideShowTransitionsMode {
    HIDE,
    SHOW;

    public static HideShowTransitionsMode fromString(final String modeString) {
        switch (modeString) {
            case "HIDE":
            case "Hide":
            case "hide":
                return HIDE;
            case "SHOW":
            case "Show":
            case "show":
                return SHOW;
            default:
                throw new IllegalArgumentException("modeString should be either HIDE or SHOW, but was " +
                        modeString + " instead.");
        }
    }
}
