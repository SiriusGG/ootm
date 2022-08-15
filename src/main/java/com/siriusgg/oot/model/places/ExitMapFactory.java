package com.siriusgg.oot.model.places;

import com.siriusgg.oot.model.PermanentlyLoadedInformation;
import com.siriusgg.oot.model.places.exitmaps.*;

public class ExitMapFactory {

    public static ExitMap buildExitMapByClass(final Class destinationExitMap, final String seedName) {
        switch (destinationExitMap.getSimpleName()) {
            case "BottomOfTheWell": return new BottomOfTheWell(seedName);
            case "DampesGrave": return new DampesGrave(seedName);
            case "DeathMountainCrater": return new DeathMountainCrater(seedName);
            case "DeathMountainTrail": return new DeathMountainTrail(seedName);
            case "DesertColossus": return new DesertColossus(seedName);
            case "DodongosCavern": return new DodongosCavern(seedName);
            case "FireTemple": return new FireTemple(seedName);
            case "ForestTemple": return new ForestTemple(seedName);
            case "GerudosFortress": return new GerudosFortress(seedName);
            case "GerudoTrainingGround": return new GerudoTrainingGround(seedName);
            case "GerudoValley": return new GerudoValley(seedName);
            case "GoronCity": return new GoronCity(seedName);
            case "Graveyard": return new Graveyard(seedName);
            case "HauntedWasteland": return new HauntedWasteland(seedName);
            case "HyruleCastle": return new HyruleCastle(seedName);
            case "HyruleField": return new HyruleField(seedName);
            case "IceCavern": return new IceCavern(seedName);
            case "InsideGanonsCastle": return new InsideGanonsCastle(seedName);
            case "InsideJabuJabusBelly": return new InsideJabuJabusBelly(seedName);
            case "InsideTheDekuTree": return new InsideTheDekuTree(seedName);
            case "KakarikoPotionShop":
            case "KakarikoPotionShopFront":
            case "KakarikoPotionShopBack": return new KakarikoPotionShop(seedName);
            case "KakarikoVillage": return new KakarikoVillage(seedName);
            case "KokiriForest": return new KokiriForest(seedName);
            case "LakeHylia": return new LakeHylia(seedName);
            case "LinksHouse": return new LinksHouse(seedName);
            case "LonLonRanch": return new LonLonRanch(seedName);
            case "LostWoods": return new LostWoods(seedName);
            case "Market": return new Market(seedName);
            case "MarketEntrance": return new MarketEntrance(seedName);
            case "SacredForestMeadow": return new SacredForestMeadow(seedName);
            case "ShadowTemple": return new ShadowTemple(seedName);
            case "SpiritTemple": return new SpiritTemple(seedName);
            case "TempleOfTime": return new TempleOfTime(seedName);
            case "TempleOfTimeEntrance": return new TempleOfTimeEntrance(seedName);
            case "ThievesHideout": return new ThievesHideout(seedName);
            case "ThievesHideoutOutside": return new ThievesHideoutOutside(seedName);
            case "WaterTemple": return new WaterTemple(seedName);
            case "Windmill": return new Windmill(seedName);
            case "ZorasDomain": return new ZorasDomain(seedName);
            case "ZorasFountain": return new ZorasFountain(seedName);
            case "ZorasRiver": return new ZorasRiver(seedName);
            default: throw new IllegalArgumentException("Unknown value for destinationExitMap.getSimpleName(): " + destinationExitMap.getSimpleName());
        }
    }

    public static ExitMap buildExitMapByString(final String destinationString, final String seedName) {
        String[] nonOverworldExtraPlaces = PermanentlyLoadedInformation.getInstance().getNonOverworldExtraPlaces();
       if (destinationString.equals(nonOverworldExtraPlaces[0]) || destinationString.equals(nonOverworldExtraPlaces[1])) {
           return new KakarikoPotionShop(seedName);
       }
       throw new IllegalArgumentException("Unknown destinationString: " + destinationString);
    }
}
