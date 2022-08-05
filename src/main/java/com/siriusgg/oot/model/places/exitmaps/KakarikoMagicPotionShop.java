package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;

public class KakarikoMagicPotionShop extends ExitMap {
    public KakarikoMagicPotionShop() {
        super();
        setPlace(PlaceWithMap.KAKARIKO_MAGIC_POTION_SHOP);
        setName(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[20]);
        initMap();
        setDoorExitsAmount(2);
        initExits();
        setExit(new KakarikoMagicPotionShopToFront(this), 0);
        setExit(new KakarikoMagicPotionShopToBack(this), 1);
    }

    private static class KakarikoMagicPotionShopToFront extends Exit {
        public KakarikoMagicPotionShopToFront(final ExitMap exitMap) {
            super(exitMap, ExitType.DOOR_EXIT);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorExit(DoorExit.KAK_POTION_SHOP_FRONT);
            setBothSidePositions(new Position(7.81, 67.36));
            setBothTopPositions(new Position(7.81, 67.36));
        }
    }

    private static class KakarikoMagicPotionShopToBack extends Exit {
        public KakarikoMagicPotionShopToBack(final ExitMap exitMap) {
            super(exitMap, ExitType.DOOR_EXIT);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorExit(DoorExit.KAK_POTION_SHOP_BACK);
            setBothSidePositions(new Position(9.98, 24.31));
            setBothTopPositions(new Position(9.98, 24.31));
        }
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
