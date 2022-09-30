package com.siriusgg.oot.components;

import com.siriusgg.oot.constants.*;
import com.siriusgg.oot.controller.ShopsController;
import com.siriusgg.oot.model.list.ShopList;
import com.siriusgg.oot.model.util.MathFunctions;

import javax.swing.*;

public class ShopOptionPane extends JPanel {
    private final ShopsController sc;
    private final ShopItemPanel[] shopItemPanels;
    private final int itemsPerShop = OoTMConstants.ITEMS_PER_SHOP;
    private final int itemsPerRow;

    public ShopOptionPane(final ShopsController sc) {
        super();
        setLayout(null);
        this.sc = sc;
        this.shopItemPanels = new ShopItemPanel[OoTMConstants.ITEMS_PER_SHOP];
        if (MathFunctions.isEven(itemsPerShop)) itemsPerRow = itemsPerShop / 2;
        else itemsPerRow = (itemsPerShop + 1) / 2;
        initializeShopItemPanels();
        setSize(ViewConstants.SHOP_OPTION_PANE_WIDTH, ViewConstants.SHOP_OPTION_PANE_HEIGHT);
    }

    public void initializeShopItemPanels() {
        if (sc.getCurrentShop() >= 0 && sc.getCurrentShop() <= OoTMConstants.SHOPS.length) {
            ShopList shopList = sc.getShopLists()[sc.getCurrentShop()];
            for (int i = 0; i < itemsPerShop; i++) {
                shopItemPanels[i] = new ShopItemPanel(shopList.getShopItems()[i]);
            }
        } else {
            for (int i = 0; i < itemsPerShop; i++) {
                shopItemPanels[i] = new ShopItemPanel(null);
            }
        }
        int borderSpacer = ViewConstants.BORDER_SPACER;
        int horizontalElementSpacer = ViewConstants.HORIZONTAL_ELEMENT_SPACER;
        int verticalElementSpacer = ViewConstants.VERTICAL_ELEMENT_SPACER;
        int shopItemPanelWidth = ViewConstants.SHOP_ITEM_PANEL_WIDTH;
        int shopItemPanelHeight = ViewConstants.SHOP_ITEM_PANEL_HEIGHT;
        for (int i = 0; i < itemsPerShop; i++) {
            shopItemPanels[i].setLocation(borderSpacer + ((i % itemsPerRow) * horizontalElementSpacer) +
                            ((i % itemsPerRow) * shopItemPanelWidth),
                    borderSpacer + ((i / itemsPerRow) * (verticalElementSpacer + shopItemPanelHeight)));
            shopItemPanels[i].setSize(shopItemPanelWidth, shopItemPanelHeight);
            add(shopItemPanels[i]);
        }
    }

    public void update() {
        ShopList shopList = sc.getShopLists()[sc.getCurrentShop()];
        for (int i = 0; i < itemsPerShop; i++) {
            shopItemPanels[i].setShopItem(shopList.getShopItems()[i]);
        }
    }
}
