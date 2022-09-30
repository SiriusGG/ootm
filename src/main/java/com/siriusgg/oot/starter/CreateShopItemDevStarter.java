package com.siriusgg.oot.starter;

import com.siriusgg.oot.constants.OoTMConstants;
import com.siriusgg.oot.model.list.ShopList;

public class CreateShopItemDevStarter {
    public static void main(final String[] args) {
        ShopList sl = new ShopList("devtest", OoTMConstants.SHOPS[0]);
        System.out.println(sl.getShopItems()[0].getSaleType().toString());
        System.out.println(sl.getShopItems()[0].getItem().toString());
        System.out.println(sl.getShopItems()[0].getAmount());
        System.out.println(sl.getShopItems()[0].getCost());
    }
}
