package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;

public class TempleOfTime extends ExitMap {
    public TempleOfTime(final Settings settings) {
        super(settings);
        setName("Temple of Time");
        initMap();
        setDoorExitsAmount(1);
        initExits();
    }
}
