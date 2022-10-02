package com.siriusgg.oot.model.list;

import com.siriusgg.oot.constants.OoTMConstants;
import com.siriusgg.oot.model.item.ShopItem;
import com.siriusgg.oot.util.*;

import java.io.*;
import java.util.Arrays;

public class ShopList {
    private final String seedName;
    private final String shopName;
    private final ShopItem[] shopItems;

    public ShopList(final String seedName, final String shopName) {
        this.seedName = seedName;
        this.shopName = shopName;
        shopItems = new ShopItem[OoTMConstants.ITEMS_PER_SHOP];
        Arrays.fill(shopItems, null);
        loadShopItemArray();
    }

    private void loadShopItemArray() {
        if (shopListFileExists()) {
            try {
                File shopFile = new File(OoTMConstants.USER_HOME + "/" +
                        OoTMConstants.SAVE_DIRECTORY + "/" +
                        seedName + "/" +
                        OoTMConstants.SHOPS_DIRECTORY + "/" +
                        StringFunctions.removeSpecialCharacters(shopName) + OoTMConstants.SHOP_FILE_EXTENSION);
                FileReader fr = new FileReader(shopFile);
                BufferedReader br = new BufferedReader(fr);
                String currentLine;
                while ((currentLine = br.readLine()) != null) {
                    if (currentLine.startsWith("\ufeff")) currentLine = currentLine.substring(1);
                    if (StringFunctions.startsWithDigit(currentLine)) {
                        int index = Integer.parseInt("" + currentLine.charAt(0));
                        shopItems[index] = ShopItem.fromString(currentLine);
                    }
                }
                br.close();
            } catch (final IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void saveShopList() {
        try {
            File shopListFile = new File(SaveLoad.ensureShopsDirectoryExists(seedName) + "/" +
                    StringFunctions.removeSpecialCharacters(shopName) + OoTMConstants.SHOP_FILE_EXTENSION);
            if (shopListFile.exists()) {
                if (!shopListFile.delete()) {
                    throw new IOException("Could not delete old shop list file \"" +
                            shopListFile.getAbsolutePath() + "\".");
                }
            }
            FileWriter fw = new FileWriter(shopListFile);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < shopItems.length; i++) {
                ShopItem shopItem = shopItems[i];
                if (shopItem != null && shopItem.getSaleType() != null && shopItem.getItem() != null) {
                    bw.write(i + ";" + shopItem.getSaleType().name() + ";" + shopItem.getItem().name() + ";" +
                            shopItem.getAmount() + ";" + shopItem.getCost() + "\n");
                } else {
                    bw.write(i + ";null;null;0;0\n");
                }
            }
            bw.flush();
            bw.close();
        } catch (final IOException e) {
            System.err.println("Could not save shop list file " + StringFunctions.removeSpecialCharacters(shopName) +
                    OoTMConstants.SHOP_FILE_EXTENSION + ".");
            e.printStackTrace();
        }
    }

    public String getShopName() {
        return shopName;
    }

    public ShopItem[] getShopItems() {
        return shopItems;
    }

    public void setShopItem(final int index, final ShopItem shopItem) {
        shopItems[index] = shopItem;
    }

    private boolean shopListFileExists() {
        File possibleSeedDir = new File(OoTMConstants.USER_HOME + "/" +
                OoTMConstants.SAVE_DIRECTORY + "/" +
                seedName);
        if (!possibleSeedDir.exists() || !possibleSeedDir.isDirectory()) return false;
        File possibleShopDir = new File(possibleSeedDir + "/" +
                OoTMConstants.SHOPS_DIRECTORY);
        if (!possibleShopDir.exists() || !possibleShopDir.isDirectory()) return false;
        File f = new File(possibleShopDir + "/" +
                StringFunctions.removeSpecialCharacters(shopName) + OoTMConstants.SHOP_FILE_EXTENSION);
        return f.exists() && f.isFile();
    }
}
