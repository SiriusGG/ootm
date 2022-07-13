package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.*;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.time.Age;
import com.siriusgg.oot.model.util.StringFunctions;

import static com.siriusgg.oot.model.BuildData.*;

public abstract class ExitMap {
    public ExitMap() {}

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
    private boolean childMap = true;
    private boolean adultMap = true;
    private Exit[] exits;

    public static ExitMap toExitMap(final String name) throws UnknownPlaceWithMapStringException {
        if (name.equals(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[0])) {
            return new BottomOfTheWell();
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[1])) {
            return new DampesGrave();
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[2])) {
            return new DeathMountainCrater();
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[3])) {
            return new DeathMountainTrail();
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[4])) {
            return new DesertColossus();
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[5])) {
            return new DodongosCavern();
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[6])) {
            return new FireTemple();
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[7])) {
            return new ForestTemple();
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[8])) {
            return new GerudosFortress();
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[9])) {
            return new GerudoTrainingGround();
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[10])) {
            return new GerudoValley();
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[11])) {
            return new GoronCity();
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[12])) {
            return new Graveyard();
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[13])) {
            return new HauntedWasteland();
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[14])) {
            return new HyruleCastle();
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[15])) {
            return new HyruleField();
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[16])) {
            return new IceCavern();
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[17])) {
            return new InsideGanonsCastle();
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[18])) {
            return new InsideJabuJabusBelly();
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[19])) {
            return new InsideTheDekuTree();
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[20])) {
            return new KakarikoMagicPotionShop();
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[21])) {
            return new KakarikoVillage();
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[22])) {
            return new KokiriForest();
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[23])) {
            return new LakeHylia();
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[24])) {
            return new LinksHouse();
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[25])) {
            return new LonLonRanch();
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[26])) {
            return new LostWoods();
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[27])) {
            return new Market();
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[28])) {
            return new MarketEntrance();
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[29])) {
            return new SacredForestMeadow();
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[30])) {
            return new ShadowTemple();
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[31])) {
            return new SpiritTemple();
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[32])) {
            return new TempleOfTime();
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[33])) {
            return new TempleOfTimeEntrance();
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[34])) {
            return new ThievesHideout();
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[35])) {
            return new WaterTemple();
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[36])) {
            return new Windmill();
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[37])) {
            return new ZorasDomain();
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[38])) {
            return new ZorasFountain();
        } else if (name.equals(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[39])) {
            return new ZorasRiver();
        } else {
            throw new UnknownPlaceWithMapStringException(name);
        }
    }

    public void loadMapString(final String mapId) throws UnknownMapIdException {
        MapType mapType = MapType.getMypTypeByMapId(mapId);
        String mapDirectoryString = null;
        try {
            mapDirectoryString = MapType.getMapTypeString(mapType);
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
        if (mapType == MapType.ADDITIONAL_CONNECTION || mapType == MapType.DUNGEON) {
            map = mapDirectoryString + "/" + perspectiveString + "/" + mapId + GRAPHICS_EXTENSION;
        } else {
            map = mapDirectoryString + "/" + ageString + "/" + perspectiveString + "/" + mapId + GRAPHICS_EXTENSION;
        }
    }

    public String getMap() {
        return map;
    }

    public void initMap() {
        try {
            loadMapString(StringFunctions.mapNameToMapId(name));
        } catch (final UnknownMapIdException e) {
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

    public int getExitsAmount() {
        return exits.length;
    }

    public Position[] getExitPositions() throws UnknownPerspectiveException {
        Position[] positions = new Position[getExitsAmount()];
        for (int i = 0; i < getExitsAmount(); i++) {
            Exit currentExit = getExit(i);
            if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
                positions[i] = currentExit.getSidePosition();
            } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
                positions[i] = currentExit.getTopPosition();
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
}
