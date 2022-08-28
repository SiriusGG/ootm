package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Constants;
import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exits.*;

public class KakarikoPotionShop extends ExitMap {
    public KakarikoPotionShop(final String seedName) {
        super(seedName);
        setPlace(PlaceWithMap.KAKARIKO_POTION_SHOP);
        setNiceName(Constants.NICE_PLACES_WITH_MAP[20]);
        initMap();
        setDoorExitsAmount(2);
        initExits();
        setExit(new KakarikoPotionShopToFront(this), 0);
        setExit(new KakarikoPotionShopToBack(this), 1);
        loadExitDestinationsFromSaveFile();
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 280;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 280;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 280;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 280;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
