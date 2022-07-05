package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;

public class HauntedWasteland extends ExitMap {
    public HauntedWasteland(final Settings settings) {
        super(settings);
        setName("Haunted Wasteland");
        initMap();
        setOverworldTransitionsAmount(2);
        setAccessibility(false, true);
        initExits();
    }
}
