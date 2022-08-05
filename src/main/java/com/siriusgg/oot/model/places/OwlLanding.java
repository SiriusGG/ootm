package com.siriusgg.oot.model.places;

import com.siriusgg.oot.model.PermanentlyLoadedInformation;

public enum OwlLanding {
    KAKARIKO,
    HYRULE_FIELD;

    public String toNiceName() {
        PermanentlyLoadedInformation pli = PermanentlyLoadedInformation.getInstance();
        String[] names = pli.getNiceOwlLandings();
        switch (this) {
            case KAKARIKO: return names[0];
            case HYRULE_FIELD: return names[1];
            default: throw new IllegalArgumentException(this.name());
        }
    }
}
