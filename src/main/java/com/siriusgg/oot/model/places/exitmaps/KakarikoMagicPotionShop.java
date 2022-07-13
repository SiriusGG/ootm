package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.PermanentlyLoadedInformation;
import com.siriusgg.oot.model.places.*;

public class KakarikoMagicPotionShop extends ExitMap {
    public KakarikoMagicPotionShop() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[20]);
        initMap();
        setDoorExitsAmount(2);
        initExits();
        setExit(new KakarikoMagicPotionShopToFront(), 0);
        setExit(new KakarikoMagicPotionShopToBack(), 1);
    }

    private static class KakarikoMagicPotionShopToFront extends Exit {
        public KakarikoMagicPotionShopToFront() {
            super(ExitType.DOOR_EXIT);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorExit(DoorExit.KAK_POTION_SHOP_FRONT);
        }
    }

    private static class KakarikoMagicPotionShopToBack extends Exit {
        public KakarikoMagicPotionShopToBack() {
            super(ExitType.DOOR_EXIT);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorExit(DoorExit.KAK_POTION_SHOP_BACK);
        }
    }
}
