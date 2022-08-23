package com.siriusgg.oot.controller;

import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.util.UIFunctions;
import com.siriusgg.oot.view.BidirectionalTransitionDialog;

import javax.swing.*;

public class BidirectionalTransitionController {
    private final JFrame ownerFrame;
    private final Exit exit;
    private final String connection;
    private final String seedName;
    private final String destinationExitMapNiceName;
    private ExitMap exitMapInstance;

    public BidirectionalTransitionController(final JFrame ownerFrame, final Exit exit, final String connection, final String seedName) {
        this.ownerFrame = ownerFrame;
        this.exit = exit;
        this.connection = connection;
        this.seedName = seedName;
        destinationExitMapNiceName = setDestinationExitMapNiceName();
    }

    public void init() {
        new BidirectionalTransitionDialog(this, ownerFrame, "Add Transition Exit", true);
    }

    public void handleDisplay(final BidirectionalTransitionDialog btd) {
        if (Settings.getInstance().getRememberWayBackMode() == RememberWayBackMode.DO_NOT_REMEMBER) {
            btd.setAskMode();
        } else if (Settings.getInstance().getRememberWayBackMode() == RememberWayBackMode.REMEMBER_YES) {
            btd.setSelectionMode();
        } else {
            throw new IllegalStateException("RememberWayBackMode is neither DO_NOT_REMEMBER nor REMEMBER_YES, so this Dialog should never open.");
        }
    }

    public int getListWidth() {
        return UIFunctions.getSafeListWidth(exit);
    }

    public String getDestinationExitMapNiceName() {
        return destinationExitMapNiceName;
    }

    @SuppressWarnings("rawtypes")
    public String setDestinationExitMapNiceName() {
        Class exitMapClass = MapClassifier.classifyByNiceName(connection);
        exitMapInstance = ExitMap.fromClass(exitMapClass, seedName);
        return exitMapInstance.getNiceName();
    }

    public void fillList(final DefaultListModel<String> listModel) {
        ExitType exitType = exit.getExitType();
        if (exitType == ExitType.OVERWORLD ||
                exitType == ExitType.OWL_START) {
            String[] niceOverworlds = ExitMap.getNiceOverworldsOf(exitMapInstance);
            for (final String niceOverworld : niceOverworlds) {
                listModel.addElement(niceOverworld);
            }
        } else if (exitType == ExitType.DOOR_ENTRANCE ||
                exitType == ExitType.DOOR_EXIT) {
            String[] niceDoors = ExitMap.getNiceDoorsOf(exitMapInstance);
            for (final String niceDoor : niceDoors) {
                listModel.addElement(niceDoor);
            }
        } else if (exitType == ExitType.DUNGEON_ENTRANCE ||
                exitType == ExitType.DUNGEON_EXIT) {
            String[] niceDungeons = ExitMap.getNiceDungeonsOf(exitMapInstance);
            for (final String niceDungeon : niceDungeons) {
                listModel.addElement(niceDungeon);
            }
        } else if (exitType == ExitType.GROTTO_ENTRANCE ||
                exitType == ExitType.GROTTO_EXIT) {
            String[] niceGrottos = ExitMap.getNiceGrottosOf(exitMapInstance);
            for (final String niceGrotto : niceGrottos) {
                listModel.addElement(niceGrotto);
            }
        } else {
            throw new IllegalStateException("ExitType " + exitType + " of Exit " + exit.getName() + " is not handled.");
        }
    }

    public String getSeedName() {
        return seedName;
    }
}
