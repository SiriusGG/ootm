package com.siriusgg.oot.model.places;

import com.siriusgg.oot.constants.OoTMConstants;

public enum OwlLanding {
    KAKARIKO,
    HYRULE_FIELD;

    public String toNiceName() {
        String[] names = OoTMConstants.NICE_OWL_LANDINGS;
        switch (this) {
            case KAKARIKO:
                return names[0];
            case HYRULE_FIELD:
                return names[1];
            default:
                throw new IllegalArgumentException(this.name());
        }
    }
}
