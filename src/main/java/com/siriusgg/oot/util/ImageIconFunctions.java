package com.siriusgg.oot.model.util;

import javax.swing.*;
import java.awt.*;

public class ImageIconFunctions {
    /**
     * Returns an ImageIcon with size scaled down to [maxPercentage]% of screen size if it is bigger otherwise.
     * Returns the original ImageIcon if no downscaling is needed.
     *
     * @param ii            any image.
     * @param maxPercentage the max percentage the image may have in relation to the screen size after downscaling.
     * @return a downscaled ImageIcon.
     */
    public static ImageIcon limitSize(final ImageIcon ii, final double maxPercentage) {
        double origWidth = ii.getIconWidth();
        double origHeight = ii.getIconHeight();
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[0];
        Rectangle r = gd.getDefaultConfiguration().getBounds();
        double screenWidth = r.getWidth();
        double screenHeight = r.getHeight();
        double percentageFactor = maxPercentage / 100;
        double widthLimit = screenWidth * percentageFactor;
        double heightLimit = screenHeight * percentageFactor;
        double widthScale = widthLimit / origWidth;
        double heightScale = heightLimit / origHeight;
        double scale = Math.min(widthScale, heightScale);
        double newWidth = origWidth * scale;
        double newHeight = origHeight * scale;
        return new ImageIcon(ii.getImage().getScaledInstance((int) newWidth, (int) newHeight, Image.SCALE_SMOOTH));
    }
}
