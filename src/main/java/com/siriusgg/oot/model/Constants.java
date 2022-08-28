package com.siriusgg.oot.model;

import com.siriusgg.oot.model.util.StringFunctions;

import java.awt.*;

public class Constants {
    public static final String VERSION = "1.0.0";
    public static final String USER_HOME = StringFunctions.toForwardSlashes(System.getProperty("user.home"));
    public static final String ADDITIONAL_CONNECTIONS_DIRECTORY = "graphics/maps/additional_connections";
    public static final String ADULT_ONLY_DIRECTORY = "graphics/maps/adult_only";
    public static final String DUNGEONS_DIRECTORY = "graphics/maps/dungeons";
    public static final String OVERWORLD_DIRECTORY = "graphics/maps/overworld";
    public static final String ZOOM_DIRECTORY = "graphics/maps/zoom";
    public static final String SYMBOL_DIRECTORY = "graphics/symbols";
    public static final String MAP_GRAPHIC_EXTENSION = ".jpg";
    public static final String SYMBOL_EXTENSION = ".jpg";
    public static final String SAVE_DIRECTORY = ".ootm";
    public static final String SETTINGS_FILE = "settings.ini";
    public static final String EXIT_FILE_EXTENSION = ".exits";
    public static final int DOUBLE_CLICK_MAX_DELAY =
            (int) Toolkit.getDefaultToolkit().getDesktopProperty("awt.multiClickInterval");
    public static final int SELECTABLE_PLACES_AMOUNT = 40;
    public static final String[] DEVELOPERS = {"Sirius GG"};
    public static final String[] MAPS_CREATORS = {
            "Peardian",
            "Sirius GG"
    };
    public static final String[] MAPS_ORIGINS = {"VGMaps.com"};
    public static final String[] EXTRA_SPECIAL_THANKS = {
            "Ship of Harkinian",
            "Kevsmatrix"
    };
    public static final String[] ADDITIONAL_CONNECTIONS = {
            "DampesGrave",
            "KakarikoPotionShop",
            "LinksHouse",
            "TempleOfTime",
            "ThievesHideout",
            "Windmill"
    };
    public static final String[] ADULT_ONLY_CONNECTIONS = {
            "GerudosFortress",
            "HauntedWasteland"
    };
    public static final String[] DUNGEONS = {
            "BottomOfTheWell",
            "DodongosCavern",
            "FireTemple",
            "ForestTemple",
            "GerudoTrainingGround",
            "IceCavern",
            "InsideGanonsCastle",
            "InsideJabuJabusBelly",
            "InsideTheDekuTree",
            "ShadowTemple",
            "SpiritTemple",
            "WaterTemple"
    };
    public static final String[] NICE_ADDITIONAL_CONNECTIONS = {
            "Dampe's Grave",
            "Kakariko Potion Shop",
            "Link's House",
            "Temple of Time",
            "Thieves' Hideout",
            "Windmill"
    };
    public static final String[] NICE_DUNGEONS = {
            "Bottom of the Well",
            "Dodongo's Cavern",
            "Fire Temple",
            "Forest Temple",
            "Gerudo Training Ground",
            "Ice Cavern",
            "Inside Ganon's Castle",
            "Inside Jabu-Jabu's Belly",
            "Inside the Deku Tree",
            "Shadow Temple",
            "Spirit Temple",
            "Water Temple"
    };
    public static final String[] NICE_GROTTOS = {
            "Kokiri Forest Storms Grotto",
            "Lost Woods Near Shortcuts Grotto",
            "Deku Theater",
            "Lost Woods Scrubs Grotto",
            "Sacred Forest Meadow Wolfos Grotto",
            "Sacred Forest Meadow Fairy Grotto",
            "Sacred Forest Meadow Storms Grotto",
            "Hyrule Field South-East Grotto",
            "Hyrule Field Open Grotto",
            "Hyrule Field Inside Fence Grotto",
            "Hyrule Field Cow Grotto",
            "Hyrule Field Near Market Grotto",
            "Hyrule Field Fairy Grotto",
            "Hyrule Field Near Kakariko Grotto",
            "Hyrule Field Tektite Grotto",
            "Hyrule Castle Storms Grotto",
            "Lon Lon Ranch Grotto",
            "Kakariko Redead Grotto",
            "Kakariko Open Grotto",
            "Graveyard Shield Grave",
            "Graveyard Heart Piece Grave",
            "Graveyard Royal Family's Tomb",
            "Dampe's Grave",
            "Death Mountain Trail Storms Grotto",
            "Death Mountain Trail Cow Grotto",
            "Goron City Grotto",
            "DMC Upper Grotto",
            "DMC Hammer Grotto",
            "Zora's River Open Grotto",
            "Zora's River Fairy Grotto",
            "Zora's River Storms Grotto",
            "Zora's Domain Storms Grotto",
            "Lake Hylia Grotto",
            "Gerudo Valley Storms Grotto",
            "Gerudo Valley Octorok Grotto",
            "Gerudo's Fortress Storms Grotto",
            "Colossus Grotto"
    };
    public static final String[] OVERWORLDS = {
            "DeathMountainCrater",
            "DeathMountainTrail",
            "DesertColossus",
            "GerudosFortress",
            "GerudoValley",
            "GoronCity",
            "Graveyard",
            "HauntedWasteland",
            "HyruleCastle",
            "HyruleField",
            "KakarikoVillage",
            "KokiriForest",
            "LakeHylia",
            "LonLonRanch",
            "LostWoods",
            "Market",
            "MarketEntrance",
            "SacredForestMeadow",
            "TempleOfTimeEntrance",
            "ZorasDomain",
            "ZorasFountain",
            "ZorasRiver"
    };
    public static final String[] NICE_OVERWORLDS = {
            "Death Mountain Crater",
            "Death Mountain Trail",
            "Desert Colossus",
            "Gerudo's Fortress",
            "Gerudo Valley",
            "Goron City",
            "Graveyard",
            "Haunted Wasteland",
            "Hyrule Castle",
            "Hyrule Field",
            "Kakariko Village",
            "Kokiri Forest",
            "Lake Hylia",
            "Lon Lon Ranch",
            "Lost Woods",
            "Market",
            "Market Entrance",
            "Sacred Forest Meadow",
            "Temple of Time Entrance",
            "Zora's Domain",
            "Zora's Fountain",
            "Zora's River"
    };
    public static final String[] NICE_OVERWORLDS_WITH_DOOR = {
            "Death Mountain Crater",
            "Death Mountain Trail",
            "Desert Colossus",
            "Gerudo Valley",
            "Goron City",
            "Graveyard",
            "Hyrule Castle",
            "Kakariko Village",
            "Kokiri Forest",
            "Lake Hylia",
            "Lon Lon Ranch",
            "Market",
            "Market Entrance",
            "Temple of Time Entrance",
            "Zora's Domain",
            "Zora's Fountain"
    };
    public static final String[] NICE_OVERWORLDS_WITH_DUNGEON = {
            "Death Mountain Crater",
            "Death Mountain Trail",
            "Desert Colossus",
            "Gerudo's Fortress",
            "Graveyard",
            "Hyrule Castle",
            "Kakariko Village",
            "Kokiri Forest",
            "Lake Hylia",
            "Sacred Forest Meadow",
            "Zora's Fountain"
    };
    public static final String[] NICE_OVERWORLDS_WITH_GROTTO = {
            "Death Mountain Crater",
            "Death Mountain Trail",
            "Desert Colossus",
            "Gerudo's Fortress",
            "Gerudo Valley",
            "Goron City",
            "Graveyard",
            "Hyrule Castle",
            "Hyrule Field",
            "Kakariko Village",
            "Kokiri Forest",
            "Lake Hylia",
            "Lon Lon Ranch",
            "Lost Woods",
            "Sacred Forest Meadow",
            "Zora's Domain",
            "Zora's River"
    };
    public static final String[] NON_OVERWORLD_EXTRA_PLACES = {
            "KakarikoPotionShopFront",
            "KakarikoPotionShopBack"
    };
    public static final String[] ZOOM = {"ThievesHideoutOutside"};
    public static final String[] NICE_ZOOM = {"Thieves' Hideout Outside"};
    public static final String[] PLACES_WITH_MAP = {
            "BottomOfTheWell",
            "DampesGrave",
            "DeathMountainCrater",
            "DeathMountainTrail",
            "DesertColossus",
            "DodongosCavern",
            "FireTemple",
            "ForestTemple",
            "GerudosFortress",
            "GerudoTrainingGround",
            "GerudoValley",
            "GoronCity",
            "Graveyard",
            "HauntedWasteland",
            "HyruleCastle",
            "HyruleField",
            "IceCavern",
            "InsideGanonsCastle",
            "InsideJabuJabusBelly",
            "InsideTheDekuTree",
            "KakarikoPotionShop",
            "KakarikoVillage",
            "KokiriForest",
            "LakeHylia",
            "LinksHouse",
            "LonLonRanch",
            "LostWoods",
            "Market",
            "MarketEntrance",
            "SacredForestMeadow",
            "ShadowTemple",
            "SpiritTemple",
            "TempleOfTime",
            "TempleOfTimeEntrance",
            "ThievesHideout",
            "WaterTemple",
            "Windmill",
            "ZorasDomain",
            "ZorasFountain",
            "ZorasRiver",
            // Zoom areas
            "ThievesHideoutOutside"
    };
    public static final String[] NICE_ADULT_ONLY_CONNECTIONS = {
            "Gerudo's Fortress",
            "Haunted Wasteland"
    };
    public static final String[] NICE_PLACES_WITH_MAP = {
            "Bottom of the Well",
            "Dampe's Grave",
            "Death Mountain Crater",
            "Death Mountain Trail",
            "Desert Colossus",
            "Dodongo's Cavern",
            "Fire Temple",
            "Forest Temple",
            "Gerudo's Fortress",
            "Gerudo Training Ground",
            "Gerudo Valley",
            "Goron City",
            "Graveyard",
            "Haunted Wasteland",
            "Hyrule Castle",
            "Hyrule Field",
            "Ice Cavern",
            "Inside Ganon's Castle",
            "Inside Jabu-Jabu's Belly",
            "Inside the Deku Tree",
            "Kakariko Potion Shop",
            "Kakariko Village",
            "Kokiri Forest",
            "Lake Hylia",
            "Link's House",
            "Lon Lon Ranch",
            "Lost Woods",
            "Market",
            "Market Entrance",
            "Sacred Forest Meadow",
            "Shadow Temple",
            "Spirit Temple",
            "Temple of Time",
            "Temple of Time Entrance",
            "Thieves' Hideout",
            "Water Temple",
            "Windmill",
            "Zora's Domain",
            "Zora's Fountain",
            "Zora's River",
            // Zoom areas
            "Thieves' Hideout Outside"
    };
    public static final String[] NICE_NON_OVERWORLD_EXTRA_PLACES = {
            "Kakariko Potion Shop (Front)",
            "Kakariko Potion Shop (Back)"
    };
    public static final String[] NICE_DOORS = {
            "Link's House",
            "Mido's House",
            "Saria's House",
            "House of Twins",
            "Know-It-All House",
            "Kokiri Shop",
            "Guard House",
            "Treasure Chest Game",
            "Bombchu Shop",
            "Man-in-Green House",
            "Bombchu Bowling",
            "Market Shooting Gallery",
            "Mask Shop",
            "Market Potion Shop",
            "Market Bazaar",
            "Temple of Time",
            "Hyrule Castle Great Fairy",
            "Ganon's Castle Great Fairy",
            "Talon's House",
            "Stables",
            "Tower",
            "Carpenter Boss' House",
            "House of Skulltula",
            "Impa's House (Front)",
            "Windmill",
            "Kakariko Bazaar",
            "Kakariko Shooting Gallery",
            "Kakariko Potion Shop (Front)",
            "Odd Medicine Building",
            "Kakariko Potion Shop (Back)",
            "Impa's House (Back)",
            "Dampe's House",
            "Death Mountain Trail Great Fairy",
            "Goron Shop",
            "Death Mountain Crater Great Fairy",
            "Zora Shop",
            "Fishing Hole",
            "Lakeside Laboratory",
            "Zora's Fountain Great Fairy",
            "Carpenter Tent",
            "Colossus Great Fairy"
    };
    public static final String[] NICE_OWL_STARTS = {
            "Death Mountain Trail",
            "Lake Hylia"
    };
    public static final String[] NICE_OWL_LANDINGS = {
            "Kakariko Village",
            "Hyrule Field"
    };

    private Constants() {}
}
