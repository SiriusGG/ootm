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
    private int buttonBarHeight;
    private int comboBoxHeight;
    private int miniSpacer;
    private int frameWidth;
    private int frameHeight;

    private JLabel mapLabel;
    private JPanel bottomBar;
    private JComboBox<String> mapsComboBox;
    private JComboBox<String> ageComboBox;
    private JComboBox<String> perspectiveComboBox;
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
        placeComboBoxWidth = 250;
        optionComboBoxWidth = 100;
        buttonBarHeight = 50;
        comboBoxHeight = 40;
        miniSpacer = 5;
        frameWidth = leftLAFSpacer + mapWidth + rightLAFSpacer;
        frameHeight = tileBarLAFSpacer + mapHeight + buttonBarHeight + footerLAFSpacer;
        mapLabel = new JLabel(clc.getMapImage());
        mapLabel.setBounds(0, 0, mapWidth, mapHeight);
        bottomBar = new JPanel();
        bottomBar.setLayout(null);
        bottomBar.setBounds(0, mapHeight, frameWidth, buttonBarHeight);
        bottomBar.setBackground(Color.GRAY);
        mapsComboBox = new JComboBox<>();
        clc.fillMapsComboBox(mapsComboBox);
        mapsComboBox.setBounds(miniSpacer, miniSpacer, placeComboBoxWidth, comboBoxHeight);
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
        ageComboBox.setBounds((2 * miniSpacer) + placeComboBoxWidth, miniSpacer, optionComboBoxWidth, comboBoxHeight);
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
                optionComboBoxWidth, comboBoxHeight);
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
        cp.add(bottomBar);
        layeredPane = new JLayeredPane();
        layeredPane.add(mapLabel, JLayeredPane.DEFAULT_LAYER);
        layeredPane.setBounds(0, 0, mapWidth, mapHeight);
        clc.drawTransitionBoxes();
        cp.add(layeredPane);
        setSize(frameWidth, frameHeight);
        setResizable(false);
    }

    public void reInit() {
        setTitle("OoT Maps: " + clc.getExitMap().getName());
        clc.hideTransitionBoxes();
        mapWidth = clc.getMapWidth();
        mapHeight = clc.getMapHeight();
        frameWidth = leftLAFSpacer + mapWidth + rightLAFSpacer;
        frameHeight = tileBarLAFSpacer + mapHeight + buttonBarHeight + footerLAFSpacer;
        mapLabel.setIcon(clc.getMapImage());
        mapLabel.setBounds(0, 0, mapWidth, mapHeight);
        layeredPane.setBounds(0, 0, mapWidth, mapHeight);
        bottomBar.setBounds(0, mapHeight, frameWidth, buttonBarHeight);
        mapsComboBox.setBounds(miniSpacer, miniSpacer, placeComboBoxWidth, comboBoxHeight);
        ageComboBox.setBounds((2 * miniSpacer) + placeComboBoxWidth, miniSpacer, optionComboBoxWidth, comboBoxHeight);
        perspectiveComboBox.setBounds((3 * miniSpacer) + placeComboBoxWidth + optionComboBoxWidth, miniSpacer,
                optionComboBoxWidth, comboBoxHeight);
        clc.drawTransitionBoxes();
        setSize(frameWidth, frameHeight);
    }

    public JLayeredPane getTransitionLayeredPane() {
        return layeredPane;
    }
}
