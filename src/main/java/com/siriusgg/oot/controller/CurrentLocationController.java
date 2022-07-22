package com.siriusgg.oot.controller;

import com.siriusgg.oot.exception.*;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exitmaps.ExitMap;
import com.siriusgg.oot.model.time.Age;
import com.siriusgg.oot.model.util.*;
import com.siriusgg.oot.view.CurrentLocationFrame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.Objects;

public class CurrentLocationController {
    private ExitMap exitMap;
    private CurrentLocationFrame clf;
    private ImageIcon iiMap = null;
    private int transitionButtonWidth;
    private int transitionButtonHeight;

    public CurrentLocationController(final ExitMap exitMap) {
        this.exitMap = exitMap;
    }

    public void init() {
        try {
            transitionButtonWidth = exitMap.getPreferredButtonWidth();
            transitionButtonHeight = exitMap.getPreferredButtonHeight();
        } catch (final UnknownPerspectiveException e) {
            e.printStackTrace();
            transitionButtonWidth = 60;
            transitionButtonHeight = 60;
        }
        prepareMap();
        clf = new CurrentLocationFrame(this);
        clf.init();
        ComponentFunctions.center(clf);
        clf.setVisible(true);
    }

    private void prepareMap() {
        ImageIcon mapGraphic = null;
        String mapName = exitMap.getMap();
        System.out.println(mapName);
        try {
            mapGraphic = new ImageIcon(ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().getResource(mapName))));
        } catch (final IOException e) {
            e.printStackTrace();
        }
        if (mapGraphic != null) {
            iiMap = ImageIconFunctions.limitSize(mapGraphic, 80);
        }
    }

    public void reInit(final ExitMap exitMap) {
        try {
            transitionButtonWidth = exitMap.getPreferredButtonWidth();
            transitionButtonHeight = exitMap.getPreferredButtonHeight();
        } catch (final UnknownPerspectiveException e) {
            e.printStackTrace();
            transitionButtonWidth = 60;
            transitionButtonHeight = 60;
        }
        this.exitMap = exitMap;
        prepareMap();
        clf.reInit();
        ComponentFunctions.center(clf);
    }

    public int getMapWidth() {
        return iiMap.getIconWidth();
    }

    public int getMapHeight() {
        return iiMap.getIconHeight();
    }

    public ImageIcon getMapImage() {
        return iiMap;
    }

    public void fillMapsComboBox(final JComboBox<String> mapsComboBox) {
        for (String name : PermanentlyLoadedInformation.getInstance().getPlacesWithMap()) {
            mapsComboBox.addItem(name);
        }
    }

    public void fillAgesComboBox(final JComboBox<String> ageComboBox) {
        for (Age a : Age.values()) {
            try {
                ageComboBox.addItem(Age.getAgeString(a));
            } catch (final UnknownAgeException e) {
                e.printStackTrace();
            }
        }
    }

    public void fillPerspectivesComboBox(final JComboBox<String> perspectiveComboBox) {
        for (Perspective p : Perspective.values()) {
            try {
                perspectiveComboBox.addItem(Perspective.getPerspectiveString(p));
            } catch (final UnknownPerspectiveException e) {
                e.printStackTrace();
            }
        }
    }

    public void setSelectedMap(final JComboBox<String> mapsComboBox) {
        mapsComboBox.setSelectedItem(exitMap.getName());
    }

    public void setSelectedAge(final JComboBox<String> ageComboBox) {
        try {
            ageComboBox.setSelectedItem(Age.getAgeString(Settings.getInstance().getTime().getAge()));
        } catch (final UnknownAgeException e) {
            e.printStackTrace();
        }
    }

    public void setSelectedPerspective(final JComboBox<String> perspectiveComboBox) {
        try {
            perspectiveComboBox.setSelectedItem(Perspective.getPerspectiveString(Settings.getInstance().getPerspective()));
        } catch (final UnknownPerspectiveException e) {
            e.printStackTrace();
        }
    }

    public void loadMap(final String selectedItem) {
        try {
            reInit(ExitMap.toExitMap(selectedItem));
        } catch (final UnknownPlaceWithMapStringException e) {
            e.printStackTrace();
        }
    }

    public void loadAge(final String selectedItem) throws UnknownAgeStringException {
        try {
            if (selectedItem.equals(Age.getAgeString(Age.CHILD))) {
                Settings.getInstance().getTime().setChild();
            } else if (selectedItem.equals(Age.getAgeString(Age.ADULT))) {
                Settings.getInstance().getTime().setAdult();
            } else throw new UnknownAgeStringException(selectedItem);
        } catch (final UnknownAgeException e) {
            e.printStackTrace();
        }
        try {
            reInit(ExitMap.toExitMap(exitMap.getName()));
        } catch (final UnknownPlaceWithMapStringException e) {
            e.printStackTrace();
        }
    }

    public void loadPerspective(final String selectedItem) throws UnknownPerspectiveStringException {
        try {
            if (selectedItem.equals(Perspective.getPerspectiveString(Perspective.SIDE))) {
                Settings.getInstance().setPerspective(Perspective.SIDE);
            } else if (selectedItem.equals(Perspective.getPerspectiveString(Perspective.TOP))) {
                Settings.getInstance().setPerspective(Perspective.TOP);
            } else throw new UnknownPerspectiveStringException(selectedItem);
        } catch (final UnknownPerspectiveException e) {
            e.printStackTrace();
        }
        try {
            reInit(ExitMap.toExitMap(exitMap.getName()));
        } catch (final UnknownPlaceWithMapStringException e) {
            e.printStackTrace();
        }
    }

    public void drawTransitionBoxes() {
        JLayeredPane layeredPane = clf.getTransitionLayeredPane();
        if (Settings.getInstance().getHideShow().equals("show")) {
            int mapWidth = getMapWidth();
            int mapHeight = getMapHeight();
            try {
                Position[] exitPositions = exitMap.getExitPositions();
                for (int i = 0; i < exitPositions.length; i++) {
                    Position exitPosition = exitPositions[i];
                    JButton transitionButton = new JButton();
                    try {
                        setButtonImage(transitionButton, exitMap.getExit(i).getExitType());
                    } catch (final UnknownExitTypeException e) {
                        e.printStackTrace();
                    }
                    transitionButton.setBounds((int) (mapWidth * (exitPosition.getX() / 100)),
                            (int) (mapHeight * (exitPosition.getY() / 100)), transitionButtonWidth, transitionButtonHeight);
                    transitionButton.setBackground(Color.WHITE);
                    transitionButton.setActionCommand(exitMap.getExit(i).getName());
                    if (Settings.getInstance().getTime().getAge() == Age.CHILD) {
                        transitionButton.setVisible(exitMap.getExit(i).canBeUsedAsChild());
                    } else if (Settings.getInstance().getTime().getAge() == Age.ADULT) {
                        transitionButton.setVisible(exitMap.getExit(i).canBeUsedAsAdult());
                    } else {
                        throw new UnknownAgeException(Settings.getInstance().getTime().getAge());
                    }
                    transitionButton.addActionListener(this::transitionButtonActionPerformed);
                    layeredPane.add(transitionButton, JLayeredPane.MODAL_LAYER);
                }
            } catch (final UnknownPerspectiveException | UnknownAgeException e) {
                e.printStackTrace();
            }
        }
        layeredPane.repaint();
    }

    private void transitionButtonActionPerformed(final ActionEvent actionEvent) {
        System.out.println(actionEvent.getActionCommand());
        // ToDo
    }

    public void setButtonImage(final JButton button, final ExitType exitType) throws UnknownExitTypeException {
        ImageIcon origImage = null;
        try {
            switch (exitType) {
                case DOOR_ENTRANCE:
                case DOOR_EXIT:
                    origImage = new ImageIcon(ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().getResource(TransitionGraphic.DOOR.getTransitionGraphicPath()))));
                    break;
                case DUNGEON_ENTRANCE:
                case DUNGEON_EXIT:
                    origImage = new ImageIcon(ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().getResource(TransitionGraphic.DUNGEON.getTransitionGraphicPath()))));
                    break;
                case GROTTO_ENTRANCE:
                case GROTTO_EXIT:
                    origImage = new ImageIcon(ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().getResource(TransitionGraphic.GROTTO.getTransitionGraphicPath()))));
                    break;
                case OVERWORLD:
                    origImage = new ImageIcon(ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().getResource(TransitionGraphic.OVERWORLD.getTransitionGraphicPath()))));
                    break;
                case OWL_START:
                case OWL_LANDING:
                    origImage = new ImageIcon(ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().getResource(TransitionGraphic.OWL.getTransitionGraphicPath()))));
                    break;
                case UNCHANGING:
                    // ToDo: "Unchanging" transition graphic?
                case WARP:
                    // ToDo: "Warp" transition graphic?
                    break;
                default:
                    throw new UnknownExitTypeException(exitType);
            }
        } catch (final IOException | UnknownTransitionGraphicException e) {
            e.printStackTrace();
        }
        if (origImage != null) {
            Image oldImage = origImage.getImage();
            Image newImage = oldImage.getScaledInstance(transitionButtonWidth, transitionButtonHeight, Image.SCALE_SMOOTH);
            button.setIcon(new ImageIcon(newImage));
        }
    }

    public void hideTransitionBoxes() {
        JLayeredPane layeredPane = clf.getTransitionLayeredPane();
        Component[] components = layeredPane.getComponents();
        for (final Component component : components) {
            if (!(component instanceof JLabel)) {
                layeredPane.remove(component);
            }
        }
        layeredPane.repaint();
    }

    public ExitMap getExitMap() {
        return exitMap;
    }

    public String getHideShowTransitionsText() {
        if (Settings.getInstance().getHideShow().equals("show")) {
            return "Hide transitions";
        } else {
            return "Show transitions";
        }
    }

    public void buttonHideShow() {
        if (Settings.getInstance().getHideShow().equals("show")) {
            hideTransitionBoxes();
            Settings.getInstance().switchHideShow();
        } else {
            Settings.getInstance().switchHideShow();
            drawTransitionBoxes();
        }
        clf.getHideShowTransitionsButton().setText(getHideShowTransitionsText());
    }
}
