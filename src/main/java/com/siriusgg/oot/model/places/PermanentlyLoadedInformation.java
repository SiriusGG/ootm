package com.siriusgg.oot.model.places;

public class PermanentlyLoadedInformation {
    private static PermanentlyLoadedInformation pli = null;

    private final String[] additionalConnections = {
            "LinksHouse",
            "TempleOfTime",
            "DampesGrave",
            "KakarikoMagicPotionShop"
    };
    private final String[] dungeons = {
            "InsideTheDekuTree",
            "DodongosCavern",
            "InsideJabuJabusBelly",
            "ForestTemple",
            "FireTemple",
            "IceCavern",
            "WaterTemple",
            "BottomOfTheWell",
            "ShadowTemple",
            "GerudoTrainingGround",
            "SpiritTemple",
            "InsideGanonsCastle"
    };
    private final String[] overworld = {
            "KokiriForest",
            "LostWoods",
            "HyruleField",
            "MarketEntrance",
            "Market",
            "ToTEntrance",
            "HyruleCastle",
            "LonLonRanch",
            "KakarikoVillage",
            "Graveyard",
            "DeathMountainTrail",
            "SacredForestMeadow",
            "GoronCity",
            "DeathMountainCrater",
            "ZorasRiver",
            "ZorasDomain",
            "LakeHylia",
            "ZorasFountain",
            "GerudoValley",
            "GerudosFortress",
            "HauntedWasteland",
            "DesertColossus"
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
}
