package com.siriusgg.oot.view;

import com.siriusgg.oot.controller.AddTransitionController;
import com.siriusgg.oot.exception.UnknownExitTypeException;
import com.siriusgg.oot.model.places.Exit;

import javax.swing.*;
import java.awt.*;

public class AddTransitionDialog extends JDialog {
    public AddTransitionDialog(final AddTransitionController atc, final JFrame owner, final String title, final boolean modal, final Exit exit) {
        super(owner, title, modal);
        Container cp = getContentPane();
        setLayout(null);
        setSize(300, 200);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);
        JComboBox<String> possibleConnections = new JComboBox<>();
        try {
            atc.fillPossibleConnectionsComboBox(possibleConnections);
        } catch (final UnknownExitTypeException e) {
            e.printStackTrace();
        }
        possibleConnections.setBounds(0, 0, 200, 30);
        possibleConnections.setVisible(true);
        cp.add(possibleConnections);
        // ToDo
        setVisible(true);
    }
}
