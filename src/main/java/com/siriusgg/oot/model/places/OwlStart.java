package com.siriusgg.oot.model.places;

import com.siriusgg.oot.model.OoTMConstants;

public enum OwlStart {
    DEATH_MOUNTAIN_TRAIL,
    LAKE_HYLIA;

    public String toNiceName() {
        String[] names = OoTMConstants.NICE_OWL_STARTS;
        switch (this) {
            case DEATH_MOUNTAIN_TRAIL:
                return names[0];
            case LAKE_HYLIA:
                return names[1];
            default:
                throw new IllegalArgumentException(this.name());
        }
    }
}
