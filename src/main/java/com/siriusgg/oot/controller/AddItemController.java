package com.siriusgg.oot.controller;

import com.siriusgg.oot.constants.ViewConstants;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.item.*;
import com.siriusgg.oot.translation.Translation;
import com.siriusgg.oot.view.AddItemDialog;

import javax.swing.*;
import java.util.*;

public class AddItemController {
    private final ShopsController sc;
    private final Translation t;
    private final ShopItem overridableShopItem;
    private AddItemDialog aid;
    private SaleType saleType = null;
    private OoTItem item = null;
    private int amount = 0;
    private int cost = 0;

    public AddItemController(final ShopsController sc, final ShopItem overridableShopItem) {
        this.sc = sc;
        t = GlobalSettings.getInstance().getTranslation();
        this.overridableShopItem = overridableShopItem;
    }

    public void init() {
        new AddItemDialog(this, t);
        // execution paused until dialog finishes
        if (saleType != null) overridableShopItem.setSaleType(saleType);
        if (item != null) overridableShopItem.setItem(item);
        overridableShopItem.setAmount(amount);
        overridableShopItem.setCost(cost);
    }

    public JFrame getItemDialogOwnerWindow() {
        return sc.getWindow();
    }

    public void buttonNormal(final AddItemDialog aid) {
        this.aid = aid;
        saleType = SaleType.NORMAL;
        proceedWithItemChoice();
    }

    public void buttonSpecial(final AddItemDialog aid) {
        this.aid = aid;
        saleType = SaleType.SPECIAL_DEAL;
        proceedWithItemChoice();
    }

    private void proceedWithItemChoice() {
        aid.getButtonNormal().setVisible(false);
        aid.getButtonSpecial().setVisible(false);
        aid.setTitle(t.getTranslatedText("Select item"));
        aid.getLabelQuestion().setVisible(false);
        aid.setSize(ViewConstants.ADD_ITEM_DIALOG_ITEM_WIDTH, ViewConstants.ADD_ITEM_DIALOG_ITEM_HEIGHT);
        aid.center();
        JList<String> itemList = aid.getListItems();
        fillItems((DefaultListModel<String>) itemList.getModel());
        itemList.setSelectedIndex(0);
        aid.getListScrollPane().setVisible(true);
        aid.getButtonConfirmItem().setVisible(true);
        itemList.requestFocusInWindow();
    }

    public void confirmItem(final String itemName) {
        item = OoTItem.fromNiceName(itemName);
        proceedWithAmountCostChoice();
    }

    private void proceedWithAmountCostChoice() {
        aid.getListScrollPane().setVisible(false);
        aid.getButtonConfirmItem().setVisible(false);
        aid.setTitle(t.getTranslatedText("Set amount / cost"));
        aid.setSize(ViewConstants.ADD_ITEM_DIALOG_AMOUNT_COST_WIDTH, ViewConstants.ADD_ITEM_DIALOG_AMOUNT_COST_HEIGHT);
        aid.center();
        aid.getLabelAmount().setVisible(true);
        aid.getLabelCost().setVisible(true);
        JSpinner amountSpinner = aid.getAmountSpinner();
        amountSpinner.setModel(getAmountSpinnerModel());
        if (!OoTItem.canBeMultiple(item)) amountSpinner.setEnabled(false);
        amountSpinner.setVisible(true);
        JSpinner costSpinner = aid.getCostSpinner();
        costSpinner.setModel(getCostSpinnerModel());
        costSpinner.setVisible(true);
        aid.getButtonConfirmFinal().setVisible(true);
    }

    public void fillItems(final DefaultListModel<String> listModel) {
        ArrayList<String> items = new ArrayList<>();
        if (saleType == SaleType.NORMAL) {
            for (final OoTItem item : OoTItem.values()) {
                if (OoTItem.canAppearAsNormalOfferInShop(item)) {
                    items.add(t.getTranslatedText(OoTItem.getNiceName(item)));
                }
            }
        } else if (saleType == SaleType.SPECIAL_DEAL) {
            for (final OoTItem item : OoTItem.values()) {
                if (OoTItem.canAppearAsSpecialOfferInShop(item)) {
                    items.add(t.getTranslatedText(OoTItem.getNiceName(item)));
                }
            }
        } else {
            throw new IllegalStateException("SaleType illegal: " + saleType);
        }
        Collections.sort(items);
        for (final String item : items) {
            listModel.addElement(item);
        }
    }

    public SpinnerListModel getAmountSpinnerModel() {
        if (item != null) {
            ArrayList<Integer> possibleAmounts = new ArrayList<>();
            int[] possibleAmountsStatic = OoTItem.getPossibleAmounts(item);
            for (final int possibleAmount : possibleAmountsStatic) {
                possibleAmounts.add(possibleAmount);
            }
            return new SpinnerListModel(possibleAmounts);
        } else {
            return null;
        }
    }

    public SpinnerListModel getCostSpinnerModel() {
        ArrayList<Integer> possibleCosts = new ArrayList<>();
        for (int i = 5; i <= 95; i+=5) {
            possibleCosts.add(i);
        }
        possibleCosts.add(99);
        for (int i = 100; i <= 500; i+=5) {
            possibleCosts.add(i);
        }
        return new SpinnerListModel(possibleCosts);
    }

    public void confirmFinal(final int amount, final int cost) {
        this.amount = amount;
        this.cost = cost;
        aid.dispose();
    }
}
