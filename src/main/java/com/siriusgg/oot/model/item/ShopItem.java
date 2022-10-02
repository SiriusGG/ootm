package com.siriusgg.oot.model.item;

public class ShopItem {
    private SaleType saleType;
    private OoTItem item;
    private int amount;
    private int cost;

    public ShopItem(final SaleType saleType, final OoTItem item, final int amount, final int cost) {
        this.saleType = saleType;
        this.item = item;
        this.amount = amount;
        this.cost = cost;
    }

    public static ShopItem fromString(final String shopItemString) {
        String[] shopItemSegments = shopItemString.split(";");
        try {
            SaleType saleType = SaleType.fromString(shopItemSegments[1]);
            OoTItem item = OoTItem.fromString(shopItemSegments[2]);
            int amount = Integer.parseInt(shopItemSegments[3]);
            int cost = Integer.parseInt(shopItemSegments[4]);
            return new ShopItem(saleType, item, amount, cost);
        } catch (final IllegalArgumentException e) {
            return new ShopItem(null, null, 0, 0);
        }
    }

    public SaleType getSaleType() {
        return saleType;
    }

    public OoTItem getItem() {
        return item;
    }

    public int getAmount() {
        return amount;
    }

    public int getCost() {
        return cost;
    }

    public void setSaleType(final SaleType saleType) {
        this.saleType = saleType;
    }

    public void setItem(final OoTItem item) {
        this.item = item;
    }

    public void setAmount(final int amount) {
        this.amount = amount;
    }

    public void setCost(final int cost) {
        this.cost = cost;
    }
}
