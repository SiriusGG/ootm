package com.siriusgg.oot.controller;

import com.siriusgg.oot.exception.UnknownExitTypeException;
import com.siriusgg.oot.model.PermanentlyLoadedInformation;
import com.siriusgg.oot.model.places.Exit;
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
        new AddTransitionDialog(this, ownerFrame, "Add Transition", true, exit);
    }

    public void fillPossibleConnectionsComboBox(final JComboBox<String> possibleConnections) throws UnknownExitTypeException {
        switch (exit.getExitType()) {
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
                addConnections("owl landing", possibleConnections);
                break;
            case UNCHANGING:
                addConnections("unchanging", possibleConnections);
                break;
            case WARP:
                addConnections("warp", possibleConnections);
                break;
            default: throw new UnknownExitTypeException(exit.getExitType());
        }
    }

    private void addConnections(final String type, final JComboBox<String> possibleConnections) throws IllegalArgumentException {
        PermanentlyLoadedInformation pli = PermanentlyLoadedInformation.getInstance();
        switch (type) {
            case "door":
                String[] doors = pli.getNiceDoors();
                for (final String door : doors) {
                    possibleConnections.addItem(door);
                }
                break;
            case "dungeon":
                String[] dungeons = pli.getNiceDungeons();
                for (final String dungeon : dungeons) {
                    possibleConnections.addItem(dungeon);
                }
                break;
            case "grotto":
                String[] grottos = pli.getNiceGrottos();
                for (final String grotto : grottos) {
                    possibleConnections.addItem(grotto);
                }
                break;
            case "overworld":
                String[] overworlds = pli.getNiceOverworlds();
                for (final String overworld : overworlds) {
                    possibleConnections.addItem(overworld);
                }
                break;
            case "owl start":
                String[] owlStarts = pli.getNiceOwlStarts();
                for (final String owlStart : owlStarts) {
                    possibleConnections.addItem(owlStart);
                }
                break;
            case "owl landing":
                String[] owlLandings = pli.getNiceOwlLandings();
                for (final String owlLanding : owlLandings) {
                    possibleConnections.addItem(owlLanding);
                }
                break;
            case "unchanging":
            case "warp":
            default: throw new IllegalArgumentException(type);
        }
    }
}
