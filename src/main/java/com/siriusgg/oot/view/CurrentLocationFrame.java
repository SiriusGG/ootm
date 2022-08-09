package com.siriusgg.oot.view;

import com.siriusgg.oot.controller.CurrentLocationController;
import com.siriusgg.oot.exception.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;

public class CurrentLocationFrame extends JFrame {
    private final CurrentLocationController clc;

    private int leftLAFSpacer;
    private int mapWidth;
    private int rightLAFSpacer;
    private int tileBarLAFSpacer;
    private int mapHeight;
    private int footerLAFSpacer;
    private int placeComboBoxWidth;
    private int optionComboBoxWidth;
    private int hideShowTransitionsButtonWidth;
    private int zoomButtonWidth;
    private int buttonBarHeight;
    private int buttonBarElementHeight;
    private int miniSpacer;
    private int frameWidth;
    private int frameWidthByMap;
    private int frameWidthByBar;
    private int frameHeight;

    private JLabel mapLabel;
    private JPanel bottomBar;
    private JComboBox<String> mapsComboBox;
    private JComboBox<String> ageComboBox;
    private JComboBox<String> perspectiveComboBox;
    private JButton hideShowTransitionsButton;
    private JButton zoomButton;
    private JLayeredPane layeredPane;

    public CurrentLocationFrame(final CurrentLocationController clc) {
        super("OoT Maps");
        this.clc = clc;
    }

    public void init() {
        setTitle("OoT Maps: " + clc.getExitMap().getName());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(null);
        leftLAFSpacer = 0;
        mapWidth = clc.getMapWidth();
        rightLAFSpacer = 16;
        tileBarLAFSpacer = 38;
        mapHeight = clc.getMapHeight();
        footerLAFSpacer = 0;
        placeComboBoxWidth = 200;
        optionComboBoxWidth = 70;
        hideShowTransitionsButtonWidth = 140;
        zoomButtonWidth = 80;
        buttonBarHeight = 50;
        buttonBarElementHeight = 40;
        miniSpacer = 5;
        frameWidthByMap = calcFrameWidthByMap();
        frameWidthByBar = calcFrameWidthByBar();
        frameWidth = Math.max(frameWidthByMap, frameWidthByBar);
        frameHeight = calcFrameHeight();
        mapLabel = new JLabel(clc.getMapImage());
        mapLabel.setBounds(0, 0, mapWidth, mapHeight);
        bottomBar = new JPanel();
        bottomBar.setLayout(null);
        bottomBar.setBounds(0, mapHeight, frameWidth, buttonBarHeight);
        bottomBar.setBackground(Color.GRAY);
        mapsComboBox = new JComboBox<>();
        clc.fillMapsComboBox(mapsComboBox);
        mapsComboBox.setBounds(miniSpacer, miniSpacer, placeComboBoxWidth, buttonBarElementHeight);
        mapsComboBox.setBackground(Color.WHITE);
        clc.setSelectedMap(mapsComboBox);
        mapsComboBox.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                clc.loadMap((String) Objects.requireNonNull(mapsComboBox.getSelectedItem()));
            }
        });
        bottomBar.add(mapsComboBox);
        ageComboBox = new JComboBox<>();
        clc.fillAgesComboBox(ageComboBox);
        ageComboBox.setBounds((2 * miniSpacer) + placeComboBoxWidth, miniSpacer, optionComboBoxWidth, buttonBarElementHeight);
        ageComboBox.setBackground(Color.WHITE);
        clc.setSelectedAge(ageComboBox);
        ageComboBox.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                try {
                    clc.loadAge((String) Objects.requireNonNull(ageComboBox.getSelectedItem()));
                } catch (final UnknownAgeStringException ex) {
                    ex.printStackTrace();
                }
            }
        });
        bottomBar.add(ageComboBox);
        perspectiveComboBox = new JComboBox<>();
        clc.fillPerspectivesComboBox(perspectiveComboBox);
        perspectiveComboBox.setBounds((3 * miniSpacer) + placeComboBoxWidth + optionComboBoxWidth, miniSpacer,
                optionComboBoxWidth, buttonBarElementHeight);
        perspectiveComboBox.setBackground(Color.WHITE);
        clc.setSelectedPerspective(perspectiveComboBox);
        perspectiveComboBox.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                try {
                    clc.loadPerspective((String) Objects.requireNonNull(perspectiveComboBox.getSelectedItem()));
                } catch (final UnknownPerspectiveStringException ex) {
                    ex.printStackTrace();
                }
            }
        });
        bottomBar.add(perspectiveComboBox);
        hideShowTransitionsButton = new JButton(clc.getHideShowTransitionsText());
        hideShowTransitionsButton.setBounds((4 * miniSpacer) + placeComboBoxWidth + (2 * optionComboBoxWidth), miniSpacer,
                hideShowTransitionsButtonWidth, buttonBarElementHeight);
        hideShowTransitionsButton.setBackground(Color.WHITE);
        hideShowTransitionsButton.addActionListener(this::buttonHideShowTransitionsPerformed);
        bottomBar.add(hideShowTransitionsButton);
        zoomButton = new JButton("Zoom");
        zoomButton.setBounds((5 * miniSpacer) + placeComboBoxWidth + (2 * optionComboBoxWidth) + hideShowTransitionsButtonWidth, miniSpacer,
                zoomButtonWidth, buttonBarElementHeight);
        zoomButton.setBackground(Color.WHITE);
        clc.hideShowZoomButton();
        zoomButton.addActionListener(this::buttonZoomPerformed);
        bottomBar.add(zoomButton);
        cp.add(bottomBar);
        layeredPane = new JLayeredPane();
        layeredPane.add(mapLabel, JLayeredPane.DEFAULT_LAYER);
        layeredPane.setBounds(0, 0, mapWidth, mapHeight);
        clc.drawTransitionBoxes();
        cp.add(layeredPane);
        setSize(frameWidth, frameHeight);
        setResizable(false);
    }

    private int calcFrameHeight() {
        return tileBarLAFSpacer + mapHeight + buttonBarHeight + footerLAFSpacer;
    }

    private int calcFrameWidthByBar() {
        int sum = leftLAFSpacer + (5 * miniSpacer) + placeComboBoxWidth + (2 * optionComboBoxWidth) + hideShowTransitionsButtonWidth + rightLAFSpacer;
        if (clc.getZoomable()) {
            sum += zoomButtonWidth;
            sum += miniSpacer;
        }
        return sum;
    }

    private int calcFrameWidthByMap() {
        return leftLAFSpacer + mapWidth + rightLAFSpacer;
    }

    public void reInit() {
        setTitle("OoT Maps: " + clc.getExitMap().getName());
        clc.hideTransitionBoxes();
        mapWidth = clc.getMapWidth();
        mapHeight = clc.getMapHeight();
        frameWidthByMap = calcFrameWidthByMap();
        frameWidthByBar = calcFrameWidthByBar();
        frameWidth = Math.max(frameWidthByMap, frameWidthByBar);
        frameHeight = calcFrameHeight();
        mapLabel.setIcon(clc.getMapImage());
        mapLabel.setBounds(0, 0, mapWidth, mapHeight);
        layeredPane.setBounds(0, 0, mapWidth, mapHeight);
        bottomBar.setBounds(0, mapHeight, frameWidth, buttonBarHeight);
        mapsComboBox.setBounds(miniSpacer, miniSpacer, placeComboBoxWidth, buttonBarElementHeight);
        mapsComboBox.setSelectedItem(clc.getExitMap().getName());
        ageComboBox.setBounds((2 * miniSpacer) + placeComboBoxWidth, miniSpacer, optionComboBoxWidth, buttonBarElementHeight);
        perspectiveComboBox.setBounds((3 * miniSpacer) + placeComboBoxWidth + optionComboBoxWidth, miniSpacer,
                optionComboBoxWidth, buttonBarElementHeight);
        hideShowTransitionsButton.setBounds((4 * miniSpacer) + placeComboBoxWidth + (2 * optionComboBoxWidth), miniSpacer,
                hideShowTransitionsButtonWidth, buttonBarElementHeight);
        hideShowTransitionsButton.setText(clc.getHideShowTransitionsText());
        zoomButton.setBounds((5 * miniSpacer) + placeComboBoxWidth + (2 * optionComboBoxWidth) + hideShowTransitionsButtonWidth,
                miniSpacer, zoomButtonWidth, buttonBarElementHeight);
        clc.hideShowZoomButton();
        clc.drawTransitionBoxes();
        setSize(frameWidth, frameHeight);
    }

    public JLayeredPane getTransitionLayeredPane() {
        return layeredPane;
    }

    public JButton getHideShowTransitionsButton() {
        return hideShowTransitionsButton;
    }

    private void buttonHideShowTransitionsPerformed(final ActionEvent actionEvent) {
        clc.buttonHideShow();
    }

    private void buttonZoomPerformed(final ActionEvent actionEvent) {
        clc.buttonZoom();
    }

    public JButton getZoomButton() {
        return zoomButton;
    }
}
