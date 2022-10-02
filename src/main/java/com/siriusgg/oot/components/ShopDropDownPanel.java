package com.siriusgg.oot.components;

import com.siriusgg.oot.constants.*;
import com.siriusgg.oot.controller.ShopsController;
import com.siriusgg.oot.translation.Translation;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.Objects;

public class ShopDropDownPanel extends JPanel {
    private final ShopsController sc;
    private final int shopIndex;
    private final JLabel iconLabel;
    private final int shopDropDownIconWidth = ViewConstants.SHOP_DROP_DOWN_ICON_LABEL_WIDTH;
    private final int shopDropDownIconHeight = ViewConstants.SHOP_DROP_DOWN_ICON_LABEL_HEIGHT;

    public ShopDropDownPanel(final ShopsController sc, final Translation t, final int shopIndex) {
        super();
        this.sc = sc;
        this.shopIndex = shopIndex;
        setLayout(null);
        int shopDropDownPanelWidth = ViewConstants.SHOP_DROP_DOWN_PANEL_WIDTH;
        int shopDropDownPanelHeight = ViewConstants.SHOP_DROP_DOWN_PANEL_HEIGHT;
        int shopDropDownTextWidth = ViewConstants.SHOP_DROP_DOWN_TEXT_LABEL_WIDTH;
        int shopDropDownTextHeight = ViewConstants.SHOP_DROP_DOWN_TEXT_LABEL_HEIGHT;
        int horizontalElementSpacer = ViewConstants.HORIZONTAL_ELEMENT_SPACER;
        iconLabel = new JLabel();
        iconLabel.setBounds(0, 0, shopDropDownIconWidth, shopDropDownIconHeight);
        String expandGraphicPath = OoTMConstants.SYMBOL_DIRECTORY + "/expand.png";
        ImageIcon expandGraphicOrig;
        try {
            expandGraphicOrig = new ImageIcon(ImageIO.read(Objects.requireNonNull(
                    getClass().getClassLoader().getResource(expandGraphicPath))));
            iconLabel.setIcon(new ImageIcon(expandGraphicOrig.getImage().getScaledInstance(
                    shopDropDownIconWidth, shopDropDownIconHeight, Image.SCALE_SMOOTH)));
        } catch (final IOException e) {
            e.printStackTrace();
        }
        add(iconLabel);
        JLabel textLabel = new JLabel(t.getTranslatedText(OoTMConstants.SHOPS[shopIndex]));
        textLabel.setBounds(shopDropDownIconWidth + horizontalElementSpacer, 0,
                shopDropDownTextWidth, shopDropDownTextHeight);
        add(textLabel);
        addMouseListener(getMouseAdapter());
        iconLabel.addMouseListener(getMouseAdapter());
        textLabel.addMouseListener(getMouseAdapter());
        setSize(shopDropDownPanelWidth, shopDropDownPanelHeight);
    }

    private MouseListener getMouseAdapter() {
        return new MouseAdapter() {
            @Override
            public void mouseClicked(final MouseEvent e) {
                super.mouseClicked(e);
                sc.handleDropDownPanel(shopIndex);
            }
        };
    }

    public void setExpandIcon(final ExpandedState state) {
        if (state == ExpandedState.EXPANDED) {
            iconLabel.setIcon(getGraphic("reduce"));
        } else {
            iconLabel.setIcon(getGraphic("expand"));
        }
    }

    private ImageIcon getGraphic(final String stateChange) {
        if (stateChange.equals("reduce") || stateChange.equals("expand")) {
            ImageIcon expandGraphicOrig;
            try {
                expandGraphicOrig = new ImageIcon(ImageIO.read(Objects.requireNonNull(
                        getClass().getClassLoader().getResource(
                                OoTMConstants.SYMBOL_DIRECTORY + "/" + stateChange + ".png"))));
                return new ImageIcon(expandGraphicOrig.getImage().getScaledInstance(
                        shopDropDownIconWidth, shopDropDownIconHeight, Image.SCALE_SMOOTH));
            } catch (final IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public enum ExpandedState {
        EXPANDED, REDUCED
    }
}
