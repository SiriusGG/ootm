package com.siriusgg.oot.components;

import com.siriusgg.oot.constants.ViewConstants;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.item.*;

import javax.swing.*;
import java.awt.*;

public class ShopItemPanel extends JPanel {
    private final JLabel testText;
    private final Translation t = GlobalSettings.getInstance().getTranslation();
    private final String stringNoItem = t.getTranslatedText("Empty");
    private ShopItem shopItem;

    public ShopItemPanel(final ShopItem shopItem) {
        super();
        this.shopItem = shopItem;
        setLayout(null);
        if (shopItem != null) {
            testText = new JLabel(getShopItemPanelText());
        } else {
            testText = new JLabel(stringNoItem);
        }
        testText.setHorizontalAlignment(JLabel.CENTER);
        testText.setHorizontalTextPosition(JLabel.CENTER);
        testText.setSize(ViewConstants.SHOP_ITEM_PANEL_WIDTH, ViewConstants.SHOP_ITEM_PANEL_HEIGHT);
        testText.setLocation(0, 0);
        add(testText);
        setBackground(Color.WHITE);
        // ToDo: Add MouseListener
    }

    private String getShopItemPanelText() {
        return "<html><body style='text-align: center'>" +
                t.getTranslatedText(OoTItem.getNiceName(shopItem.getItem())) + "<br>" +
                shopItem.getAmount() + t.getTranslatedText(" for ") +
                shopItem.getCost() + " " + t.getTranslatedText("rupees") + "<br>" +
                t.getTranslatedText(shopItem.getSaleType().getNiceDescriptionText()) +
                "</html>";
    }

    public void setShopItem(final ShopItem shopItem) {
        this.shopItem = shopItem;
        if (shopItem != null) {
            if (shopItem.getSaleType() != null && shopItem.getItem() != null) {
                testText.setText(getShopItemPanelText());
            } else {
                testText.setText(stringNoItem);
            }
        } else {
            testText.setText(stringNoItem);
        }
    }
}
