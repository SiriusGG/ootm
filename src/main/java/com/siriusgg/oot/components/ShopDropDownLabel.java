package com.siriusgg.oot.components;

import com.siriusgg.oot.constants.*;
import com.siriusgg.oot.controller.ShopsController;
import com.siriusgg.oot.model.*;

import javax.swing.*;
import java.awt.event.*;

public class ShopDropDownLabel extends JLabel {
    private final ShopsController sc;
    private final int shopIndex;

    public ShopDropDownLabel(final ShopsController sc, final Translation t, final int shopIndex) {
        super(t.getTranslatedText(OoTMConstants.SHOPS[shopIndex]));
        this.sc = sc;
        this.shopIndex = shopIndex;
        setLayout(null);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(final MouseEvent e) {
                super.mouseClicked(e);
                shopLabelActionPerformed();
            }
        });
        setSize(ViewConstants.SHOP_DROP_DOWN_LABEL_WIDTH, ViewConstants.SHOP_DROP_DOWN_LABEL_HEIGHT);
    }

    public void shopLabelActionPerformed() {
        sc.handleLabel(shopIndex);
    }
}
