package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Settings;

public class HyruleField extends ExitMap {
    public HyruleField(final Settings settings) {
        super(settings);
        setName("Hyrule Field");
        initMap();
        setGrottoEntrancesAmount(8);
        setOverworldTransitionsAmount(7);
        setHasOwlLanding(true);
        initExits();
    }
}
