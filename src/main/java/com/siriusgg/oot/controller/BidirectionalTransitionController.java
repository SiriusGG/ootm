package com.siriusgg.oot.controller;

import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.util.*;
import com.siriusgg.oot.view.BidirectionalTransitionDialog;

import javax.swing.*;

public class BidirectionalTransitionController {
    private final JFrame ownerFrame;
    private final Exit exit;
    private final String seedName;
    private final ExitMap exitMapFrom;

    public BidirectionalTransitionController(final JFrame ownerFrame, final Exit exit, final String seedName, final ExitMap exitMapFrom) {
        this.ownerFrame = ownerFrame;
        this.exit = exit;
        this.seedName = seedName;
        this.exitMapFrom = exitMapFrom;
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
        return exitMapFrom.getNiceName();
    }

    public void fillList(final DefaultListModel<String> listModel) {
        ExitType exitType = exit.getExitType();
        if (exitType == ExitType.OVERWORLD ||
                exitType == ExitType.OWL_START) {
            String[] niceOverworlds = ExitMap.getNiceOverworldsOf(exitMapFrom);
            for (final String niceOverworld : niceOverworlds) {
                listModel.addElement(niceOverworld);
            }
        } else if (exitType == ExitType.DOOR_ENTRANCE ||
                exitType == ExitType.DOOR_EXIT) {
            String[] niceDoors = ExitMap.getNiceDoorsOf(exitMapFrom);
            for (final String niceDoor : niceDoors) {
                listModel.addElement(niceDoor);
            }
        } else if (exitType == ExitType.DUNGEON_ENTRANCE ||
                exitType == ExitType.DUNGEON_EXIT) {
            String[] niceDungeons = ExitMap.getNiceDungeonsOf(exitMapFrom);
            for (final String niceDungeon : niceDungeons) {
                listModel.addElement(niceDungeon);
            }
        } else if (exitType == ExitType.GROTTO_ENTRANCE ||
                exitType == ExitType.GROTTO_EXIT) {
            String[] niceGrottos = ExitMap.getNiceGrottosOf(exitMapFrom);
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

    public void addAndDispose(final BidirectionalTransitionDialog btd, final JList<String> list) {
        String selectedLocation = list.getSelectedValue();
        String name = StringFunctions.mapNameToMapId(selectedLocation);
        int exitsAmount = exitMapFrom.getExitsAmount();
        Exit newExit;
        for (int i = 0; i < exitsAmount; i++) {
            newExit = exitMapFrom.getExit(i);
            String exitNiceName = TransitionNames.toNiceString(newExit.getName());
            String mapId = StringFunctions.mapNameToMapId(TransitionNames.getOriginalDestination(exitNiceName));
            if (mapId.endsWith(name)) {
                try {
                    newExit.setDestinationExitMap(exit.getExitMap().getClass());
                } catch (final IllegalArgumentException e) {
                    newExit.setDestinationString(selectedLocation);
                }
                break;
            }
        }
        SaveLoad.saveExitMap(seedName, exitMapFrom);
        btd.dispose();
    }

    public void doYes(final BidirectionalTransitionDialog btd, final JCheckBox checkBoxRemember) {
        if (checkBoxRemember.isSelected()) {
            Settings.getInstance().setRememberWayBackMode(RememberWayBackMode.REMEMBER_YES);
            Settings.getInstance().saveSettings(seedName);
        }
        ExitType exitType = exit.getExitType();
        if (AutomaticWayBack.moreThanOneOption(exitMapFrom, exitType)) {
            btd.setSelectionMode();
        } else {
            AutomaticWayBack.automaticallySetOnlyOption(exitMapFrom, exit.getExitMap(), exitType, seedName);
            btd.dispose();
        }
    }
}
