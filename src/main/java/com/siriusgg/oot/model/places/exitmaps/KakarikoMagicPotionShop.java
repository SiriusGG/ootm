package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;

public class KakarikoMagicPotionShop extends ExitMap {
    public KakarikoMagicPotionShop(final Settings settings) {
        super(settings);
        setName("Kakariko Magic Potion Shop");
        initMap();
        setDoorExitsAmount(2);
        initExits();
    }
}
