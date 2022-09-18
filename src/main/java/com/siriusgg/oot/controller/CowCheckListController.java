package com.siriusgg.oot.controller;

import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.checklists.CowCheckList;
import com.siriusgg.oot.model.util.SaveLoad;
import com.siriusgg.oot.view.*;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class CowCheckListController {
    private final String seedName;
    private final CurrentLocationFrame clf;
    private final Translation t;
    private CowCheckList ccl;

    public CowCheckListController(final String seedName, final CurrentLocationFrame clf) {
        this.seedName = seedName;
        this.clf = clf;
        t = GlobalSettings.getInstance().getTranslation();
    }

    public void init() {
        prepareCowCheckList();
        new CowCheckListDialog(this, clf, t.getTranslatedText("Cows"));
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
        checkBoxMasterQuestJabu.setSelected(SeedSettings.getInstance(seedName).hasMasterQuestJabuJabu());
    }

    public void switchMasterQuestJabuState(final JCheckBox checkBoxMasterQuestJabu) {
        SeedSettings s = SeedSettings.getInstance(seedName);
        s.setMasterQuestJabuJabu(!s.hasMasterQuestJabuJabu());
        SeedSettings.saveSeedSettings(seedName, s);
        checkBoxMasterQuestJabu.setVisible(s.hasMasterQuestJabuJabu());
    }
}
