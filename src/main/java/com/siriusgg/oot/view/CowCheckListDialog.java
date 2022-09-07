package com.siriusgg.oot.view;

import com.siriusgg.oot.controller.CowCheckListController;
import com.siriusgg.oot.model.OoTMConstants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CowCheckListDialog extends JDialog {
    private final CowCheckListController cclc;
    private final JCheckBox[] cowChecks;

    public CowCheckListDialog(final CowCheckListController cclc, final JFrame owner) {
        super(owner, "Cows", true);
        this.cclc = cclc;
        setLayout(null);
        Container cp = getContentPane();
        int borderSpacer = 5;
        int verticalElementSpacer = 5;
        int checkLabelWidth = 230;
        int checkLabelHeight = 20;
        int rightLAFSpacer = 16;
        int titleBarLAFSpacer = 38;
        cowChecks = new JCheckBox[OoTMConstants.COWS_AMOUNT];
        for (int i = 0; i < cowChecks.length; i++) {
            cowChecks[i] = new JCheckBox(OoTMConstants.NICE_COWS[i]);
            cowChecks[i].setBounds(borderSpacer, borderSpacer + (i * verticalElementSpacer) + (i * checkLabelHeight),
                    checkLabelWidth, checkLabelHeight);
            cclc.loadInitialCowState(cowChecks[i], i);
            cowChecks[i].setActionCommand("" + i);
            cowChecks[i].addActionListener(this::cowChecksActionPerformed);
            cp.add(cowChecks[i]);
        }
        JCheckBox checkBoxMasterQuestJabu = new JCheckBox("Seed has Master Quest Jabu-Jabu");
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
