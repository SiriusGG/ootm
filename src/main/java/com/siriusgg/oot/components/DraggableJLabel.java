package com.siriusgg.oot.components;

import com.siriusgg.oot.model.util.MathFunctions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.math.RoundingMode;
import java.text.*;
import java.util.Locale;

@SuppressWarnings("unused")
public class DraggableJLabel extends JLabel {
    private final DecimalFormat df;

    public DraggableJLabel() {
        super();
        df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.HALF_UP);
        DecimalFormatSymbols decimalPoint = new DecimalFormatSymbols(Locale.getDefault());
        decimalPoint.setDecimalSeparator('.');
        df.setDecimalFormatSymbols(decimalPoint);
    }

    public void setDraggableArea(final Dimension dimension) {
        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(final MouseEvent evt) {
                Container c = getParent();
                Point mouseLocation = MouseInfo.getPointerInfo().getLocation();
                int x = (int) (mouseLocation.getX() - c.getLocationOnScreen().getX());
                int y = (int) (mouseLocation.getY() - c.getLocationOnScreen().getY());
                setLocation(x, y);
                double pX = MathFunctions.calculatePercentage(x, dimension.getWidth());
                double pY = MathFunctions.calculatePercentage(y, dimension.getHeight());
                System.out.println("Percentages: " + df.format(pX) + ", " + df.format(pY));
            }
        });
    }
}
