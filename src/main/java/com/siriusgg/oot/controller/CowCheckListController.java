package com.siriusgg.oot.controller;

import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.checklists.CowCheckList;
import com.siriusgg.oot.model.util.SaveLoad;
import com.siriusgg.oot.view.CowCheckListDialog;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class CowCheckListController {
    private final String seedName;
    private final JFrame owner;
    private CowCheckList ccl;

    public CowCheckListController(final String seedName, final JFrame owner) {
        this.seedName = seedName;
        this.owner = owner;
    }

    public void init() {
        prepareCowCheckList();
        new CowCheckListDialog(this, owner);
    }

    private void prepareCowCheckList() {
        ccl = SaveLoad.loadCowCheckList(seedName);
        if (ccl == null) ccl = new CowCheckList();
    }

    public void loadInitialCowState(final JCheckBox checkBox, final int index) {
        checkBox.setSelected(ccl.getCowCheckAt(index));
    }

    public void switchCowState(final ActionEvent actionEvent) {
        JCheckBox checkBox = (JCheckBox)actionEvent.getSource();
        int i = Integer.parseInt(checkBox.getActionCommand());
        ccl.setCowCheckAt(i, !ccl.getCowCheckAt(i));
        SaveLoad.saveCowCheckList(seedName, ccl);
    }

    public void setJabuState(final JCheckBox checkBoxMasterQuestJabu) {
        checkBoxMasterQuestJabu.setSelected(Settings.getInstance(seedName).hasMasterQuestJabuJabu());
    }

    public void switchMasterQuestJabuState(final JCheckBox checkBoxMasterQuestJabu) {
        Settings s = Settings.getInstance(seedName);
        s.setMasterQuestJabuJabu(!s.hasMasterQuestJabuJabu());
        Settings.saveSettings(seedName, s);
        checkBoxMasterQuestJabu.setVisible(s.hasMasterQuestJabuJabu());
    }
}
