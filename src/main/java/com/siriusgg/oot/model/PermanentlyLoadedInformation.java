package com.siriusgg.oot.model;

public class PermanentlyLoadedInformation {
    private static PermanentlyLoadedInformation pli = null;

    private final String[] developers = {
            "Sirius GG"
    };
    private final String[] mapsCreators = {
            "Peardian",
            "Sirius GG"
    };
    private final String[] mapsOrigins = {
            "VGMaps.com"
    };
    private final String[] extraSpecialThanks = {
            "Ship of Harkinian"
    };
    private final String[] additionalConnections = {
            "DampesGrave",
            "KakarikoMagicPotionShop",
            "LinksHouse",
            "TempleOfTime",
            "ThievesHideout",
            "Windmill"
    };
    private final String[] dungeons = {
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
    private final String[] overworld = {
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
    private final String[] placesWithMap = {
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
            "Kakariko Magic Potion Shop",
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
            "Zora's River"
    };

    private PermanentlyLoadedInformation() {}

    public static PermanentlyLoadedInformation getInstance() {
        if (pli == null) {
            pli = new PermanentlyLoadedInformation();
        }
        return pli;
    }

    public String[] getAdditionalConnections() {
        return additionalConnections;
    }

    public String[] getDungeons() {
        return dungeons;
    }

    public String[] getOverworld() {
        return overworld;
    }

    public String[] getPlacesWithMap() {
        return placesWithMap;
    }

    public String[] getDevelopers() {
        return developers;
    }

    public String[] getMapsCreators() {
        return mapsCreators;
    }

    public String[] getMapsOrigins() {
        return mapsOrigins;
    }

    public String[] getExtraSpecialThanks() {
        return extraSpecialThanks;
    }
}
