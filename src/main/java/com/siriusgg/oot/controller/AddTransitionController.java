package com.siriusgg.oot.controller;

import com.siriusgg.oot.exception.*;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;
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
            case DOOR_EXIT:
                addConnections("door", listModel);
                break;
            case DUNGEON_ENTRANCE:
            case DUNGEON_EXIT:
                addConnections("dungeon", listModel);
                break;
            case GROTTO_ENTRANCE:
            case GROTTO_EXIT:
                addConnections("grotto", listModel);
                break;
            case OVERWORLD:
                addConnections("overworld", listModel);
                break;
            case OWL_START:
                addConnections("owl start", listModel);
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
        PermanentlyLoadedInformation pli = PermanentlyLoadedInformation.getInstance();
            switch (type) {
                case "door":
                    String[] doors = pli.getNiceDoors();
                    for (final String door : doors) {
                        listModel.addElement(door);
                    }
                    break;
                case "dungeon":
                    String[] dungeons = pli.getNiceDungeons();
                    for (final String dungeon : dungeons) {
                        listModel.addElement(dungeon);
                    }
                    break;
                case "grotto":
                    String[] grottos = pli.getNiceGrottos();
                    for (final String grotto : grottos) {
                        listModel.addElement(grotto);
                    }
                    break;
                case "overworld":
                case "owl start":
                    String[] overworlds = pli.getNiceOverworlds();
                    for (final String overworld : overworlds) {
                        listModel.addElement(overworld);
                    }
                    break;
                case "owl landing":
                case "unchanging":
                case "warp":
                default:
                    throw new IllegalArgumentException(type);
            }
    }

    public void add(final String connection) throws IllegalArgumentException {
        PermanentlyLoadedInformation pli = PermanentlyLoadedInformation.getInstance();
        if ((StringArrayFunctions.contains(pli.getNiceOverworlds(), connection) ||
                StringArrayFunctions.contains(pli.getNiceDungeons(), connection)) ||
                StringArrayFunctions.contains(pli.getNiceAdditionalConnections(), connection)) {
            exit.setDestinationExitMap(MapClassifier.classifyByNiceName(connection));
        } else if (StringArrayFunctions.contains(pli.getNiceDoors(), connection) ||
                StringArrayFunctions.contains(pli.getNiceGrottos(), connection)) {
            exit.setDestinationString(connection);
        } else throw new IllegalArgumentException(connection);
    }

    public void buttonAdd(final String connection) {
        try {
            add(connection);
            SaveLoad.saveExitMap(seedName, exit.getExitMap());
            if (Settings.getInstance().getRememberWayBackMode() != RememberWayBackMode.REMEMBER_NO) {
                BidirectionalTransitionController btc = new BidirectionalTransitionController(clc.getFrame(), exit, connection, seedName);
                btc.init();
            }
        } catch (final IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public Exit getExit() {
        return exit;
    }
}
