package com.siriusgg.oot.controller;

import com.siriusgg.oot.components.*;
import com.siriusgg.oot.constants.*;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.util.ComponentFunctions;
import com.siriusgg.oot.model.util.ExpandedState;
import com.siriusgg.oot.view.*;

import java.awt.*;

public class ShopsController {
    private final String seedName;
    private final CurrentLocationController clc;
    private final Translation t;
    private ShopDropDownPanel[] shopDropDownPanels;
    private ShopOptionPane shopOptionPane;
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
        shopDropDownPanels = sf.getShopDropDownLabels();
        shopOptionPane = sf.getShopOptionPane();
        initializeShopDropDownLabels();
        relocateElements();
        addLabels();
        sf.setSize(getFrameSize());
        ComponentFunctions.center(sf);
        sf.setVisible(true);
    }

    public void initializeShopDropDownLabels() {
        for (int i = 0; i < OoTMConstants.SHOPS.length; i++) {
            shopDropDownPanels[i] = new ShopDropDownPanel(this, t, i);
        }
    }

    public void handleDropDownPanel(final int shopIndex) {
        if (expanded) {
            shopDropDownPanels[currentShop].setExpandIcon(ExpandedState.REDUCED);
            if (shopIndex != currentShop) {
                currentShop = shopIndex;
                shopDropDownPanels[currentShop].setExpandIcon(ExpandedState.EXPANDED);
            } else {
                currentShop = -1;
                expanded = false;
            }
        } else {
            currentShop = shopIndex;
            expanded = true;
            shopDropDownPanels[currentShop].setExpandIcon(ExpandedState.EXPANDED);
        }
        updateShopOptionPane();
        updateFrame();
    }

    public void updateFrame() {
        sf.setSize(getFrameSize());
        relocateElements();
    }

    private void updateShopOptionPane() {
        if (expanded) {
            shopOptionPane.loadShop(currentShop);
            shopOptionPane.setVisible(true);
        } else {
            shopOptionPane.setVisible(false);
        }
    }

    public void relocateElements() {
        int borderSpacer = ViewConstants.BORDER_SPACER;
        int shopDropDownLabelHeight = ViewConstants.SHOP_DROP_DOWN_PANEL_HEIGHT;
        int verticalElementSpacer = ViewConstants.VERTICAL_ELEMENT_SPACER;
        if (!expanded) {
            for (int i = 0; i < shopDropDownPanels.length; i++) {
                shopDropDownPanels[i].setLocation(borderSpacer, borderSpacer +
                        (i * shopDropDownLabelHeight) +
                        (i * verticalElementSpacer));
            }
        } else {
            for (int i = 0; i <= currentShop; i++) {
                shopDropDownPanels[i].setLocation(borderSpacer, borderSpacer +
                        (i * shopDropDownLabelHeight) +
                        (i * verticalElementSpacer));
            }
            shopOptionPane.setLocation(borderSpacer, borderSpacer +
                    ((currentShop + 1) * shopDropDownLabelHeight) +
                    ((currentShop + 1) * verticalElementSpacer));
            for (int i = currentShop + 1; i < shopDropDownPanels.length; i++) {
                shopDropDownPanels[i].setLocation(borderSpacer, borderSpacer +
                        (i * shopDropDownLabelHeight) +
                        ((i + 1) * verticalElementSpacer) +
                        ViewConstants.SHOP_OPTION_PANE_HEIGHT);
            }
        }
    }

    public Dimension getFrameSize() {
        int width = (2 * ViewConstants.BORDER_SPACER) + ViewConstants.RIGHT_LAF_SPACER;
        width += Math.max(ViewConstants.SHOP_DROP_DOWN_PANEL_WIDTH, ViewConstants.SHOP_OPTION_PANE_WIDTH);
        int shopsAmount = OoTMConstants.SHOPS.length;
        int height = ViewConstants.TITLE_BAR_LAF_SPACER +
                (2 * ViewConstants.BORDER_SPACER) +
                (shopsAmount * ViewConstants.SHOP_DROP_DOWN_PANEL_HEIGHT) +
                ((shopsAmount - 1) * ViewConstants.VERTICAL_ELEMENT_SPACER);
        if (expanded) {
            height += ViewConstants.VERTICAL_ELEMENT_SPACER;
            height += ViewConstants.SHOP_OPTION_PANE_HEIGHT;
        }
        return new Dimension(width, height);
    }

    public void addLabels() {
        Container cp = sf.getContentPane();
        for (final ShopDropDownPanel label : shopDropDownPanels) {
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
