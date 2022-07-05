package com.siriusgg.oot.model.util;

import javax.swing.*;
import java.awt.*;

public class ScaleDemo {

    /**
     * Returns an ImageIcon with size scaled down to [maxPercentage]% of screen size if it is bigger otherwise.
     * Returns the original ImageIcon if no downscaling is needed.
     *
     * @param ii any image.
     * @param maxPercentage the max percentage the image may have in relation to the screen size after downscaling.
     * @return a downscaled ImageIcon.
     */
    public static ImageIcon limitSize(final ImageIcon ii, final double maxPercentage) {
        double origWidth = ii.getIconWidth();
        double origHeight = ii.getIconHeight();
        double imageRatio = origWidth / origHeight;
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        double screenWidth = d.getWidth();
        double screenHeight = d.getHeight();
        double percentageFactor = maxPercentage / 100;
        double widthLimit = screenWidth * percentageFactor;
        double heightLimit = screenHeight * percentageFactor;
        double newWidth = -1.0;
        double newHeight = -1.0;
        // ToDo start OMG SO MUCH MORE TO DO EVEN THOUGH THERE IS CODE IN HERE!!!
        if (origWidth > widthLimit || origHeight > heightLimit) {
            if (origWidth > widthLimit && origHeight <= widthLimit) {
                newWidth = widthLimit;
                newHeight = newWidth * imageRatio; // ToDo: Check and probably fix
            } else if (origWidth <= widthLimit && origHeight > widthLimit) {
                newHeight = heightLimit;
                newWidth = newHeight * imageRatio; // ToDo: Check
            } else {
                // ToDo: Fix distortion.
                newWidth = widthLimit;
                newHeight = heightLimit;
            }
        }
        // ToDo end
        return new ImageIcon(ii.getImage().getScaledInstance((int)newWidth, (int)newHeight, Image.SCALE_SMOOTH));
    }
}
