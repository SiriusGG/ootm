package com.siriusgg.oot.controller;

import com.siriusgg.oot.exception.UnknownPlaceWithMapException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.PlaceWithMap;
import com.siriusgg.oot.model.time.Age;
import com.siriusgg.oot.model.util.SaveLoad;
import com.siriusgg.oot.view.SetHomeLocationDialog;

import javax.swing.*;

public class SetHomeLocationController {
    private final String seedName;
    private final JFrame owner;
    private final Age age;

    public SetHomeLocationController(final String seedName, final JFrame owner, final Age age) {
        this.seedName = seedName;
        this.owner = owner;
        this.age = age;
    }

    public void init() {
        new SetHomeLocationDialog(this);
    }

    public JFrame getFrame() {
        return owner;
    }

    public String getCurrentHomeText() {
        try {
            Settings s = Settings.getInstance(seedName);
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
        for (final String entry : OoTMConstants.NICE_PLACES_WITH_MAP) {
            listModel.addElement(entry);
        }
        listModel.removeElementAt(listModel.getSize() - 1); // remove zoom area "Thieves' Hideout Outside"
    }

    public void performSet(final SetHomeLocationDialog shld, final String niceName) {
        Settings s = Settings.getInstance(seedName);
        if (age == Age.CHILD) s.setChildHomeLocation(PlaceWithMap.fromNiceName(niceName));
        else s.setAdultHomeLocation(PlaceWithMap.fromNiceName(niceName));
        SaveLoad.saveSettings(seedName, s);
        shld.dispose();
    }
}
