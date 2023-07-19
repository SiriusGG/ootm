package com.siriusgg.oot.util;

import javax.swing.*;

public class LAFHandler {
    public static void setLAF() {
        String laf = "javax.swing.plaf.metal.MetalLookAndFeel";
        try {
            UIManager.setLookAndFeel(laf);
        } catch (final ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e1) {
            System.err.println("Could not find requested LAF: " + laf);
            String backupLAF = UIManager.getLookAndFeel().getClass().toString();
            String[] backupLAFParts = backupLAF.split("class ");
            try {
                System.err.println("Using backup LAF: " + backupLAFParts[1]);
            } catch (final ArrayIndexOutOfBoundsException e2) {
                System.err.println("Using backup LAF: " + backupLAF);
            }
        }
    }
}
