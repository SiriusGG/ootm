package com.siriusgg.oot.controller;

import com.siriusgg.oot.model.*;
import com.siriusgg.oot.util.SaveLoad;
import com.siriusgg.oot.translation.Translation;
import com.siriusgg.oot.view.*;

import javax.swing.*;

public class NotesController {
    private final String seedName;
    private final CurrentLocationController clc;
    private final Translation t;
    private NotesFrame nd;
    private String notes;

    public NotesController(final String seedName, final CurrentLocationController clc) {
        this.seedName = seedName;
        this.clc = clc;
        t = GlobalSettings.getInstance().getTranslation();
    }

    public void init() {
        prepareNotes();
        nd = new NotesFrame(this, clc, t.getTranslatedText("Notes"));
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

    public NotesFrame getWindow() {
        return nd;
    }
}
