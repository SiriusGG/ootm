package com.siriusgg.oot.components;

import com.siriusgg.oot.constants.ViewConstants;
import com.siriusgg.oot.controller.ShopsController;

import javax.swing.*;
import java.awt.*;

public class ShopOptionPane extends JPanel {
    private final ShopsController sc;

    public ShopOptionPane(final ShopsController sc) {
        super();
        setLayout(null);
        this.sc = sc;
        setBackground(Color.GREEN); // ToDo: Remove
        setSize(ViewConstants.SHOP_OPTION_PANE_WIDTH, ViewConstants.SHOP_OPTION_PANE_HEIGHT);
    }

    public void loadShop(final int shopIndex) {
        // ToDo
    }
}
