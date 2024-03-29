package com.siriusgg.oot.controller;

import com.siriusgg.oot.constants.OoTMConstants;
import com.siriusgg.oot.exception.UnknownPlaceWithMapException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.PlaceWithMap;
import com.siriusgg.oot.model.time.Age;
import com.siriusgg.oot.translation.Translation;
import com.siriusgg.oot.view.SetHomeLocationDialog;

import javax.swing.*;
import java.util.*;

public class SetHomeLocationController {
    private final String seedName;
    private final JFrame owner;
    private final Age age;
    private final Translation t;

    public SetHomeLocationController(final String seedName, final JFrame owner, final Age age) {
        this.seedName = seedName;
        this.owner = owner;
        this.age = age;
        t = GlobalSettings.getInstance().getTranslation();
    }

    public void init() {
        String originalTitle = "Set " + getLowerCaseAgeText() + " home location";
        String translatedTitle = t.getTranslatedText(originalTitle);
        new SetHomeLocationDialog(this, translatedTitle);
    }

    public JFrame getFrame() {
        return owner;
    }

    public String getCurrentHomeText() {
        try {
            SeedSettings s = SeedSettings.getInstance(seedName);
            if (age == Age.CHILD) return PlaceWithMap.getNiceName(s.getChildHomeLocation());
            else return PlaceWithMap.getNiceName(s.getAdultHomeLocation());
        } catch (final UnknownPlaceWithMapException e) {
            e.printStackTrace();
            return "Unknown";
        }
    }

    public String getLowerCaseAgeText() {
        return age.toString().toLowerCase();
    }

    public void fillList(final JList<String> list) {
        DefaultListModel<String> listModel = (DefaultListModel<String>) list.getModel();
        ArrayList<String> places = new ArrayList<>();
        for (int i = 0; i < OoTMConstants.SELECTABLE_PLACES_AMOUNT; i++) {
            places.add(t.getTranslatedText(OoTMConstants.NICE_PLACES_WITH_MAP[i]));
        }
        Collections.sort(places);
        for (final String place : places) {
            listModel.addElement(place);
        }
    }

    public void performSet(final SetHomeLocationDialog shld, final String niceName) {
        SeedSettings s = SeedSettings.getInstance(seedName);
        if (age == Age.CHILD) s.setChildHomeLocation(PlaceWithMap.fromNiceName(niceName));
        else s.setAdultHomeLocation(PlaceWithMap.fromNiceName(niceName));
        SeedSettings.saveSeedSettings(seedName, s);
        shld.dispose();
    }
}
