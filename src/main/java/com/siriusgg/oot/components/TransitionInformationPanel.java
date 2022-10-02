package com.siriusgg.oot.components;

import com.siriusgg.oot.exception.UnknownExitTypeException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.translation.Translation;

import javax.swing.*;
import java.awt.*;

public class TransitionInformationPanel extends JPanel {
    public static final int TRANSITION_INFORMATION_PANEL_WIDTH = 250;
    public static final int TRANSITION_INFORMATION_PANEL_HEIGHT = 140;

    public TransitionInformationPanel(final Exit exit) {
        super();
        Translation t = GlobalSettings.getInstance().getTranslation();
        setLayout(null);
        setSize(TRANSITION_INFORMATION_PANEL_WIDTH, TRANSITION_INFORMATION_PANEL_HEIGHT);
        setBackground(Color.WHITE);
        String transitionNiceName = TransitionNames.toNiceString(exit.getName());
        int lineHeight = 20;
        int sideSpacer = 5;
        int lineWidth = TRANSITION_INFORMATION_PANEL_WIDTH - (2 * sideSpacer);
        JLabel[] textLines = new JLabel[7];
        for (int i = 0; i < textLines.length; i++) {
            textLines[i] = new JLabel();
            textLines[i].setHorizontalAlignment(JLabel.CENTER);
            textLines[i].setBounds(sideSpacer, (i * lineHeight), lineWidth, lineHeight);
        }
        textLines[0].setText(t.getTranslatedText(TransitionNames.getOriginalStart(transitionNiceName)));
        textLines[1].setText(t.getTranslatedText("to"));
        textLines[2].setText(t.getTranslatedText(TransitionNames.getOriginalDestination(transitionNiceName)));
        try {
            textLines[3].setText(t.getTranslatedText("(" + ExitType.getExitTypeString(exit.getExitType()) + ")"));
        } catch (final UnknownExitTypeException e) {
            textLines[3].setText("(UNKNOWN TYPE)");
        }
        textLines[4].setText(t.getTranslatedText("now leads to"));
        if (exit.getDestination() != null || exit.getDestinationExitMap() != null ||
                exit.getDestinationString() != null) {
            if (exit.getDestination() != null) {
                textLines[5].setText(t.getTranslatedText(TransitionNames.toNiceString(exit.getDestinationName())));
            } else if (exit.getDestinationExitMap() != null) {
                textLines[5].setText(t.getTranslatedText(NiceNames.toNiceName(exit.getDestinationExitMap().getSimpleName())));
            } else {
                textLines[5].setText(t.getTranslatedText(exit.getDestinationString()));
            }
        } else {
            textLines[5].setText(t.getTranslatedText("Unknown"));
        }
        if (exit.getDestination() != null) {
            try {
                textLines[6].setText(t.getTranslatedText("(" + ExitType.getExitTypeString(exit.getDestination().getExitType()) + ")"));
            } catch (final UnknownExitTypeException e) {
                textLines[6].setText("(UNKNOWN TYPE)");
            }
        } else {
            try {
                textLines[6].setText(t.getTranslatedText("(" + ExitType.getExitTypeString(ExitType.invert(exit.getExitType())) + ")"));
            } catch (final UnknownExitTypeException e) {
                textLines[6].setText("(UNKNOWN TYPE)");
            }
        }
        for (final JLabel textLine : textLines) {
            add(textLine);
        }
        setVisible(true);
    }
}
