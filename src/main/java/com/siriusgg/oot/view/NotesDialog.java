package com.siriusgg.oot.view;

import com.siriusgg.oot.controller.NotesController;
import com.siriusgg.oot.model.OoTMConstants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NotesDialog extends JDialog {
    public NotesDialog(final NotesController nc, final JFrame owner) {
        super(owner, "Notes", true);
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setLayout(null);
        Container cp = getContentPane();
        int borderSpacer = 5;
        int textAreaWidth = 400;
        int textAreaHeight = 300;
        int rightLAFSpacer = 16;
        int titleBarLAFSpacer = 38;
        JTextArea notesTextArea = new JTextArea();
        JScrollPane notesScrollPane = new JScrollPane(notesTextArea);
        notesScrollPane.setBounds(borderSpacer, borderSpacer, textAreaWidth, textAreaHeight);
        nc.loadInitialNotes(notesTextArea);
        cp.add(notesScrollPane);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(final WindowEvent e) {
                nc.updateNotes(notesTextArea);
                nc.saveNotes();
                dispose();
            }
        });
        int frameWidth = (2 * borderSpacer) + textAreaWidth + rightLAFSpacer;
        int frameHeight = titleBarLAFSpacer + (2 * borderSpacer) + textAreaHeight;
        setSize(frameWidth, frameHeight);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);
        setResizable(false);
        setVisible(true);
    }
}
