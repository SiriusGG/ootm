package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;

public class ThievesHideout extends ExitMap {
    public ThievesHideout(final Settings settings) {
        super(settings);
        setName("Thieves' Hideout");
        initMap();
        setDoorExitsAmount(50); // ToDo: Count
        initExits();
    }
}
