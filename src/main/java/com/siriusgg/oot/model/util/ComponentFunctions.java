package com.siriusgg.oot.model.util;

import java.awt.*;
import java.util.*;

/**
 * Supplies functions for {@code java.awt.Component}s.
 */
public class ComponentFunctions {

    /**
     * Centers a {@code java.awt.Component} to the center of the screen.
     *
     * @param c any object of type Component.
     */
    public static void center(final Component c) {
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - c.getSize().width) / 2;
        int y = (d.height - c.getSize().height) / 2;
        c.setLocation(x, y);
    }

    public static ArrayList<Component> toComponentArrayList(final Component[] components) {
        return new ArrayList<>(Arrays.asList(components));
    }
}
