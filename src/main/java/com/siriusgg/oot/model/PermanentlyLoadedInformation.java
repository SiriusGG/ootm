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
            "Ship of Harkinian",
            "Kevsmatrix"
    };
    private final String[] additionalConnections = {
            "DampesGrave",
            "KakarikoPotionShop",
            "LinksHouse",
            "TempleOfTime",
            "ThievesHideout",
            "Windmill",
    };
    private final String[] adultOnlyConnections = {
            "GerudosFortress",
            "HauntedWasteland"
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
    private final String[] niceAdditionalConnections = {
            "Dampe's Grave",
            "Kakariko Potion Shop",
            "Link's House",
            "Temple of Time",
            "Thieves' Hideout",
            "Windmill",
    };
    private final String[] niceDungeons = {
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
    private final String[] niceGrottos = {
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
    private final String[] niceOverworld = {
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
    private final String[] zoom = {
            "ThievesHideoutOutside"
    };
    private final String[] niceZoom = {
            "Thieves' Hideout Outside"
    };
    private final String[] placesWithMap = {
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
    private final String[] niceAdultOnlyConnections = {
            "Gerudo's Fortress",
            "Haunted Wasteland"
    };
    private final String[] nicePlacesWithMap = {
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
    private final String[] niceNonOverworldExtraPlaces = {
            "Kakariko Potion Shop (Front)",
            "Kakariko Potion Shop (Back)"
    };
    private final String[] niceDoors = {
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
    private final String[] niceOwlStarts = {
            "Death Mountain Trail",
            "Lake Hylia"
    };
    private final String[] niceOwlLandings = {
            "Kakariko Village",
            "Hyrule Field"
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

    public String[] getAdultOnlyConnections() {
        return adultOnlyConnections;
    }

    public String[] getNiceAdultOnlyConnections() {
        return niceAdultOnlyConnections;
    }

    public String[] getNiceAdditionalConnections() {
        return niceAdditionalConnections;
    }

    public String[] getNiceDoors() {
        return niceDoors;
    }

    public String[] getDungeons() {
        return dungeons;
    }

    public String[] getNiceDungeons() {
        return niceDungeons;
    }

    public String[] getNiceGrottos() {
        return niceGrottos;
    }

    public String[] getOverworlds() {
        return overworld;
    }

    public String[] getNiceOverworlds() {
        return niceOverworld;
    }

    public String[] getNiceOwlStarts() {
        return niceOwlStarts;
    }

    public String[] getNiceOwlLandings() {
        return niceOwlLandings;
    }

    public String[] getZoom() {
        return zoom;
    }

    public String[] getPlacesWithMap() {
        return placesWithMap;
    }

    public String[] getNicePlacesWithMap() {
        return nicePlacesWithMap;
    }

    public String[] getNiceNonOverworldExtraPlaces() {
        return niceNonOverworldExtraPlaces;
    }

    public String[] getNiceZoom() {
        return niceZoom;
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

    public int getSelectablePlacesAmount() {
        return 40; // to exclude 'Zoom' areas from the manually selectable list.
    }
}
