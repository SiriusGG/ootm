package com.siriusgg.oot.controller;

import com.siriusgg.oot.Constants;
import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.ExitMap;
import com.siriusgg.oot.model.places.exitmaps.*;
import com.siriusgg.oot.model.time.Age;
import com.siriusgg.oot.model.util.*;
import com.siriusgg.oot.view.MainMenuFrame;

import java.awt.*;
import java.io.File;
import java.io.IOException;

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
            Settings.getInstance().saveSettings(seedName);
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
            Settings s = Settings.getInstance(seedName);
            mmf.setVisible(false);
            ExitMap exitMap;
            if (s.getTime().getAge() == Age.CHILD) exitMap = new LinksHouse(seedName);
            else exitMap = new TempleOfTime(seedName);
            CurrentLocationController clc = new CurrentLocationController(seedName, exitMap);
            clc.init();
            mmf.dispose();
        }
    }

    public void browse() {
        try {
            File d = new File(Constants.USER_HOME + "/" + Constants.SAVE_DIRECTORY);
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
