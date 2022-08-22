package com.siriusgg.oot.model.places;

import com.siriusgg.oot.exception.*;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.exitmaps.*;
import com.siriusgg.oot.model.time.Age;
import com.siriusgg.oot.model.util.*;
import com.siriusgg.oot.Constants;

import java.io.File;

public abstract class ExitMap {
    private final String seedName;
    private PlaceWithMap place;
    private String map;
    private String niceName;
    private int overworldTransitionsAmount = 0;
    private int dungeonEntrancesAmount = 0;
    private int dungeonExitsAmount = 0;
    private int grottoEntrancesAmount = 0;
    private int grottoExitsAmount = 0;
    private int doorEntrancesAmount = 0;
    private int doorExitsAmount = 0;
    private int unchangingTransitionsAmount = 0;
    private boolean hasOwlStart = false;
    private int owlStartsAmount = 0;
    private boolean hasOwlLanding = false;
    private int owlLandingsAmount = 0;
    private int warpsAmount = 0;
    private UnchangingTransition zoom = null;
    private boolean childMap = true;
    private boolean adultMap = true;
    private Exit[] exits;

    public ExitMap(final String seedName) {
        this.seedName = seedName;
    }

    public static ExitMap fromString(final String name, final String seedName) throws UnknownPlaceWithMapStringException {
        String[] nicePlaces = Constants.NICE_PLACES_WITH_MAP;
        String[] nonOverworldExtraPlaces = Constants.NICE_NON_OVERWORLD_EXTRA_PLACES;
        if (name.equals(nicePlaces[0])) {
            return new BottomOfTheWell(seedName);
        } else if (name.equals(nicePlaces[1])) {
            return new DampesGrave(seedName);
        } else if (name.equals(nicePlaces[2])) {
            return new DeathMountainCrater(seedName);
        } else if (name.equals(nicePlaces[3])) {
            return new DeathMountainTrail(seedName);
        } else if (name.equals(nicePlaces[4])) {
            return new DesertColossus(seedName);
        } else if (name.equals(nicePlaces[5])) {
            return new DodongosCavern(seedName);
        } else if (name.equals(nicePlaces[6])) {
            return new FireTemple(seedName);
        } else if (name.equals(nicePlaces[7])) {
            return new ForestTemple(seedName);
        } else if (name.equals(nicePlaces[8])) {
            return new GerudosFortress(seedName);
        } else if (name.equals(nicePlaces[9])) {
            return new GerudoTrainingGround(seedName);
        } else if (name.equals(nicePlaces[10])) {
            return new GerudoValley(seedName);
        } else if (name.equals(nicePlaces[11])) {
            return new GoronCity(seedName);
        } else if (name.equals(nicePlaces[12])) {
            return new Graveyard(seedName);
        } else if (name.equals(nicePlaces[13])) {
            return new HauntedWasteland(seedName);
        } else if (name.equals(nicePlaces[14])) {
            return new HyruleCastle(seedName);
        } else if (name.equals(nicePlaces[15])) {
            return new HyruleField(seedName);
        } else if (name.equals(nicePlaces[16])) {
            return new IceCavern(seedName);
        } else if (name.equals(nicePlaces[17])) {
            return new InsideGanonsCastle(seedName);
        } else if (name.equals(nicePlaces[18])) {
            return new InsideJabuJabusBelly(seedName);
        } else if (name.equals(nicePlaces[19])) {
            return new InsideTheDekuTree(seedName);
        } else if (name.equals(nicePlaces[20]) ||
                name.equals(nonOverworldExtraPlaces[0]) ||
                name.equals(nonOverworldExtraPlaces[1])) {
            return new KakarikoPotionShop(seedName);
        } else if (name.equals(nicePlaces[21])) {
            return new KakarikoVillage(seedName);
        } else if (name.equals(nicePlaces[22])) {
            return new KokiriForest(seedName);
        } else if (name.equals(nicePlaces[23])) {
            return new LakeHylia(seedName);
        } else if (name.equals(nicePlaces[24])) {
            return new LinksHouse(seedName);
        } else if (name.equals(nicePlaces[25])) {
            return new LonLonRanch(seedName);
        } else if (name.equals(nicePlaces[26])) {
            return new LostWoods(seedName);
        } else if (name.equals(nicePlaces[27])) {
            return new Market(seedName);
        } else if (name.equals(nicePlaces[28])) {
            return new MarketEntrance(seedName);
        } else if (name.equals(nicePlaces[29])) {
            return new SacredForestMeadow(seedName);
        } else if (name.equals(nicePlaces[30])) {
            return new ShadowTemple(seedName);
        } else if (name.equals(nicePlaces[31])) {
            return new SpiritTemple(seedName);
        } else if (name.equals(nicePlaces[32])) {
            return new TempleOfTime(seedName);
        } else if (name.equals(nicePlaces[33])) {
            return new TempleOfTimeEntrance(seedName);
        } else if (name.equals(nicePlaces[34])) {
            return new ThievesHideout(seedName);
        } else if (name.equals(nicePlaces[35])) {
            return new WaterTemple(seedName);
        } else if (name.equals(nicePlaces[36])) {
            return new Windmill(seedName);
        } else if (name.equals(nicePlaces[37])) {
            return new ZorasDomain(seedName);
        } else if (name.equals(nicePlaces[38])) {
            return new ZorasFountain(seedName);
        } else if (name.equals(nicePlaces[39])) {
            return new ZorasRiver(seedName);
        }
        // Zoom areas
        else if (name.equals(nicePlaces[40])) {
            return new ThievesHideoutOutside(seedName);
        }
        // Error case
        else {
            throw new UnknownPlaceWithMapStringException(name);
        }
    }

    public static ExitMap fromClass(final Class destinationExitMap, final String seedName) {
        switch (destinationExitMap.getSimpleName()) {
            case "BottomOfTheWell":
                return new BottomOfTheWell(seedName);
            case "DampesGrave":
                return new DampesGrave(seedName);
            case "DeathMountainCrater":
                return new DeathMountainCrater(seedName);
            case "DeathMountainTrail":
                return new DeathMountainTrail(seedName);
            case "DesertColossus":
                return new DesertColossus(seedName);
            case "DodongosCavern":
                return new DodongosCavern(seedName);
            case "FireTemple":
                return new FireTemple(seedName);
            case "ForestTemple":
                return new ForestTemple(seedName);
            case "GerudosFortress":
                return new GerudosFortress(seedName);
            case "GerudoTrainingGround":
                return new GerudoTrainingGround(seedName);
            case "GerudoValley":
                return new GerudoValley(seedName);
            case "GoronCity":
                return new GoronCity(seedName);
            case "Graveyard":
                return new Graveyard(seedName);
            case "HauntedWasteland":
                return new HauntedWasteland(seedName);
            case "HyruleCastle":
                return new HyruleCastle(seedName);
            case "HyruleField":
                return new HyruleField(seedName);
            case "IceCavern":
                return new IceCavern(seedName);
            case "InsideGanonsCastle":
                return new InsideGanonsCastle(seedName);
            case "InsideJabuJabusBelly":
                return new InsideJabuJabusBelly(seedName);
            case "InsideTheDekuTree":
                return new InsideTheDekuTree(seedName);
            case "KakarikoPotionShop":
            case "KakarikoPotionShopFront":
            case "KakarikoPotionShopBack":
                return new KakarikoPotionShop(seedName);
            case "KakarikoVillage":
                return new KakarikoVillage(seedName);
            case "KokiriForest":
                return new KokiriForest(seedName);
            case "LakeHylia":
                return new LakeHylia(seedName);
            case "LinksHouse":
                return new LinksHouse(seedName);
            case "LonLonRanch":
                return new LonLonRanch(seedName);
            case "LostWoods":
                return new LostWoods(seedName);
            case "Market":
                return new Market(seedName);
            case "MarketEntrance":
                return new MarketEntrance(seedName);
            case "SacredForestMeadow":
                return new SacredForestMeadow(seedName);
            case "ShadowTemple":
                return new ShadowTemple(seedName);
            case "SpiritTemple":
                return new SpiritTemple(seedName);
            case "TempleOfTime":
                return new TempleOfTime(seedName);
            case "TempleOfTimeEntrance":
                return new TempleOfTimeEntrance(seedName);
            case "ThievesHideout":
                return new ThievesHideout(seedName);
            case "ThievesHideoutOutside":
                return new ThievesHideoutOutside(seedName);
            case "WaterTemple":
                return new WaterTemple(seedName);
            case "Windmill":
                return new Windmill(seedName);
            case "ZorasDomain":
                return new ZorasDomain(seedName);
            case "ZorasFountain":
                return new ZorasFountain(seedName);
            case "ZorasRiver":
                return new ZorasRiver(seedName);
            default:
                throw new IllegalArgumentException("Unknown value for destinationExitMap.getSimpleName(): " + destinationExitMap.getSimpleName());
        }
    }

    public static ExitMap fromDestinationString(final String destinationString, final String seedName) {
        String[] nonOverworldExtraPlaces = Constants.NICE_NON_OVERWORLD_EXTRA_PLACES;
        if (destinationString.equals(nonOverworldExtraPlaces[0]) || destinationString.equals(nonOverworldExtraPlaces[1])) {
            return new KakarikoPotionShop(seedName);
        } else if (StringArrayFunctions.contains(nonOverworldExtraPlaces, destinationString)) {
            throw new IllegalArgumentException("destinationString \"" + destinationString + "\" exists but should probably not be handled by this function.");
        }
        throw new IllegalArgumentException("Unknown destinationString: " + destinationString);
    }
    
    public void loadMapString(final String mapId) throws UnknownMapIdException, UnknownMapTypeException {
        MapType mapType = MapType.getMypTypeByMapId(mapId);
        String mapDirectoryString = null;
        try {
            mapDirectoryString = MapType.getMapDirectoryString(mapType);
        } catch (final UnknownMapTypeException e) {
            e.printStackTrace();
        }
        String ageString = null;
        try {
            ageString = Age.getAgeString(Settings.getInstance().getTime().getAge()).toLowerCase();
        } catch (final UnknownAgeException e) {
            e.printStackTrace();
        }
        String perspectiveString = null;
        try {
            perspectiveString = Perspective.getPerspectiveString(Settings.getInstance().getPerspective()).toLowerCase();
        } catch (final UnknownPerspectiveException e) {
            e.printStackTrace();
        }
        if (mapType == MapType.ADDITIONAL_CONNECTION || mapType == MapType.ADULT_ONLY || mapType == MapType.DUNGEON || mapType == MapType.ZOOM) {
            map = mapDirectoryString + "/" + perspectiveString + "/" + mapId + Constants.MAP_GRAPHIC_EXTENSION;
        } else if (mapType == MapType.OVERWORLD) {
            map = mapDirectoryString + "/" + ageString + "/" + perspectiveString + "/" + mapId + Constants.MAP_GRAPHIC_EXTENSION;
        } else throw new UnknownMapTypeException(mapType);
    }

    public String getMap() {
        return map;
    }

    public void initMap() {
        try {
            loadMapString(StringFunctions.mapNameToMapId(niceName));
        } catch (final UnknownMapIdException | UnknownMapTypeException e) {
            e.printStackTrace();
        }
    }

    public void setHasOwlStart(final boolean owlStart) {
        hasOwlStart = owlStart;
        setOwlStartsAmount();
    }

    private void setOwlStartsAmount() {
        if (hasOwlStart) {
            owlStartsAmount = 1;
        } else {
            owlStartsAmount = 0;
        }
    }

    public void setHasOwlLanding(final boolean owlLanding) {
        hasOwlLanding = owlLanding;
        setOwlLandingsAmount();
    }

    private void setOwlLandingsAmount() {
        if (hasOwlLanding) {
            owlLandingsAmount = 1;
        } else {
            owlLandingsAmount = 0;
        }
    }

    public int calculateExits() {
        return  doorEntrancesAmount + doorExitsAmount +
                dungeonEntrancesAmount + dungeonExitsAmount +
                grottoEntrancesAmount + grottoExitsAmount +
                overworldTransitionsAmount +
                owlStartsAmount + owlLandingsAmount +
                unchangingTransitionsAmount +
                warpsAmount;
    }

    public void setAccessibility(final boolean child, final boolean adult) {
        childMap = child;
        adultMap = adult;
    }

    public boolean hasChildMap() {
        return childMap;
    }

    public boolean hasAdultMap() {
        return adultMap;
    }

    public void initExits() {
        exits = new Exit[calculateExits()];
    }

    public void setExit(final Exit exit, final int index) {
        exits[index] = exit;
    }

    public Exit getExit(final int index) {
        return exits[index];
    }

    public String getNiceName() {
        return niceName;
    }

    public void setNiceName(final String niceName) {
        this.niceName = niceName;
    }

    public int getDoorEntrancesAmount() {
        return doorEntrancesAmount;
    }

    public void setDoorEntrancesAmount(final int doorEntrancesAmount) {
        this.doorEntrancesAmount = doorEntrancesAmount;
    }


    public int getDoorExitsAmount() {
        return doorExitsAmount;
    }

    public void setDoorExitsAmount(final int doorExitsAmount) {
        this.doorExitsAmount = doorExitsAmount;
    }

    public int getDungeonEntrancesAmount() {
        return dungeonEntrancesAmount;
    }

    public void setDungeonEntrancesAmount(final int dungeonEntrancesAmount) {
        this.dungeonEntrancesAmount = dungeonEntrancesAmount;
    }

    public int getDungeonExitsAmount() {
        return dungeonExitsAmount;
    }

    public void setDungeonExitsAmount(final int dungeonExitsAmount) {
        this.dungeonExitsAmount = dungeonExitsAmount;
    }

    public int getGrottoEntrancesAmount() {
        return grottoEntrancesAmount;
    }

    public void setGrottoEntrancesAmount(final int grottoEntrancesAmount) {
        this.grottoEntrancesAmount = grottoEntrancesAmount;
    }

    public int getGrottoExitsAmount() {
        return grottoExitsAmount;
    }

    public void setGrottoExitsAmount(final int grottoExitsAmount) {
        this.grottoExitsAmount = grottoExitsAmount;
    }

    public int getOverworldTransitionsAmount() {
        return overworldTransitionsAmount;
    }

    public void setOverworldTransitionsAmount(final int overworldTransitionsAmount) {
        this.overworldTransitionsAmount = overworldTransitionsAmount;
    }

    public int getUnchangingTransitionsAmount() {
        return unchangingTransitionsAmount;
    }

    public void setUnchangingTransitionsAmount(final int unchangingTransitionsAmount) {
        this.unchangingTransitionsAmount = unchangingTransitionsAmount;
    }

    public int getWarpsAmount() {
        return warpsAmount;
    }

    public void setWarpsAmount(final int warpsAmount) {
        this.warpsAmount = warpsAmount;
    }

    public UnchangingTransition getZoom() {
        return zoom;
    }

    public void setZoom(final UnchangingTransition zoom) {
        this.zoom = zoom;
    }

    public int getExitsAmount() {
        return exits.length;
    }

    public Position[] getExitPositions() throws UnknownPerspectiveException, UnknownAgeException {
        Position[] positions = new Position[getExitsAmount()];
        for (int i = 0; i < getExitsAmount(); i++) {
            Exit currentExit = getExit(i);
            if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
                if (Settings.getInstance().getTime().getAge() == Age.CHILD) {
                    positions[i] = currentExit.getChildSidePosition();
                } else if (Settings.getInstance().getTime().getAge() == Age.ADULT) {
                    positions[i] = currentExit.getAdultSidePosition();
                } else {
                    throw new UnknownAgeException(Settings.getInstance().getTime().getAge());
                }
            } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
                if (Settings.getInstance().getTime().getAge() == Age.CHILD) {
                    positions[i] = currentExit.getChildTopPosition();
                } else if (Settings.getInstance().getTime().getAge() == Age.ADULT) {
                    positions[i] = currentExit.getAdultTopPosition();
                } else {
                    throw new UnknownAgeException(Settings.getInstance().getTime().getAge());
                }
            } else {
                throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
            }
        }
        return positions;
    }

    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        return 60;
    }

    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        return 60;
    }

    public PlaceWithMap getPlace() {
        return place;
    }

    public void setPlace(final PlaceWithMap place) {
        this.place = place;
    }

    public void loadExitDestinationsFromSaveFile() {
        if (new File(Constants.USER_HOME + "/" + Constants.SAVE_DIRECTORY + "/" + seedName + "/" + getSimpleName() + Constants.EXIT_FILE_EXTENSION).exists()) {
            String[] exitStrings = SaveLoad.loadExits(seedName, getSimpleName());
            String[][] splitExits = new String[exitStrings.length][3];
            for (int i = 0; i < exitStrings.length; i++) {
                splitExits[i] = exitStrings[i].split("=");
            }
            for (String[] splitExit : splitExits) {
                for (final Exit exit : exits) {
                    if (exit.getName().equals(splitExit[0])) {
                        switch (splitExit[1]) {
                            case "D":
                                // exits[i].setDestination();
                                break;
                            case "DEM":
                                exit.setDestinationExitMap(MapClassifier.classifyByName(splitExit[2]));
                                break;
                            case "DS":
                                exit.setDestinationString(splitExit[2]);
                                break;
                        }
                    }
                }
            }
        }
    }

    public String getSimpleName() {
        return StringFunctions.mapNameToMapId(niceName);
    }
}
