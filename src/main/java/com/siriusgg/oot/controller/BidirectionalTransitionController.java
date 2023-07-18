package com.siriusgg.oot.controller;

import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.util.*;
import com.siriusgg.oot.translation.Translation;
import com.siriusgg.oot.view.BidirectionalTransitionDialog;

import javax.swing.*;
import java.util.*;

public class BidirectionalTransitionController {
    private final JFrame ownerFrame;
    private final Exit exit;
    private final String seedName;
    private final ExitMap exitMapFrom;
    private final Translation t;

    public BidirectionalTransitionController(final JFrame ownerFrame, final Exit exit, final String seedName, final ExitMap exitMapFrom) {
        this.ownerFrame = ownerFrame;
        this.exit = exit;
        this.seedName = seedName;
        this.exitMapFrom = exitMapFrom;
        t = GlobalSettings.getInstance().getTranslation();
    }

    public void init() {
        new BidirectionalTransitionDialog(this, ownerFrame, t.getTranslatedText("Add Transition Exit"), true);
    }

    public void handleDisplay(final BidirectionalTransitionDialog btd) {
        SeedSettings s = SeedSettings.getInstance(seedName);
        if (s.getRememberWayBackMode() == RememberWayBackMode.DO_NOT_REMEMBER) {
            btd.setAskMode();
        } else if (s.getRememberWayBackMode() == RememberWayBackMode.REMEMBER_YES) {
            btd.setSelectionMode();
        } else {
            throw new IllegalStateException("RememberWayBackMode is neither DO_NOT_REMEMBER nor REMEMBER_YES, so this Dialog should never open.");
        }
    }

    public int getListWidth() {
        return UIFunctions.getSafeListWidth(exit);
    }

    public String getDestinationExitMapNiceName() {
        return t.getTranslatedText(exitMapFrom.getNiceName());
    }

    public void fillList(final DefaultListModel<String> listModel) {
        ExitType exitType = exit.getExitType();
        ArrayList<String> connections = new ArrayList<>();
        if (exitType == ExitType.OVERWORLD ||
                exitType == ExitType.OWL_START) {
            String[] niceOverworlds = ExitMap.getNiceOverworldsOf(exitMapFrom);
            for (final String niceOverworld : niceOverworlds) {
                connections.add(t.getTranslatedText(niceOverworld));
            }
        } else if (exitType == ExitType.DOOR_ENTRANCE ||
                exitType == ExitType.DOOR_EXIT) {
            String[] niceDoors = ExitMap.getNiceDoorsOf(exitMapFrom);
            for (final String niceDoor : niceDoors) {
                connections.add(t.getTranslatedText(niceDoor));
            }
        } else if (exitType == ExitType.DUNGEON_ENTRANCE ||
                exitType == ExitType.DUNGEON_EXIT) {
            String[] niceDungeons = ExitMap.getNiceDungeonsOf(exitMapFrom);
            for (final String niceDungeon : niceDungeons) {
                connections.add(t.getTranslatedText(niceDungeon));
            }
        } else if (exitType == ExitType.GROTTO_ENTRANCE ||
                exitType == ExitType.GROTTO_EXIT) {
            String[] niceGrottos = ExitMap.getNiceGrottosOf(exitMapFrom);
            for (final String niceGrotto : niceGrottos) {
                connections.add(t.getTranslatedText(niceGrotto));
            }
        } else {
            throw new IllegalStateException("ExitType " + exitType + " of Exit " + exit.getName() + " is not handled.");
        }
        Collections.sort(connections);
        for (final String connection : connections) {
            listModel.addElement(connection);
        }
    }

    public String getSeedName() {
        return seedName;
    }

    public void addAndDispose(final BidirectionalTransitionDialog btd, final JList<String> list) {
        String selectedLocation = Translation.toEnglish(list.getSelectedValue());
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

    public void doYes(final BidirectionalTransitionDialog btd) {
        if (btd.getCheckBoxRemember().isSelected()) {
            SeedSettings s = SeedSettings.getInstance(seedName);
            s.setRememberWayBackMode(RememberWayBackMode.REMEMBER_YES);
            SeedSettings.saveSeedSettings(seedName, s);
        }
        ExitType exitType = exit.getExitType();
        if (AutomaticWayBack.moreThanOneOption(exitMapFrom, exitType)) btd.setSelectionMode();
        else {
            AutomaticWayBack.automaticallySetOnlyOption(exitMapFrom, exit.getExitMap(), exitType, seedName);
            btd.dispose();
        }
    }

    public void doNo(final BidirectionalTransitionDialog btd) {
        SeedSettings s = SeedSettings.getInstance(seedName);
        if (btd.getCheckBoxRemember().isSelected()) {
            s.setRememberWayBackMode(RememberWayBackMode.REMEMBER_NO);
            SeedSettings.saveSeedSettings(seedName, s);
        }
        btd.dispose();
    }
}
