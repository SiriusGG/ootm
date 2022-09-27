package com.siriusgg.oot.controller;

import com.siriusgg.oot.components.ShopDropDownLabel;
import com.siriusgg.oot.constants.*;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.util.ComponentFunctions;
import com.siriusgg.oot.view.*;
import com.sun.deploy.appcontext.AppContext;

import java.awt.*;

public class ShopsController {
    private final String seedName;
    private final CurrentLocationController clc;
    private final Translation t;
    private ShopDropDownLabel[] shopDropDownLabels;
    private ShopsFrame sf;
    private boolean expanded = false;
    private int currentShop = -1;

    public ShopsController(final String seedName, final CurrentLocationController clc) {
        this.seedName = seedName;
        this.clc = clc;
        t = GlobalSettings.getInstance().getTranslation();
    }

    public void init() {
        sf = new ShopsFrame(this);
        clc.setShopsOpen(true);
        shopDropDownLabels = sf.getShopDropDownLabels();
        initializeShopDropDownLabels();
        relocateElements();
        addLabels();
        sf.setSize(getFrameSize());
        ComponentFunctions.center(sf);
        sf.setVisible(true);
    }

    public void initializeShopDropDownLabels() {
        for (int i = 0; i < OoTMConstants.SHOPS.length; i++) {
            shopDropDownLabels[i] = new ShopDropDownLabel(this, t, i);
        }
    }

    public void handleLabel(final int shopIndex) {
        if (expanded) {
            if (shopIndex != currentShop) {
                currentShop = shopIndex;
            } else {
                currentShop = -1;
                expanded = false;
            }
        } else {
            currentShop = shopIndex;
            expanded = true;
        }
        updateFrame();
    }

    public void updateFrame() {
        sf.setSize(getFrameSize());
        relocateElements();
        ComponentFunctions.center(sf);
    }

    public void relocateElements() {
        int borderSpacer = ViewConstants.BORDER_SPACER;
        if (!expanded) {
            for (int i = 0; i < shopDropDownLabels.length; i++) {
                shopDropDownLabels[i].setLocation(borderSpacer, borderSpacer +
                        (i * ViewConstants.SHOP_DROP_DOWN_LABEL_HEIGHT) +
                        (i * ViewConstants.VERTICAL_ELEMENT_SPACER));
            }
        } else {
            for (int i = 0; i <= currentShop; i++) {
                shopDropDownLabels[i].setLocation(borderSpacer, borderSpacer +
                        (i * ViewConstants.SHOP_DROP_DOWN_LABEL_HEIGHT) +
                        (i * ViewConstants.VERTICAL_ELEMENT_SPACER));
            }
            for (int i = currentShop + 1; i < shopDropDownLabels.length; i++) {
                shopDropDownLabels[i].setLocation(borderSpacer, borderSpacer +
                        (i * ViewConstants.SHOP_DROP_DOWN_LABEL_HEIGHT) +
                        ((i + 1) * ViewConstants.VERTICAL_ELEMENT_SPACER) +
                        ViewConstants.SHOP_OPTION_PANE_HEIGHT);
            }
        }
    }

    public Dimension getFrameSize() {
        int width = (2 * ViewConstants.BORDER_SPACER) + ViewConstants.RIGHT_LAF_SPACER;
        width += Math.max(ViewConstants.SHOP_DROP_DOWN_LABEL_WIDTH, ViewConstants.SHOP_OPTION_PANE_WIDTH);
        int shopsAmount = OoTMConstants.SHOPS.length;
        int height = ViewConstants.TITLE_BAR_LAF_SPACER +
                (2 * ViewConstants.BORDER_SPACER) +
                (shopsAmount * ViewConstants.SHOP_DROP_DOWN_LABEL_HEIGHT) +
                ((shopsAmount - 1) * ViewConstants.VERTICAL_ELEMENT_SPACER);
        if (expanded) {
            height += ViewConstants.VERTICAL_ELEMENT_SPACER;
            height += ViewConstants.SHOP_OPTION_PANE_HEIGHT;
        }
        return new Dimension(width, height);
    }

    public void addLabels() {
        Container cp = sf.getContentPane();
        for (final ShopDropDownLabel label : shopDropDownLabels) {
            cp.add(label);
        }
    }

    public void handleDispose() {
        sf.dispose();
        clc.setShopsOpen(false);
    }

    public void pullForeground() {
        sf.requestFocus();
    }

    public ShopsFrame getWindow() {
        return sf;
    }
}
