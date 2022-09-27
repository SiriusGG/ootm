package com.siriusgg.oot.controller;

import com.siriusgg.oot.constants.OoTMConstants;
import com.siriusgg.oot.exception.*;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.util.*;
import com.siriusgg.oot.view.AddTransitionDialog;

import javax.swing.*;

public class AddTransitionController {
    private final CurrentLocationController clc;
    private final JFrame ownerFrame;
    private final Exit exit;
    private final String seedName;
    private final Translation t;

    public AddTransitionController(final CurrentLocationController clc, final Exit exit, final String seedName) {
        this.clc = clc;
        ownerFrame = clc.getFrame();
        this.exit = exit;
        this.seedName = seedName;
        t = GlobalSettings.getInstance().getTranslation();
    }

    public void init() {
        new AddTransitionDialog(this, ownerFrame, t.getTranslatedText("Add Transition"), true);
    }

    public void fillPossibleConnectionsList(final DefaultListModel<String> listModel) throws UnhandledExitTypeException, UnknownExitTypeException {
        ExitType exitType = exit.getExitType();
        switch (exitType) {
            case DOOR_ENTRANCE:
                addConnections("door_entrance", listModel);
                break;
            case DUNGEON_ENTRANCE:
                addConnections("dungeon_entrance", listModel);
                break;
            case GROTTO_ENTRANCE:
                addConnections("grotto_entrance", listModel);
                break;
            case DOOR_EXIT:
                addConnections("door_exit", listModel);
                break;
            case GROTTO_EXIT:
                addConnections("grotto_exit", listModel);
                break;
            case OVERWORLD:
            case OWL_START:
                addConnections("overworld", listModel);
                break;
            case DUNGEON_EXIT:
                addConnections("dungeon_exit", listModel);
                break;
            case OWL_LANDING:
            case UNCHANGING:
            case WARP:
                throw new UnhandledExitTypeException(exitType);
            default:
                throw new UnknownExitTypeException(exitType);
        }
    }

    private void addConnections(final String type, final DefaultListModel<String> listModel) throws IllegalArgumentException {
        switch (type) {
            case "door_entrance":
                String[] doors = OoTMConstants.NICE_DOORS;
                for (final String door : doors) {
                    listModel.addElement(t.getTranslatedText(door));
                }
                break;
            case "dungeon_entrance":
                String[] dungeons = OoTMConstants.NICE_DUNGEONS;
                for (final String dungeon : dungeons) {
                    listModel.addElement(t.getTranslatedText(dungeon));
                }
                // exclude "Inside Ganon's Castle", as its transition is unchanging
                String ganonsCastle = t.getTranslatedText(OoTMConstants.NICE_DUNGEONS[6]);
                if (listModel.contains(ganonsCastle)) {
                    listModel.removeElement(ganonsCastle);
                }
                break;
            case "grotto_entrance":
                String[] grottos = OoTMConstants.NICE_GROTTOS;
                for (final String grotto : grottos) {
                    listModel.addElement(t.getTranslatedText(grotto));
                }
                break;
            case "overworld":
                String[] overworlds = OoTMConstants.NICE_OVERWORLDS;
                for (final String overworld : overworlds) {
                    listModel.addElement(t.getTranslatedText(overworld));
                }
                break;
            case "door_exit":
                String[] overworldsWithDoor = OoTMConstants.NICE_OVERWORLDS_WITH_DOOR;
                for (final String overworldWithDoor : overworldsWithDoor) {
                    listModel.addElement(t.getTranslatedText(overworldWithDoor));
                }
                break;
            case "dungeon_exit":
                String[] overworldsWithDungeon = OoTMConstants.NICE_OVERWORLDS_WITH_DUNGEON;
                for (final String overworldWithDungeon : overworldsWithDungeon) {
                    listModel.addElement(t.getTranslatedText(overworldWithDungeon));
                }
                break;
            case "grotto_exit":
                String[] overworldsWithGrotto = OoTMConstants.NICE_OVERWORLDS_WITH_GROTTO;
                for (final String overworldWithGrotto : overworldsWithGrotto) {
                    listModel.addElement(t.getTranslatedText(overworldWithGrotto));
                }
                break;
            default:
                throw new IllegalArgumentException(type);
        }
    }

    public void add(final String connection) throws IllegalArgumentException {
        if (StringArrayFunctions.contains(OoTMConstants.NICE_OVERWORLDS, connection) ||
                StringArrayFunctions.contains(OoTMConstants.NICE_DUNGEONS, connection) ||
                StringArrayFunctions.contains(OoTMConstants.NICE_ADDITIONAL_CONNECTIONS, connection) ||
                StringArrayFunctions.contains(OoTMConstants.NICE_NON_OVERWORLD_EXTRA_PLACES, connection)) {
            exit.setDestinationExitMap(MapClassifier.classifyByNiceName(connection));
        } else if (StringArrayFunctions.contains(OoTMConstants.NICE_DOORS, connection) ||
                StringArrayFunctions.contains(OoTMConstants.NICE_GROTTOS, connection)) {
            exit.setDestinationString(connection);
        } else throw new IllegalArgumentException(connection);
    }

    public void doAdd(final String connection) {
        try {
            SeedSettings s = SeedSettings.getInstance(seedName);
            add(connection);
            SaveLoad.saveExitMap(seedName, exit.getExitMap());
            ExitType exitType = exit.getExitType();
            if ((StringArrayFunctions.contains(OoTMConstants.NICE_PLACES_WITH_MAP, connection) ||
                    StringArrayFunctions.contains(OoTMConstants.NICE_NON_OVERWORLD_EXTRA_PLACES, connection)) &&
                    s.getRememberWayBackMode() != RememberWayBackMode.REMEMBER_NO &&
                    exitType != ExitType.OWL_START) {
                ExitMap wayBackExitMap;
                try {
                    wayBackExitMap = ExitMap.fromString(connection, seedName);
                } catch (final UnknownPlaceWithMapStringException e) {
                    e.printStackTrace();
                    return;
                }
                if (s.getRememberWayBackMode() == RememberWayBackMode.REMEMBER_YES) {
                    if (AutomaticWayBack.moreThanOneOption(wayBackExitMap, exitType)) {
                        BidirectionalTransitionController btc = new BidirectionalTransitionController(clc.getFrame(), exit, seedName, wayBackExitMap);
                        btc.init();
                    } else {
                        AutomaticWayBack.automaticallySetOnlyOption(wayBackExitMap, exit.getExitMap(), exitType, seedName);
                    }
                } else {
                    BidirectionalTransitionController btc = new BidirectionalTransitionController(clc.getFrame(), exit, seedName, wayBackExitMap);
                    btc.init();
                }
            }
        } catch (final IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public Exit getExit() {
        return exit;
    }
}
