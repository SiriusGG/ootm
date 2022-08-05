package com.siriusgg.oot.model.places;

import com.siriusgg.oot.model.PermanentlyLoadedInformation;

public enum OwlStart {
    DEATH_MOUNTAIN_TRAIL,
    LAKE_HYLIA;

    public String toNiceName() {
        PermanentlyLoadedInformation pli = PermanentlyLoadedInformation.getInstance();
        String[] names = pli.getNiceOwlStarts();
        switch (this) {
            case DEATH_MOUNTAIN_TRAIL: return names[0];
            case LAKE_HYLIA: return names[1];
            default: throw new IllegalArgumentException(this.name());
        }
    }
}
