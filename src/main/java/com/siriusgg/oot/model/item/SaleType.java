package com.siriusgg.oot.model.item;

public enum SaleType {
    NORMAL, SPECIAL_DEAL;

    public static SaleType fromString(final String string) {
        String lowerCasedString = string.toLowerCase();
        switch (lowerCasedString) {
            case "normal":
            case "normaldeal":
            case "normal deal":
            case "normal_deal":
                return NORMAL;
            case "special":
            case "specialdeal":
            case "special deal":
            case "special_deal":
                return SPECIAL_DEAL;
            default: throw new IllegalArgumentException("String in SaleType.fromType(String string) may only be " +
                    "'normal' or 'special'.");
        }
    }

    public String getNiceDescriptionText() {
        switch (this) {
            case NORMAL:
                return "(normal)";
            case SPECIAL_DEAL:
                return "(special deal!)";
            default:
                throw new IllegalStateException("Unknown SaleType: " + this + " with name " + this.name() + ".");
        }
    }
}
