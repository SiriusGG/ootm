package com.siriusgg.oot.controller;

import com.siriusgg.oot.exception.*;
import com.siriusgg.oot.model.PermanentlyLoadedInformation;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.util.StringArrayFunctions;
import com.siriusgg.oot.view.AddTransitionDialog;

import javax.swing.*;

public class AddTransitionController {
    private final CurrentLocationController clc;
    private final JFrame ownerFrame;
    private final Exit exit;

    public AddTransitionController(final CurrentLocationController clc, final Exit exit) {
        this.clc = clc;
        ownerFrame = clc.getFrame();
        this.exit = exit;
    }

    public void init() {
        new AddTransitionDialog(this, ownerFrame, "Add Transition", true);
    }

    public void fillPossibleConnectionsList(final JList<String> possibleConnections) throws UnhandledExitTypeException, UnknownExitTypeException {
        ExitType exitType = exit.getExitType();
        switch (exitType) {
            case DOOR_ENTRANCE:
            case DOOR_EXIT:
                addConnections("door", possibleConnections);
                break;
            case DUNGEON_ENTRANCE:
            case DUNGEON_EXIT:
                addConnections("dungeon", possibleConnections);
                break;
            case GROTTO_ENTRANCE:
            case GROTTO_EXIT:
                addConnections("grotto", possibleConnections);
                break;
            case OVERWORLD:
                addConnections("overworld", possibleConnections);
                break;
            case OWL_START:
                addConnections("owl start", possibleConnections);
                break;
            case OWL_LANDING:
            case UNCHANGING:
            case WARP:
                throw new UnhandledExitTypeException(exitType);
            default:
                throw new UnknownExitTypeException(exitType);
        }
    }

    private void addConnections(final String type, final JList<String> possibleConnections) throws IllegalArgumentException {
        PermanentlyLoadedInformation pli = PermanentlyLoadedInformation.getInstance();
        if (possibleConnections.getModel() instanceof DefaultListModel) {
            DefaultListModel<String> listModel = (DefaultListModel) possibleConnections.getModel();
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
    }

    public int getBoxWidth() throws UnknownExitTypeException, UnhandledExitTypeException {
        ExitType exitType = exit.getExitType();
        switch (exitType) {
            case DOOR_ENTRANCE:
            case DOOR_EXIT:
                return 220;
            case DUNGEON_ENTRANCE:
            case DUNGEON_EXIT:
                return 165;
            case GROTTO_ENTRANCE:
            case GROTTO_EXIT:
                return 245;
            case OVERWORLD:
            case OWL_START:
                return 170;
            case OWL_LANDING:
            case UNCHANGING:
            case WARP:
                throw new UnhandledExitTypeException(exitType);
            default:
                throw new UnknownExitTypeException(exitType);
        }
    }

    public void add(final String connection) {
        // ToDo
        System.out.println(connection);
        PermanentlyLoadedInformation pli = PermanentlyLoadedInformation.getInstance();
        if (StringArrayFunctions.contains(pli.getNiceOverworlds(), connection)) {
            System.out.println("pling");
            //exit.setDestinationExitMap(ExitMapFactory.create(connection));
        }
    }
}
