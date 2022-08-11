package com.siriusgg.oot.controller;

import com.siriusgg.oot.components.*;
import com.siriusgg.oot.exception.*;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.time.Age;
import com.siriusgg.oot.model.util.*;
import com.siriusgg.oot.view.CurrentLocationFrame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.Objects;

public class CurrentLocationController {
    private final String seedName;
    private ExitMap exitMap;
    private CurrentLocationFrame clf;
    private ImageIcon iiMap = null;
    private int transitionButtonWidth;
    private int transitionButtonHeight;

    public CurrentLocationController(final String seedName, final ExitMap exitMap) {
        this.seedName = seedName;
        this.exitMap = exitMap;
    }

    public void init() {
        setTransitionButtonSizes();
        loadMap();
        initFrame();
    }

    public void initFrame() {
        clf = new CurrentLocationFrame(this);
        clf.init();
        ComponentFunctions.center(clf);
        clf.setVisible(true);
    }

    private void loadMap() {
        ImageIcon mapGraphic = null;
        String mapName = exitMap.getMap();
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
        this.exitMap = exitMap;
        setTransitionButtonSizes();
        loadMap();
        reInitFrame();
    }

    private void setTransitionButtonSizes() {
        try {
            transitionButtonWidth = exitMap.getPreferredButtonWidth();
            transitionButtonHeight = exitMap.getPreferredButtonHeight();
        } catch (final UnknownPerspectiveException e) {
            e.printStackTrace();
            transitionButtonWidth = 60;
            transitionButtonHeight = 60;
        }
    }

    public void reInitFrame() {
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

    @SuppressWarnings("unused")
    public void reposition(final int x, final int y) {
        clf.setLocation(x, y);
    }

    public void fillMapsComboBox(final JComboBox<String> mapsComboBox) {
        String[] placesWithMap = PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap();
        int maxAmount = PermanentlyLoadedInformation.getInstance().getSelectablePlacesAmount();
        for (int i = 0; i < placesWithMap.length; i++) {
            if (i < maxAmount) {
                String name = placesWithMap[i];
                mapsComboBox.addItem(name);
            }
        }
    }

    public void fillAgesComboBox(final JComboBox<String> ageComboBox) {
        for (final Age a : Age.values()) {
            try {
                ageComboBox.addItem(Age.getAgeString(a));
            } catch (final UnknownAgeException e) {
                e.printStackTrace();
            }
        }
    }

    public void fillPerspectivesComboBox(final JComboBox<String> perspectiveComboBox) {
        for (final Perspective p : Perspective.values()) {
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
            Settings.getInstance().saveSettings(seedName);
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
            Settings.getInstance().saveSettings(seedName);
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
        if (Settings.getInstance().getHideShowTransitionsMode() == HideShowTransitionsMode.SHOW) {
            int mapWidth = getMapWidth();
            int mapHeight = getMapHeight();
            try {
                Position[] exitPositions = exitMap.getExitPositions();
                for (int i = 0; i < exitPositions.length; i++) {
                    Position exitPosition = exitPositions[i];
                    TransitionButton transitionButton = new TransitionButton(exitMap.getExit(i));
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
                    final int finalI = i;
                    transitionButton.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseEntered(final MouseEvent e) {
                            showTransitionInformation(e, finalI);
                        }

                        @Override
                        public void mouseExited(final MouseEvent e) {
                            hideTransitionInformation();
                        }
                    });
                    layeredPane.add(transitionButton, JLayeredPane.MODAL_LAYER);
                }
            } catch (final UnknownPerspectiveException | UnknownAgeException e) {
                e.printStackTrace();
            }
        }
        layeredPane.repaint();
    }

    private void showTransitionInformation(final MouseEvent e, final int i) {
        JLayeredPane layeredPane = clf.getTransitionLayeredPane();
        int containerWidth = layeredPane.getWidth();
        int containerHeight = layeredPane.getHeight();
        TransitionInformationPanel tip = new TransitionInformationPanel(exitMap.getExit(i));
        JButton button = (JButton) e.getSource();
        int buttonX = button.getX();
        int buttonY = button.getY();
        int buttonWidth = button.getWidth();
        int buttonHeight = button.getHeight();
        int buttonCenterX = buttonX + (buttonWidth / 2);
        int buttonCenterY = buttonY + (buttonHeight / 2);
        int tipWidth = tip.getWidth();
        int tipHeight = tip.getHeight();
        int preferredX = buttonCenterX - (tipWidth / 2);
        int preferredY = buttonCenterY - (tipHeight / 2);
        int leftBorderSpacerPixels = 2;
        int upperBorderSpacerPixels = 1;
        int rightBorderSpacerPixels = 2;
        int lowerBorderSpacerPixels = 1;
        int x = preferredX;
        int y = preferredY;
        if (x < leftBorderSpacerPixels) x = leftBorderSpacerPixels;
        if (y < upperBorderSpacerPixels) y = upperBorderSpacerPixels;
        if (x + tipWidth > containerWidth - rightBorderSpacerPixels) x = containerWidth - tipWidth - rightBorderSpacerPixels;
        if (y + tipHeight > containerHeight - lowerBorderSpacerPixels) y = containerHeight - tipHeight - lowerBorderSpacerPixels;
        tip.setLocation(x, y);
        layeredPane.add(tip, JLayeredPane.POPUP_LAYER);
        layeredPane.repaint();
    }

    private void hideTransitionInformation() {
        JLayeredPane layeredPane = clf.getTransitionLayeredPane();
        Component[] components = layeredPane.getComponentsInLayer(JLayeredPane.POPUP_LAYER);
        for (final Component component : components) {
            if (component instanceof TransitionInformationPanel) {
                layeredPane.remove(component);
            }
        }
        layeredPane.repaint();
    }

    private void transitionButtonActionPerformed(final ActionEvent actionEvent) {
        TransitionButton button = (TransitionButton) actionEvent.getSource();
        if (button.getExit().getExitType() != ExitType.UNCHANGING) { // dynamic transition
            if (button.getExit().getDestination() == null) {
                if (button.getExit().getDestinationExitMap() == null) {
                    if (button.getExit().getDestinationString() == null) {
                        AddTransitionController atc = new AddTransitionController(this, button.getExit(), seedName);
                        atc.init();
                    }
                } else {
                    try {
                        reInit((ExitMap)button.getExit().getDestinationExitMap().newInstance());
                    } catch (final InstantiationException | IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            } else {
                reInit(button.getExit().getDestination().getExitMap());
            }
        } else { // unchanging transition
            if (button.getExit().getDestination() != null) {
                if (button.getExit().getDestination().getExitMap() != null) {
                    reInit(button.getExit().getDestination().getExitMap());
                }
            }
            if (button.getExit().getDestinationExitMap() != null) {
                try {
                    reInit((ExitMap) button.getExit().getDestinationExitMap().newInstance());
                } catch (final InstantiationException | IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        hideTransitionInformation();
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
                    origImage = new ImageIcon(ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().getResource(TransitionGraphic.UNCHANGING.getTransitionGraphicPath()))));
                    break;
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
            if (component instanceof TransitionButton) {
                layeredPane.remove(component);
            }
        }
        layeredPane.repaint();
    }

    public ExitMap getExitMap() {
        return exitMap;
    }

    public String getHideShowTransitionsButtonText() {
        if (Settings.getInstance().getHideShowTransitionsMode() == HideShowTransitionsMode.SHOW) {
            return "Hide transitions";
        } else {
            return "Show transitions";
        }
    }

    public void buttonHideShowTransitionMode() {
        if (Settings.getInstance().getHideShowTransitionsMode() == HideShowTransitionsMode.SHOW) {
            hideTransitionBoxes();
            Settings.getInstance().switchHideShowTransitionMode();
            Settings.getInstance().saveSettings(seedName);
        } else {
            Settings.getInstance().switchHideShowTransitionMode();
            Settings.getInstance().saveSettings(seedName);
            drawTransitionBoxes();
        }
        clf.getHideShowTransitionsButton().setText(getHideShowTransitionsButtonText());
    }

    public void buttonZoom() {
        // Gerudo's Fortress -> zoom in -> Outside Thieves' Hideout
        if (exitMap.getName().equals(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[8])) {
            loadMap(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[40]);
        }
        // Outside Thieves' Hideout -> zoom out -> Gerudo's Fortress
        else if (exitMap.getName().equals(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[40])) {
            loadMap(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[8]);
        }
        // error case
        else {
            throw new IllegalStateException("Zoom button should not exist on this map.");
        }
    }

    public void hideShowZoomButton() {
        clf.getZoomButton().setVisible(exitMap.getZoom() != null);
    }

    public boolean getZoomable() {
        return exitMap.getZoom() != null;
    }

    public CurrentLocationFrame getFrame() {
        return clf;
    }
}
