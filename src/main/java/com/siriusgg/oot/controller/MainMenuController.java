package com.siriusgg.oot.controller;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.ExitMap;
import com.siriusgg.oot.model.places.exitmaps.*;
import com.siriusgg.oot.model.time.Age;
import com.siriusgg.oot.model.util.*;
import com.siriusgg.oot.view.MainMenuFrame;

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
        esnc.init();
        String seedName = esnc.getSeedName();
        start(seedName);
        Settings.getInstance().saveSettings(seedName);
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
            if (s.getTime().getAge() == Age.CHILD) exitMap = new LinksHouse();
            else exitMap = new TempleOfTime();
            CurrentLocationController clc = new CurrentLocationController(seedName, exitMap);
            clc.init();
            mmf.dispose();
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
