package com.siriusgg.oot.controller;

import com.siriusgg.oot.exception.UnhandledExitTypeException;
import com.siriusgg.oot.exception.UnknownExitTypeException;
import com.siriusgg.oot.Constants;
import com.siriusgg.oot.model.RememberWayBackMode;
import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.Exit;
import com.siriusgg.oot.model.places.ExitType;
import com.siriusgg.oot.model.places.MapClassifier;
import com.siriusgg.oot.model.util.SaveLoad;
import com.siriusgg.oot.model.util.StringArrayFunctions;
import com.siriusgg.oot.view.AddTransitionDialog;

import javax.swing.*;

public class AddTransitionController {
    private final CurrentLocationController clc;
    private final JFrame ownerFrame;
    private final Exit exit;
    private final String seedName;

    public AddTransitionController(final CurrentLocationController clc, final Exit exit, final String seedName) {
        this.clc = clc;
        ownerFrame = clc.getFrame();
        this.exit = exit;
        this.seedName = seedName;
    }

    public void init() {
        new AddTransitionDialog(this, ownerFrame, "Add Transition", true);
    }

    public void fillPossibleConnectionsList(final DefaultListModel<String> listModel) throws UnhandledExitTypeException, UnknownExitTypeException {
        ExitType exitType = exit.getExitType();
        switch (exitType) {
            case DOOR_ENTRANCE:
                addConnections("door", listModel);
                break;
            case DUNGEON_ENTRANCE:
                addConnections("dungeon", listModel);
                break;
            case GROTTO_ENTRANCE:
                addConnections("grotto", listModel);
                break;
            case DOOR_EXIT:
            case DUNGEON_EXIT:
            case GROTTO_EXIT:
            case OVERWORLD:
            case OWL_START:
                addConnections("overworld", listModel);
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
            case "door":
                String[] doors = Constants.NICE_DOORS;
                for (final String door : doors) {
                    listModel.addElement(door);
                }
                break;
            case "dungeon":
                String[] dungeons = Constants.NICE_DUNGEONS;
                for (final String dungeon : dungeons) {
                    listModel.addElement(dungeon);
                }
                break;
            case "grotto":
                String[] grottos = Constants.NICE_GROTTOS;
                for (final String grotto : grottos) {
                    listModel.addElement(grotto);
                }
                break;
            case "overworld":
                String[] overworlds = Constants.NICE_OVERWORLD;
                for (final String overworld : overworlds) {
                    listModel.addElement(overworld);
                }
                break;
            default:
                throw new IllegalArgumentException(type);
        }
    }

    public void add(final String connection) throws IllegalArgumentException {
        if ((StringArrayFunctions.contains(Constants.NICE_OVERWORLD, connection) ||
                StringArrayFunctions.contains(Constants.NICE_DUNGEONS, connection)) ||
                StringArrayFunctions.contains(Constants.NICE_ADDITIONAL_CONNECTIONS, connection)) {
            exit.setDestinationExitMap(MapClassifier.classifyByNiceName(connection));
        } else if (StringArrayFunctions.contains(Constants.NICE_DOORS, connection) ||
                StringArrayFunctions.contains(Constants.NICE_GROTTOS, connection)) {
            exit.setDestinationString(connection);
        } else throw new IllegalArgumentException(connection);
    }

    public void buttonAdd(final String connection) {
        try {
            add(connection);
            SaveLoad.saveExitMap(seedName, exit.getExitMap());
            if (Settings.getInstance().getRememberWayBackMode() != RememberWayBackMode.REMEMBER_NO &&
                    exit.getExitType() != ExitType.OWL_START) {
                if (StringArrayFunctions.contains(Constants.NICE_PLACES_WITH_MAP, connection)) {
                    BidirectionalTransitionController btc = new BidirectionalTransitionController(clc.getFrame(), exit, connection, seedName);
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
