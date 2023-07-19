package com.siriusgg.oot.view;

import com.siriusgg.oot.constants.OoTMConstants;
import com.siriusgg.oot.controller.*;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.translation.Translation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CowCheckListFrame extends JFrame {
    private final CowCheckListController cclc;
    private final JCheckBox[] cowChecks;

    public CowCheckListFrame(final CowCheckListController cclc, final CurrentLocationController clc, final String title) {
        super(title);
        clc.setCowCheckListOpen(true);
        Translation t = GlobalSettings.getInstance().getTranslation();
        this.cclc = cclc;
        setLayout(null);
        Container cp = getContentPane();
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(final WindowEvent e) {
                clc.setCowCheckListOpen(false);
                dispose();
            }
        });
        int borderSpacer = 5;
        int verticalElementSpacer = 5;
        int checkLabelWidth = 230;
        int checkLabelHeight = 20;
        int rightLAFSpacer = 16;
        int titleBarLAFSpacer = 38;
        cowChecks = new JCheckBox[OoTMConstants.COWS_AMOUNT];
        for (int i = 0; i < cowChecks.length; i++) {
            cowChecks[i] = new JCheckBox(t.getTranslatedText(OoTMConstants.NICE_COWS[i]));
            cowChecks[i].setBounds(borderSpacer, borderSpacer + (i * verticalElementSpacer) + (i * checkLabelHeight),
                    checkLabelWidth, checkLabelHeight);
            cclc.loadInitialCowState(cowChecks[i], i);
            cowChecks[i].setActionCommand("" + i);
            cowChecks[i].addActionListener(this::cowChecksActionPerformed);
            cp.add(cowChecks[i]);
        }
        JCheckBox checkBoxMasterQuestJabu = new JCheckBox(t.getTranslatedText("Seed has Master Quest Jabu-Jabu"));
        checkBoxMasterQuestJabu.setBounds(borderSpacer, borderSpacer +
                ((OoTMConstants.COWS_AMOUNT + 1) * checkLabelHeight) +
                (OoTMConstants.COWS_AMOUNT * verticalElementSpacer), checkLabelWidth, checkLabelHeight);
        cclc.setJabuState(checkBoxMasterQuestJabu);
        checkBoxMasterQuestJabu.addActionListener(this::checkBoxMasterQuestJabuActionPerformed);
        cp.add(checkBoxMasterQuestJabu);
        cowChecks[OoTMConstants.COWS_AMOUNT - 1].setVisible(checkBoxMasterQuestJabu.isSelected());
        int frameWidth = (2 * borderSpacer) + checkLabelWidth + rightLAFSpacer;
        int frameHeight = titleBarLAFSpacer + (2 * borderSpacer) +
                ((OoTMConstants.COWS_AMOUNT + 2) * checkLabelHeight) +
                ((OoTMConstants.COWS_AMOUNT + 1) * verticalElementSpacer);
        setSize(frameWidth, frameHeight);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);
        setResizable(false);
        setVisible(true);
    }

    private void cowChecksActionPerformed(final ActionEvent actionEvent) {
        cclc.switchCowState(actionEvent);
    }

    private void checkBoxMasterQuestJabuActionPerformed(final ActionEvent actionEvent) {
        cclc.switchMasterQuestJabuState(cowChecks[OoTMConstants.COWS_AMOUNT - 1]);
    }
}
