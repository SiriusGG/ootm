package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.OoTMConstants;
import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.*;

public class KakarikoPotionShop extends ExitMap {
    public KakarikoPotionShop(final String seedName) {
        super(seedName);
        setPlace(PlaceWithMap.KAKARIKO_POTION_SHOP);
        setNiceName(OoTMConstants.NICE_PLACES_WITH_MAP[20]);
        initMap();
        setDoorExitsAmount(2);
        initExits();
        setExit(new KakarikoPotionShopToFront(this), 0);
        setExit(new KakarikoPotionShopToBack(this), 1);
        loadExitDestinationsFromSaveFile();
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
		Settings s = Settings.getInstance(getSeedName());
        if (s.getPerspective() == Perspective.SIDE) {
            return 280;
        } else if (s.getPerspective() == Perspective.TOP) {
            return 280;
        } else {
            throw new UnknownPerspectiveException(s.getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
		Settings s = Settings.getInstance(getSeedName());
        if (s.getPerspective() == Perspective.SIDE) {
            return 280;
        } else if (s.getPerspective() == Perspective.TOP) {
            return 280;
        } else {
            throw new UnknownPerspectiveException(s.getPerspective());
        }
    }
}
