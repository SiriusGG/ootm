package com.siriusgg.oot.view;

import com.siriusgg.oot.components.ShopDropDownLabel;
import com.siriusgg.oot.constants.OoTMConstants;
import com.siriusgg.oot.controller.ShopsController;
import com.siriusgg.oot.model.*;

import javax.swing.*;
import java.awt.event.*;

public class ShopsFrame extends JFrame {
    private final ShopDropDownLabel[] shopDropDownLabels;

    public ShopsFrame(final ShopsController sc) {
        super();
        setLayout(null);
        Translation t = GlobalSettings.getInstance().getTranslation();
        setTitle(t.getTranslatedText("Shops"));
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(final WindowEvent e) {
                sc.handleDispose();
            }
        });
        shopDropDownLabels = new ShopDropDownLabel[OoTMConstants.SHOPS.length];
        setResizable(false);
    }

    public ShopDropDownLabel[] getShopDropDownLabels() {
        return shopDropDownLabels;
    }
}
