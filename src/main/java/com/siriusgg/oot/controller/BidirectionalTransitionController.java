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

    public BidirectionalTransitionController(final JFrame ownerFrame, final Exit exit, final String connection, final String seedName) {
        this.ownerFrame = ownerFrame;
        this.exit = exit;
        this.connection = connection;
        this.seedName = seedName;
    }

    public void init() {
        new BidirectionalTransitionDialog(this, ownerFrame, "Add Transition Exit", true);
    }

    public boolean moreThanOneOption() {
        // ToDo
        return true;
    }

    public void automaticallySetOnlyOption(final BidirectionalTransitionDialog btd) {
        // ToDo: implement, de-pseudo and possibly rename
        btd.dispose();
    }

    public void handleDisplay(final BidirectionalTransitionDialog btd) {
        if (Settings.getInstance().getRememberWayBackMode() == RememberWayBackMode.DO_NOT_REMEMBER) btd.setAskMode();
        else if (Settings.getInstance().getRememberWayBackMode() == RememberWayBackMode.REMEMBER_YES) btd.setSelectionMode();
        else throw new IllegalStateException("RememberWayBackMode is neither DO_NOT_REMEMBER nor REMEMBER_YES, so this Dialog should never open.");
    }

    public int getListWidth() {
        return UIFunctions.getSafeListWidth(exit);
    }

    public String getDestinationExitMapNiceName() {
        String destinationExitMapNiceName;
        try {
            destinationExitMapNiceName = ((ExitMap)(MapClassifier.classifyByNiceName(connection).newInstance())).getNiceName();
        } catch (final InstantiationException | IllegalAccessException e) {
            System.err.println("Could not find exitMap for connection " + connection);
            destinationExitMapNiceName = "UNKNOWN";
        }
        return destinationExitMapNiceName;
    }

    public void fillList(final DefaultListModel<String> listModel) {
        // ToDo: Fill model
        // for (entry : collection) listModel.add(entry);
    }

    public String getSeedName() {
        return seedName;
    }
}
