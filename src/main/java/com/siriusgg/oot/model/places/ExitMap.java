package com.siriusgg.oot.model.places;

import com.siriusgg.oot.exception.*;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.exitmaps.*;
import com.siriusgg.oot.model.time.Age;
import com.siriusgg.oot.model.util.*;
import com.siriusgg.oot.model.BuildData;

public abstract class ExitMap {
    private final String seedName;
    private PlaceWithMap place;
    private String map;
    private String name;
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
        if (name.equals(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[0])) {
            return new BottomOfTheWell(seedName);
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[1])) {
            return new DampesGrave(seedName);
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[2])) {
            return new DeathMountainCrater(seedName);
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[3])) {
            return new DeathMountainTrail(seedName);
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[4])) {
            return new DesertColossus(seedName);
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[5])) {
            return new DodongosCavern(seedName);
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[6])) {
            return new FireTemple(seedName);
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[7])) {
            return new ForestTemple(seedName);
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[8])) {
            return new GerudosFortress(seedName);
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[9])) {
            return new GerudoTrainingGround(seedName);
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[10])) {
            return new GerudoValley(seedName);
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[11])) {
            return new GoronCity(seedName);
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[12])) {
            return new Graveyard(seedName);
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[13])) {
            return new HauntedWasteland(seedName);
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[14])) {
            return new HyruleCastle(seedName);
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[15])) {
            return new HyruleField(seedName);
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[16])) {
            return new IceCavern(seedName);
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[17])) {
            return new InsideGanonsCastle(seedName);
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[18])) {
            return new InsideJabuJabusBelly(seedName);
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[19])) {
            return new InsideTheDekuTree(seedName);
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[20])) {
            return new KakarikoPotionShop(seedName);
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[21])) {
            return new KakarikoVillage(seedName);
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[22])) {
            return new KokiriForest(seedName);
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[23])) {
            return new LakeHylia(seedName);
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[24])) {
            return new LinksHouse(seedName);
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[25])) {
            return new LonLonRanch(seedName);
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[26])) {
            return new LostWoods(seedName);
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[27])) {
            return new Market(seedName);
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[28])) {
            return new MarketEntrance(seedName);
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[29])) {
            return new SacredForestMeadow(seedName);
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[30])) {
            return new ShadowTemple(seedName);
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[31])) {
            return new SpiritTemple(seedName);
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[32])) {
            return new TempleOfTime(seedName);
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[33])) {
            return new TempleOfTimeEntrance(seedName);
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[34])) {
            return new ThievesHideout(seedName);
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[35])) {
            return new WaterTemple(seedName);
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[36])) {
            return new Windmill(seedName);
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[37])) {
            return new ZorasDomain(seedName);
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[38])) {
            return new ZorasFountain(seedName);
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[39])) {
            return new ZorasRiver(seedName);
        }
        // Zoom areas
        else if (name.equals(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[40])) {
            return new ThievesHideoutOutside(seedName);
        }
        // Error case
        else {
            throw new UnknownPlaceWithMapStringException(name);
        }
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
            map = mapDirectoryString + "/" + perspectiveString + "/" + mapId + BuildData.MAP_GRAPHIC_EXTENSION;
        } else if (mapType == MapType.OVERWORLD) {
            map = mapDirectoryString + "/" + ageString + "/" + perspectiveString + "/" + mapId + BuildData.MAP_GRAPHIC_EXTENSION;
        } else throw new UnknownMapTypeException(mapType);
    }

    public String getMap() {
        return map;
    }

    public void initMap() {
        try {
            loadMapString(StringFunctions.mapNameToMapId(name));
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

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
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
        String[] exits = SaveLoad.loadExits(seedName, name);
        // ToDo
    }
}
