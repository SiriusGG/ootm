package com.siriusgg.oot.model.item;

public class ShopItem {
    private final SaleType saleType;
    private final OoTItem item;
    private final int amount;
    private final int cost;

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
            // ToDo: Validate?
            return new ShopItem(saleType, item, amount, cost);
        } catch (final Exception e) {
            return null;
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
}
