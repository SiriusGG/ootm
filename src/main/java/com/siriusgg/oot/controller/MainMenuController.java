package com.siriusgg.oot.controller;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.ExitMap;
import com.siriusgg.oot.model.places.exitmaps.*;
import com.siriusgg.oot.model.util.ComponentFunctions;
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
        if (seedName != null && !seedName.equals("")) {
            Settings.getInstance(seedName);
            mmf.setVisible(false);
            ExitMap exitMap = new LinksHouse();
            CurrentLocationController clc = new CurrentLocationController(seedName, exitMap);
            clc.init();
            mmf.dispose();
        }
    }

    public void loadSeed() {
        // ToDo
    }

    public void about() {
        AboutController ac = new AboutController();
        ac.init();
    }
}
