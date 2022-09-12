package com.siriusgg.oot.controller;

import com.siriusgg.oot.model.checklists.BeanSpotCheckList;
import com.siriusgg.oot.model.util.SaveLoad;
import com.siriusgg.oot.view.NotesDialog;

import javax.swing.*;
import java.awt.event.*;

public class NotesController {
    private final String seedName;
    private final JFrame owner;
    private String notes;

    public NotesController(final String seedName, final JFrame owner) {
        this.seedName = seedName;
        this.owner = owner;
    }

    public void init() {
        prepareNotes();
        new NotesDialog(this, owner);
    }

    private void prepareNotes() {
        notes = SaveLoad.loadNotes(seedName);
        if (notes == null) notes = "";
    }

    public void loadInitialNotes(final JTextArea textArea) {
        textArea.setText(notes);
    }

    public void updateNotes(final JTextArea textArea) {
        notes = textArea.getText();
    }

    public void saveNotes() {
        SaveLoad.saveNotes(seedName, notes);
    }
}
