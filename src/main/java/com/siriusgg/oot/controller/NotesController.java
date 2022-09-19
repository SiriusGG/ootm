package com.siriusgg.oot.controller;

import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.util.SaveLoad;
import com.siriusgg.oot.view.*;

import javax.swing.*;

public class NotesController {
    private final String seedName;
    private final CurrentLocationFrame clf;
    private final Translation t;
    private NotesDialog nd;
    private String notes;

    public NotesController(final String seedName, final CurrentLocationFrame clf) {
        this.seedName = seedName;
        this.clf = clf;
        t = GlobalSettings.getInstance().getTranslation();
    }

    public void init() {
        prepareNotes();
        nd = new NotesDialog(this, clf, t.getTranslatedText("Notes"));
    }

    private void prepareNotes() {
        notes = SaveLoad.loadNotes(seedName);
        if (notes == null) notes = "";
    }

    public void loadInitialNotes(final JTextArea textArea) {
        textArea.setText(notes);
    }

    public void updateNotes() {
        notes = nd.getNotesTextArea().getText();
    }

    public void saveNotes() {
        SaveLoad.saveNotes(seedName, notes);
    }

    public NotesDialog getWindow() {
        return nd;
    }
}
