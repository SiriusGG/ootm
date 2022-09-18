package com.siriusgg.oot.controller;

import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.checklists.*;
import com.siriusgg.oot.model.util.SaveLoad;
import com.siriusgg.oot.view.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.Objects;

public class BeanSpotCheckListController {
    private final String seedName;
    private final CurrentLocationFrame clf;
    private final Translation t;
    private BeanSpotCheckList bscl;

    public BeanSpotCheckListController(final String seedName, final CurrentLocationFrame clf) {
        this.seedName = seedName;
        this.clf = clf;
        t = GlobalSettings.getInstance().getTranslation();
    }

    public void init() {
        prepareBeanSpotCheckList();
        new BeanSpotCheckListDialog(this, clf, t.getTranslatedText("Beans"));
    }

    private void prepareBeanSpotCheckList() {
        bscl = SaveLoad.loadBeanSpotCheckList(seedName);
        if (bscl == null) bscl = new BeanSpotCheckList();
    }

    public ImageIcon getBeanGraphic() {
        String graphicPath = OoTMConstants.SYMBOL_DIRECTORY + "/magic_bean.png";
        try {
            return new ImageIcon(ImageIO.read(Objects.requireNonNull(
                    getClass().getClassLoader().getResource(graphicPath))));
        } catch (final IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public ImageIcon getSkulltulaTokenGraphic() {
        String graphicPath = OoTMConstants.SYMBOL_DIRECTORY + "/skulltula_token.png";
        try {
            return new ImageIcon(ImageIO.read(Objects.requireNonNull(
                    getClass().getClassLoader().getResource(graphicPath))));
        } catch (final IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void loadInitialBeanState(final JCheckBox checkBox, final int index) {
        checkBox.setSelected(bscl.getBeanCheckAt(index));
    }

    public void switchBeanState(final ActionEvent actionEvent) {
        JCheckBox checkBox = (JCheckBox)actionEvent.getSource();
        int i = Integer.parseInt(checkBox.getActionCommand());
        bscl.setBeanCheckAt(i, !bscl.getBeanCheckAt(i));
        SaveLoad.saveBeanSpotCheckList(seedName, bscl);
    }

    public void loadInitialSkulltulaState(final JCheckBox checkBox, final int index) {
        checkBox.setSelected(bscl.getSkulltulaCheckAt(index));
    }

    public void switchSkulltulaState(final ActionEvent actionEvent) {
        JCheckBox checkBox = (JCheckBox)actionEvent.getSource();
        int i = Integer.parseInt(checkBox.getActionCommand());
        bscl.setSkulltulaCheckAt(i, !bscl.getSkulltulaCheckAt(i));
        SaveLoad.saveBeanSpotCheckList(seedName, bscl);
    }
}
