package com.siriusgg.oot.model.item;

@SuppressWarnings("unused")
public enum OoTItem {
    DEKU_STICK, DEKU_STICK_UPGRADE, DEKU_NUT, DEKU_NUT_UPGRADE, PROGRESSIVE_SLINGSHOT, BOMB, PROGRESSIVE_BOMB_BAG,
    BOMBCHU, BOOMERANG, PROGRESSIVE_OCARINA, MAGIC_BEANS, PROGRESSIVE_BOW, FIRE_ARROW, ICE_ARROW, LIGHT_ARROW,
    PROGRESSIVE_HOOKSHOT, MEGATON_HAMMER, LENS_OF_TRUTH, DINS_FIRE, FARORES_WIND, NAYRUS_LOVE, KOKIRI_SWORD,
    MASTER_SWORD, GIANTS_KNIFE, BIGGORONS_SWORD, DEKU_SHIELD, HYLIAN_SHIELD, MIRROR_SHIELD, GORON_TUNIC, ZORA_TUNIC,
    IRON_BOOTS, HOVER_BOOTS, PROGRESSIVE_STRENGTH, PROGRESSIVE_SCALE, PROGRESSIVE_WALLET, GERUDO_MEMBERSHIP_CARD,
    STONE_OF_AGONY, BOTTLE, BOTTLE_RUTOS_LETTER, BOTTLE_FULL_MILK, BOTTLE_HALF_MILK, BOTTLE_RED_POTION,
    BOTTLE_GREEN_POTION, BOTTLE_BLUE_POTION, BOTTLE_FAIRY, BOTTLE_BLUE_FIRE, BOTTLE_FISH, BOTTLE_BUGS, BOTTLE_POE,
    BOTTLE_BIG_POE, PIECE_OF_HEART, RECOVERY_HEART, MAGIC_JAR_SMALL, MAGIC_JAR_LARGE, PROGRESSIVE_MAGIC, DEKU_SEED,
    ARROW, GREEN_RUPEE, BLUE_RUPEE, RED_RUPEE, PURPLE_RUPEE, SILVER_RUPEE, YELLOW_RUPEE, ORANGE_RUPEE, SKULLTULA_TOKEN,
    ICE_TRAP, DUNGEON_MAP_DEKU_TREE, DUNGEON_MAP_DODONGOS_CAVERN, DUNGEON_MAP_JABU_JABU, DUNGEON_MAP_FOREST_TEMPLE,
    DUNGEON_MAP_FIRE_TEMPLE, DUNGEON_MAP_WATER_TEMPLE, DUNGEON_MAP_ICE_CAVERN, DUNGEON_MAP_BOTTOM_OF_THE_WELL,
    DUNGEON_MAP_SHADOW_TEMPLE, DUNGEON_MAP_SPIRIT_TEMPLE, COMPASS_DEKU_TREE, COMPASS_DODONGOS_CAVERN,
    COMPASS_JABU_JABU, COMPASS_FOREST_TEMPLE, COMPASS_FIRE_TEMPLE, COMPASS_WATER_TEMPLE, COMPASS_ICE_CAVERN,
    COMPASS_BOTTOM_OF_THE_WELL, COMPASS_SHADOW_TEMPLE, COMPASS_SPIRIT_TEMPLE, SMALL_KEY_FOREST_TEMPLE,
    SMALL_KEY_FIRE_TEMPLE, SMALL_KEY_WATER_TEMPLE, SMALL_KEY_ICE_CAVERN, SMALL_KEY_BOTTOM_OF_THE_WELL,
    SMALL_KEY_SHADOW_TEMPLE, SMALL_KEY_SPIRIT_TEMPLE, SMALL_KEY_GERUDO_TRAINING_GROUND, BOSS_KEY_FOREST_TEMPLE,
    BOSS_KEY_FIRE_TEMPLE, BOSS_KEY_WATER_TEMPLE, BOSS_KEY_SHADOW_TEMPLE, BOSS_KEY_SPIRIT_TEMPLE,
    SMALL_KEY_GANONS_CASTLE, BOSS_KEY_GANONS_CASTLE, HEART_CONTAINER, KEATON_MASK, SKULL_MASK, SPOOKY_MASK, BUNNY_HOOD,
    MASK_OF_TRUTH, GORON_MASK, ZORA_MASK, GERUDO_MASK, POCKET_EGG, POCKET_CUCCO, COJIRO, ODD_MUSHROOM, ODD_POTION,
    POACHERS_SAW, BROKEN_GORONS_SWORD, PRESCRIPTION, EYEBALL_FROG, EYE_DROPS, CLAIM_CHECK, KOKIRIS_EMERALD,
    GORONS_RUBY, ZORAS_SAPPHIRE, LIGHT_MEDALLION, FOREST_MEDALLION, FIRE_MEDALLION, WATER_MEDALLION, SHADOW_MEDALLION,
    SPIRIT_MEDALLION, WEIRD_EGG, CUCCO, ZELDAS_LETTER, KOKIRI_BOOTS, KOKIRI_TUNIC, ZELDAS_LULLABY, EPONAS_SONG,
    SARIAS_SONG, SUNS_SONG, SONG_OF_TIME, SONG_OF_STORMS, MINUET_OF_FOREST, BOLERO_OF_FIRE, SERENADE_OF_WATER,
    NOCTURNE_OF_SHADOW, REQUIEM_OF_SPIRIT, PRELUDE_OF_LIGHT, SCARECROWS_SONG, DOUBLE_HEARTS, REFILL_FULL_MILK,
    REFILL_HALF_MILK, REFILL_RED_POTION, REFILL_GREEN_POTION, REFILL_BLUE_POTION, REFILL_FAIRY, REFILL_BLUE_FIRE,
    REFILL_FISH, REFILL_BUGS, REFILL_POE;

    public static String getNiceName(final OoTItem item) {
        switch (item) {
            case DEKU_STICK:
                return "Deku Stick";
            case DEKU_STICK_UPGRADE:
                return "Deku Stick Upgrade";
            case DEKU_NUT:
                return "Deku Nuts";
            case DEKU_NUT_UPGRADE:
                return "Deku Nut Upgrade";
            case PROGRESSIVE_SLINGSHOT:
                return "Progressive Slingshot";
            case BOMB:
                return "Bombs";
            case PROGRESSIVE_BOMB_BAG:
                return "Progressive Bomb Bag";
            case BOMBCHU:
                return "Bombchus";
            case BOOMERANG:
                return "Boomerang";
            case PROGRESSIVE_OCARINA:
                return "Progressive Ocarina";
            case MAGIC_BEANS:
                return "Magic Beans";
            case PROGRESSIVE_BOW:
                return "Progressive Bow";
            case FIRE_ARROW:
                return "Fire Arrows";
            case ICE_ARROW:
                return "Ice Arrows";
            case LIGHT_ARROW:
                return "Light Arrows";
            case PROGRESSIVE_HOOKSHOT:
                return "Progressive Hookshot";
            case MEGATON_HAMMER:
                return "Megaton Hammer";
            case LENS_OF_TRUTH:
                return "Lens of Truth";
            case DINS_FIRE:
                return "Din's Fire";
            case FARORES_WIND:
                return "Farore's Wind";
            case NAYRUS_LOVE:
                return "Nayru's Love";
            case KOKIRI_SWORD:
                return "Kokiri Sword";
            case MASTER_SWORD:
                return "Master Sword";
            case GIANTS_KNIFE:
                return "Giant's Knife";
            case BIGGORONS_SWORD:
                return "Biggoron's Sword";
            case DEKU_SHIELD:
                return "Deku Shield";
            case HYLIAN_SHIELD:
                return "Hylian Shield";
            case MIRROR_SHIELD:
                return "Mirror Shield";
            case GORON_TUNIC:
                return "Goron Tunic";
            case ZORA_TUNIC:
                return "Zora Tunic";
            case IRON_BOOTS:
                return "Iron Boots";
            case HOVER_BOOTS:
                return "Hover Boots";
            case PROGRESSIVE_STRENGTH:
                return "Progressive Strength";
            case PROGRESSIVE_SCALE:
                return "Progressive Scale";
            case PROGRESSIVE_WALLET:
                return "Progressive Wallet";
            case GERUDO_MEMBERSHIP_CARD:
                return "Gerudo Membership Card";
            case STONE_OF_AGONY:
                return "Stone of Agony";
            case BOTTLE:
                return "Bottle";
            case BOTTLE_RUTOS_LETTER:
                return "Bottle with Ruto's Letter";
            case BOTTLE_FULL_MILK:
                return "Bottle with Milk";
            case BOTTLE_HALF_MILK:
                return "Bottle with half Milk";
            case BOTTLE_RED_POTION:
                return "Bottle with Red Potion";
            case BOTTLE_GREEN_POTION:
                return "Bottle with Green Potion";
            case BOTTLE_BLUE_POTION:
                return "Bottle with Blue Potion";
            case BOTTLE_FAIRY:
                return "Bottle with Fairy";
            case BOTTLE_BLUE_FIRE:
                return "Bottle with Blue Fire";
            case BOTTLE_FISH:
                return "Bottle with Fish";
            case BOTTLE_BUGS:
                return "Bottle with Bugs";
            case BOTTLE_POE:
                return "Bottle with Poe";
            case BOTTLE_BIG_POE:
                return "Bottle with Big Poe";
            case PIECE_OF_HEART:
                return "Piece of Heart";
            case RECOVERY_HEART:
                return "Recovery Heart";
            case MAGIC_JAR_SMALL:
                return "Small Magic Jar";
            case MAGIC_JAR_LARGE:
                return "Large Magic Jar";
            case PROGRESSIVE_MAGIC:
                return "Progressive Magic";
            case DEKU_SEED:
                return "Deku Seeds";
            case ARROW:
                return "Arrows";
            case GREEN_RUPEE:
                return "Green Rupee";
            case BLUE_RUPEE:
                return "Blue Rupee";
            case RED_RUPEE:
                return "Red Rupee";
            case PURPLE_RUPEE:
                return "Purple Rupee";
            case SILVER_RUPEE:
                return "Silver Rupee";
            case YELLOW_RUPEE:
                return "Yellow Rupee";
            case ORANGE_RUPEE:
                return "Orange Rupee";
            case SKULLTULA_TOKEN:
                return "Skulltula Token";
            case ICE_TRAP:
                return "Ice Trap";
            case DUNGEON_MAP_DEKU_TREE:
                return "Dungeon Map Deku Tree";
            case DUNGEON_MAP_DODONGOS_CAVERN:
                return "Dungeon Map Dodongo's Cavern";
            case DUNGEON_MAP_JABU_JABU:
                return "Dungeon Map Jabu-Jabu";
            case DUNGEON_MAP_FOREST_TEMPLE:
                return "Dungeon Map Forest Temple";
            case DUNGEON_MAP_FIRE_TEMPLE:
                return "Dungeon Map Fire Temple";
            case DUNGEON_MAP_WATER_TEMPLE:
                return "Dungeon Map Water Temple";
            case DUNGEON_MAP_ICE_CAVERN:
                return "Dungeon Map Ice Cavern";
            case DUNGEON_MAP_BOTTOM_OF_THE_WELL:
                return "Dungeon Map Bottom of the Well";
            case DUNGEON_MAP_SHADOW_TEMPLE:
                return "Dungeon Map Shadow Temple";
            case DUNGEON_MAP_SPIRIT_TEMPLE:
                return "Dungeon Map Spirit Temple";
            case COMPASS_DEKU_TREE:
                return "Compass Deku Tree";
            case COMPASS_DODONGOS_CAVERN:
                return "Compass Dodongo's Cavern";
            case COMPASS_JABU_JABU:
                return "Compass Jabu-Jabu";
            case COMPASS_FOREST_TEMPLE:
                return "Compass Forest Temple";
            case COMPASS_FIRE_TEMPLE:
                return "Compass Fire Temple";
            case COMPASS_WATER_TEMPLE:
                return "Compass Water Temple";
            case COMPASS_ICE_CAVERN:
                return "Compass Ice Cavern";
            case COMPASS_BOTTOM_OF_THE_WELL:
                return "Compass Bottom of the Well";
            case COMPASS_SHADOW_TEMPLE:
                return "Compass Shadow Temple";
            case COMPASS_SPIRIT_TEMPLE:
                return "Compass Spirit Temple";
            case SMALL_KEY_FOREST_TEMPLE:
                return "Small Key Forest Temple";
            case SMALL_KEY_FIRE_TEMPLE:
                return "Small Key Fire Temple";
            case SMALL_KEY_WATER_TEMPLE:
                return "Small Key Water Temple";
            case SMALL_KEY_ICE_CAVERN:
                return "Small Key Ice Cavern";
            case SMALL_KEY_BOTTOM_OF_THE_WELL:
                return "Small Key Bottom of the Well";
            case SMALL_KEY_SHADOW_TEMPLE:
                return "Small Key Shadow Temple";
            case SMALL_KEY_SPIRIT_TEMPLE:
                return "Small Key Spirit Temple";
            case SMALL_KEY_GERUDO_TRAINING_GROUND:
                return "Small Key Gerudo Training Ground";
            case BOSS_KEY_FOREST_TEMPLE:
                return "Boss Key Forest Temple";
            case BOSS_KEY_FIRE_TEMPLE:
                return "Boss Key Fire Temple";
            case BOSS_KEY_WATER_TEMPLE:
                return "Boss Key Water Temple";
            case BOSS_KEY_SHADOW_TEMPLE:
                return "Boss Key Shadow Temple";
            case BOSS_KEY_SPIRIT_TEMPLE:
                return "Boss Key Spirit Temple";
            case SMALL_KEY_GANONS_CASTLE:
                return "Small Key Ganon's Castle";
            case BOSS_KEY_GANONS_CASTLE:
                return "Boss Key Ganon's Castle";
            case HEART_CONTAINER:
                return "Heart Container";
            case KEATON_MASK:
                return "Keaton Mask";
            case SKULL_MASK:
                return "Skull Mask";
            case SPOOKY_MASK:
                return "Spooky Mask";
            case BUNNY_HOOD:
                return "Bunny Hood";
            case MASK_OF_TRUTH:
                return "Mask of Truth";
            case GORON_MASK:
                return "Goron Mask";
            case ZORA_MASK:
                return "Zora Mask";
            case GERUDO_MASK:
                return "Gerudo Mask";
            case POCKET_EGG:
                return "Pocket Egg";
            case POCKET_CUCCO:
                return "Pocket Cucco";
            case COJIRO:
                return "Cojiro";
            case ODD_MUSHROOM:
                return "Odd Mushroom";
            case ODD_POTION:
                return "Odd Potion";
            case POACHERS_SAW:
                return "Poacher's Saw";
            case BROKEN_GORONS_SWORD:
                return "Broken Goron's Sword";
            case PRESCRIPTION:
                return "Prescription";
            case EYEBALL_FROG:
                return "Eyeball Frog";
            case EYE_DROPS:
                return "Eye Drops";
            case CLAIM_CHECK:
                return "Claim Check";
            case KOKIRIS_EMERALD:
                return "Kokiri's Emerald";
            case GORONS_RUBY:
                return "Goron's Ruby";
            case ZORAS_SAPPHIRE:
                return "Zora's Sapphire";
            case LIGHT_MEDALLION:
                return "Light Medallion";
            case FOREST_MEDALLION:
                return "Forest Medallion";
            case FIRE_MEDALLION:
                return "Fire Medallion";
            case WATER_MEDALLION:
                return "Water Medallion";
            case SHADOW_MEDALLION:
                return "Shadow Medallion";
            case SPIRIT_MEDALLION:
                return "Spirit Medallion";
            case WEIRD_EGG:
                return "Weird Egg";
            case CUCCO:
                return "Cucco";
            case ZELDAS_LETTER:
                return "Zelda's Letter";
            case KOKIRI_BOOTS:
                return "Kokiri Boots";
            case KOKIRI_TUNIC:
                return "Kokiri Tunic";
            case ZELDAS_LULLABY:
                return "Zelda's Lullaby";
            case EPONAS_SONG:
                return "Epona's Song";
            case SARIAS_SONG:
                return "Saria's Song";
            case SUNS_SONG:
                return "Sun's Song";
            case SONG_OF_TIME:
                return "Song of Time";
            case SONG_OF_STORMS:
                return "Song of Storms";
            case MINUET_OF_FOREST:
                return "Minuet of Forest";
            case BOLERO_OF_FIRE:
                return "Bolero of Fire";
            case SERENADE_OF_WATER:
                return "Serenade of Water";
            case NOCTURNE_OF_SHADOW:
                return "Nocturne of Shadow";
            case REQUIEM_OF_SPIRIT:
                return "Requiem of Spirit";
            case PRELUDE_OF_LIGHT:
                return "Prelude of Light";
            case SCARECROWS_SONG:
                return "Scarecrow's Song";
            case DOUBLE_HEARTS:
                return "Double Hearts";
            case REFILL_FULL_MILK:
                return "Milk";
            case REFILL_HALF_MILK:
                return "Half Milk";
            case REFILL_RED_POTION:
                return "Red Potion";
            case REFILL_GREEN_POTION:
                return "Green Potion";
            case REFILL_BLUE_POTION:
                return "Blue Potion";
            case REFILL_FAIRY:
                return "Fairy";
            case REFILL_BLUE_FIRE:
                return "Blue Fire";
            case REFILL_FISH:
                return "Fish";
            case REFILL_BUGS:
                return "Bugs";
            case REFILL_POE:
                return "Poe";
            default:
                throw new IllegalStateException("Unknown OoTItem: " + item.name());
        }
    }

    public static boolean canAppearAsSpecialOfferInShop(final OoTItem item) {
        switch (item) {
            case DEKU_STICK_UPGRADE:
            case DEKU_NUT_UPGRADE:
            case PROGRESSIVE_SLINGSHOT:
            case PROGRESSIVE_BOMB_BAG:
            case BOMBCHU:
            case BOOMERANG:
            case PROGRESSIVE_OCARINA:
            case MAGIC_BEANS:
            case PROGRESSIVE_BOW:
            case FIRE_ARROW:
            case ICE_ARROW:
            case LIGHT_ARROW:
            case PROGRESSIVE_HOOKSHOT:
            case MEGATON_HAMMER:
            case LENS_OF_TRUTH:
            case DINS_FIRE:
            case FARORES_WIND:
            case NAYRUS_LOVE:
            case KOKIRI_SWORD:
            case GIANTS_KNIFE:
            case BIGGORONS_SWORD:
            case DEKU_SHIELD:
            case HYLIAN_SHIELD:
            case MIRROR_SHIELD:
            case GORON_TUNIC:
            case ZORA_TUNIC:
            case IRON_BOOTS:
            case HOVER_BOOTS:
            case PROGRESSIVE_STRENGTH:
            case PROGRESSIVE_SCALE:
            case PROGRESSIVE_WALLET:
            case GERUDO_MEMBERSHIP_CARD:
            case STONE_OF_AGONY:
            case BOTTLE:
            case BOTTLE_RUTOS_LETTER:
            case BOTTLE_FULL_MILK:
            case BOTTLE_HALF_MILK:
            case BOTTLE_RED_POTION:
            case BOTTLE_GREEN_POTION:
            case BOTTLE_BLUE_POTION:
            case BOTTLE_FAIRY:
            case BOTTLE_BLUE_FIRE:
            case BOTTLE_FISH:
            case BOTTLE_BUGS:
            case BOTTLE_POE:
            case BOTTLE_BIG_POE:
            case PIECE_OF_HEART:
            case ICE_TRAP:
            case ZELDAS_LULLABY:
            case EPONAS_SONG:
            case SARIAS_SONG:
            case SUNS_SONG:
            case SONG_OF_TIME:
            case SONG_OF_STORMS:
            case MINUET_OF_FOREST:
            case BOLERO_OF_FIRE:
            case SERENADE_OF_WATER:
            case NOCTURNE_OF_SHADOW:
            case REQUIEM_OF_SPIRIT:
            case PRELUDE_OF_LIGHT:
            case SKULLTULA_TOKEN:
            case DUNGEON_MAP_DEKU_TREE:
            case DUNGEON_MAP_DODONGOS_CAVERN:
            case DUNGEON_MAP_JABU_JABU:
            case DUNGEON_MAP_FOREST_TEMPLE:
            case DUNGEON_MAP_FIRE_TEMPLE:
            case DUNGEON_MAP_WATER_TEMPLE:
            case DUNGEON_MAP_ICE_CAVERN:
            case DUNGEON_MAP_BOTTOM_OF_THE_WELL:
            case DUNGEON_MAP_SHADOW_TEMPLE:
            case DUNGEON_MAP_SPIRIT_TEMPLE:
            case COMPASS_DEKU_TREE:
            case COMPASS_DODONGOS_CAVERN:
            case COMPASS_JABU_JABU:
            case COMPASS_FOREST_TEMPLE:
            case COMPASS_FIRE_TEMPLE:
            case COMPASS_WATER_TEMPLE:
            case COMPASS_ICE_CAVERN:
            case COMPASS_BOTTOM_OF_THE_WELL:
            case COMPASS_SHADOW_TEMPLE:
            case COMPASS_SPIRIT_TEMPLE:
            case SMALL_KEY_FOREST_TEMPLE:
            case SMALL_KEY_FIRE_TEMPLE:
            case SMALL_KEY_WATER_TEMPLE:
            case SMALL_KEY_ICE_CAVERN:
            case SMALL_KEY_BOTTOM_OF_THE_WELL:
            case SMALL_KEY_SHADOW_TEMPLE:
            case SMALL_KEY_SPIRIT_TEMPLE:
            case SMALL_KEY_GERUDO_TRAINING_GROUND:
            case BOSS_KEY_FOREST_TEMPLE:
            case BOSS_KEY_FIRE_TEMPLE:
            case BOSS_KEY_WATER_TEMPLE:
            case BOSS_KEY_SHADOW_TEMPLE:
            case BOSS_KEY_SPIRIT_TEMPLE:
            case SMALL_KEY_GANONS_CASTLE:
            case BOSS_KEY_GANONS_CASTLE:
            case HEART_CONTAINER:
            case PROGRESSIVE_MAGIC:
            case DOUBLE_HEARTS:
                return true;
            default:
                return false;
        }
    }

    public static boolean canAppearAsNormalOfferInShop(final OoTItem item) {
        switch (item) {
            case BOMBCHU:
            case DEKU_SHIELD:
            case HYLIAN_SHIELD:
            case GORON_TUNIC:
            case ZORA_TUNIC:
            case RECOVERY_HEART:
            case DEKU_STICK:
            case DEKU_NUT:
            case BOMB:
            case DEKU_SEED:
            case ARROW:
            case REFILL_FULL_MILK:
            case REFILL_HALF_MILK:
            case REFILL_RED_POTION:
            case REFILL_GREEN_POTION:
            case REFILL_BLUE_POTION:
            case REFILL_FAIRY:
            case REFILL_BLUE_FIRE:
            case REFILL_FISH:
            case REFILL_BUGS:
            case REFILL_POE:
                return true;
            default:
                return false;
        }
    }

    public static boolean canBeMultiple(final OoTItem item) {
        switch (item) {
            case DEKU_NUT:
            case BOMB:
            case BOMBCHU:
            case MAGIC_BEANS:
            case DEKU_SEED:
            case ARROW:
                return true;
            default:
                return false;
        }
    }

    public static int[] getPossibleAmounts(final OoTItem item) {
        int[] amounts = null;
        if (canBeMultiple(item)) {
            switch (item) {
                case DEKU_NUT:
                    amounts = new int[2];
                    amounts[0] = 5;
                    amounts[1] = 10;
                case BOMB:
                    amounts = new int[4];
                    amounts[0] = 5;
                    amounts[1] = 10;
                    amounts[2] = 20;
                    amounts[3] = 30;
                case BOMBCHU:
                    amounts = new int[3];
                    amounts[0] = 5;
                    amounts[1] = 10;
                    amounts[2] = 20;
                case MAGIC_BEANS:
                    amounts = new int[2];
                    amounts[0] = 1;
                    amounts[1] = 10;
                case DEKU_SEED:
                    amounts = new int[1];
                    amounts[0] = 30;
                case ARROW:
                    amounts = new int[3];
                    amounts[0] = 10;
                    amounts[1] = 30;
                    amounts[2] = 50;
            }
        }
        if (amounts == null) {
            amounts = new int[1];
            amounts[0] = 1;
        }
        return amounts;
    }

    public static boolean isSong(final OoTItem item) {
        switch (item) {
            case ZELDAS_LULLABY:
            case EPONAS_SONG:
            case SARIAS_SONG:
            case SUNS_SONG:
            case SONG_OF_TIME:
            case SONG_OF_STORMS:
            case MINUET_OF_FOREST:
            case BOLERO_OF_FIRE:
            case SERENADE_OF_WATER:
            case NOCTURNE_OF_SHADOW:
            case REQUIEM_OF_SPIRIT:
            case PRELUDE_OF_LIGHT:
            case SCARECROWS_SONG:
                return true;
            default:
                return false;
        }
    }

    public static boolean isMainSong(final OoTItem item) {
        if (item == OoTItem.SCARECROWS_SONG) {
            return false;
        }
        return isSong(item);
    }

    public static boolean isWarpSong(final OoTItem item) {
        switch (item) {
            case MINUET_OF_FOREST:
            case BOLERO_OF_FIRE:
            case SERENADE_OF_WATER:
            case NOCTURNE_OF_SHADOW:
            case REQUIEM_OF_SPIRIT:
            case PRELUDE_OF_LIGHT:
                return true;
            default:
                return false;
        }
    }

    public static boolean isMask(final OoTItem item) {
        switch (item) {
            case KEATON_MASK:
            case SKULL_MASK:
            case SPOOKY_MASK:
            case BUNNY_HOOD:
            case MASK_OF_TRUTH:
            case GORON_MASK:
            case ZORA_MASK:
            case GERUDO_MASK:
                return true;
            default:
                return false;
        }
    }

    public static boolean isCompass(final OoTItem item) {
        switch (item) {
            case COMPASS_DEKU_TREE:
            case COMPASS_DODONGOS_CAVERN:
            case COMPASS_JABU_JABU:
            case COMPASS_FOREST_TEMPLE:
            case COMPASS_FIRE_TEMPLE:
            case COMPASS_WATER_TEMPLE:
            case COMPASS_ICE_CAVERN:
            case COMPASS_BOTTOM_OF_THE_WELL:
            case COMPASS_SHADOW_TEMPLE:
            case COMPASS_SPIRIT_TEMPLE:
                return true;
            default:
                return false;
        }
    }

    public static boolean isMap(final OoTItem item) {
        switch (item) {
            case DUNGEON_MAP_DEKU_TREE:
            case DUNGEON_MAP_DODONGOS_CAVERN:
            case DUNGEON_MAP_JABU_JABU:
            case DUNGEON_MAP_FOREST_TEMPLE:
            case DUNGEON_MAP_FIRE_TEMPLE:
            case DUNGEON_MAP_WATER_TEMPLE:
            case DUNGEON_MAP_ICE_CAVERN:
            case DUNGEON_MAP_BOTTOM_OF_THE_WELL:
            case DUNGEON_MAP_SHADOW_TEMPLE:
            case DUNGEON_MAP_SPIRIT_TEMPLE:
                return true;
            default:
                return false;
        }
    }

    public static boolean isSmallKey(final OoTItem item) {
        switch (item) {
            case SMALL_KEY_FOREST_TEMPLE:
            case SMALL_KEY_FIRE_TEMPLE:
            case SMALL_KEY_WATER_TEMPLE:
            case SMALL_KEY_ICE_CAVERN:
            case SMALL_KEY_BOTTOM_OF_THE_WELL:
            case SMALL_KEY_SHADOW_TEMPLE:
            case SMALL_KEY_SPIRIT_TEMPLE:
            case SMALL_KEY_GERUDO_TRAINING_GROUND:
            case SMALL_KEY_GANONS_CASTLE:
                return true;
            default:
                return false;
        }
    }

    public static boolean isBossKey(final OoTItem item) {
        switch (item) {
            case BOSS_KEY_FOREST_TEMPLE:
            case BOSS_KEY_FIRE_TEMPLE:
            case BOSS_KEY_WATER_TEMPLE:
            case BOSS_KEY_SHADOW_TEMPLE:
            case BOSS_KEY_SPIRIT_TEMPLE:
            case BOSS_KEY_GANONS_CASTLE:
                return true;
            default:
                return false;
        }
    }

    public static boolean isRupee(final OoTItem item) {
        switch (item) {
            case GREEN_RUPEE:
            case BLUE_RUPEE:
            case RED_RUPEE:
            case PURPLE_RUPEE:
            case SILVER_RUPEE:
            case YELLOW_RUPEE:
            case ORANGE_RUPEE:
                return true;
            default:
                return false;
        }
    }

    public static boolean isDungeonReward(final OoTItem item) {
        return isSpiritualStone(item) || isMedallion(item);
    }

    public static boolean isSpiritualStone(final OoTItem item) {
        switch (item) {
            case KOKIRIS_EMERALD:
            case GORONS_RUBY:
            case ZORAS_SAPPHIRE:
                return true;
            default:
                return false;
        }
    }

    public static boolean isMedallion(final OoTItem item) {
        switch (item) {
            case LIGHT_MEDALLION:
            case FOREST_MEDALLION:
            case FIRE_MEDALLION:
            case WATER_MEDALLION:
            case SHADOW_MEDALLION:
            case SPIRIT_MEDALLION:
                return true;
            default:
                return false;
        }
    }

    public static boolean isChildTradingSequenceItem(final OoTItem item) {
        switch (item) {
            case WEIRD_EGG:
            case CUCCO:
            case ZELDAS_LETTER:
                return true;
            default:
                return isMask(item);
        }
    }

    public static boolean isAdultTradingSequenceItem(final OoTItem item) {
        switch (item) {
            case POCKET_EGG:
            case POCKET_CUCCO:
            case COJIRO:
            case ODD_MUSHROOM:
            case ODD_POTION:
            case POACHERS_SAW:
            case BROKEN_GORONS_SWORD:
            case PRESCRIPTION:
            case EYEBALL_FROG:
            case EYE_DROPS:
            case CLAIM_CHECK:
                return true;
            default:
                return false;
        }
    }
}
