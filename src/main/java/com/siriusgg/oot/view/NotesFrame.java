package com.siriusgg.oot.view;

import com.siriusgg.oot.controller.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NotesFrame extends JFrame {
    private final JTextArea notesTextArea;

    public NotesFrame(final NotesController nc, final CurrentLocationController clc, final String title) {
        super(title);
        clc.setNotesOpen(true);
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setLayout(null);
        Container cp = getContentPane();
        int borderSpacer = 5;
        int textAreaWidth = 400;
        int textAreaHeight = 300;
        int rightLAFSpacer = 16;
        int titleBarLAFSpacer = 38;
        notesTextArea = new JTextArea();
        JScrollPane notesScrollPane = new JScrollPane(notesTextArea);
        notesScrollPane.setBounds(borderSpacer, borderSpacer, textAreaWidth, textAreaHeight);
        nc.loadInitialNotes(notesTextArea);
        cp.add(notesScrollPane);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(final WindowEvent e) {
                nc.updateNotes();
                nc.saveNotes();
                clc.setNotesOpen(false);
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

    public JTextArea getNotesTextArea() {
        return notesTextArea;
    }
}
