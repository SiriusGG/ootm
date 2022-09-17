package com.siriusgg.oot.controller;

import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.SeedSettings;
import com.siriusgg.oot.model.places.ExitMap;
import com.siriusgg.oot.model.time.Age;
import com.siriusgg.oot.model.util.*;
import com.siriusgg.oot.view.MainMenuFrame;

import java.awt.*;
import java.io.*;

public class MainMenuController {
    private MainMenuFrame mmf;

    public MainMenuController() {}

    public void init() {
        mmf = new MainMenuFrame(this);
        ComponentFunctions.center(mmf);
        mmf.setVisible(true);
    }

    public void newSeed() {
        EnterSeedNameController esnc = new EnterSeedNameController(mmf);
        boolean success = esnc.init();
        if (success) {
            String seedName = esnc.getSeedName();
            start(seedName);
            SeedSettings.saveSeedSettings(seedName, SeedSettings.getInstance(seedName));
        }
    }

    public void loadSeed() {
        if (SaveLoad.getSeedsAmount() >= 1) {
            LoadSeedController lsc = new LoadSeedController(this);
            lsc.init();
            String seedName = lsc.getSeedName();
            start(seedName);
        } else {
            NoSavedSeedsController nssc = new NoSavedSeedsController(this);
            nssc.init();
        }
    }

    private void start(final String seedName) {
        if (seedName != null && !seedName.equals("")) {
            SeedSettings s = SeedSettings.getInstance(seedName);
            mmf.setVisible(false);
            ExitMap exitMap;
            if (s.getTime().getAge() == Age.CHILD) exitMap = ExitMap.fromPlaceWithMap(s.getChildHomeLocation(), seedName);
            else exitMap = ExitMap.fromPlaceWithMap(s.getAdultHomeLocation(), seedName);
            CurrentLocationController clc = new CurrentLocationController(seedName, exitMap);
            clc.init();
            mmf.dispose();
        }
    }

    public void openSettingsDialog() {
        GlobalSettingsController gsc = new GlobalSettingsController(mmf);
        gsc.init();
    }

    public void browse() {
        try {
            File d = new File(OoTMConstants.USER_HOME + "/" + OoTMConstants.SAVE_DIRECTORY);
            if (!d.exists()) {
                SaveLoad.ensureBaseDirectoryExists();
            }
            Desktop.getDesktop().open(d);
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }

    public void about() {
        AboutController ac = new AboutController();
        ac.init();
    }

    public MainMenuFrame getFrame() {
        return mmf;
    }
}
