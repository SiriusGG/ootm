package com.siriusgg.oot.model.util;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class JLabelFunctions {
    /**
     * Draws a grid over the icon contained in any JLabel.
     * Requires the specified JLabel to contain an icon, otherwise nothing happens.
     * Works best with values for cols and rows which are divisors of 100 (1, 2, 4, 5, 10, 20, 25, 50, 100).
     *
     * @param label any label which contains an icon.
     * @param cols amount of columns.
     * @param rows amount of rows.
     * @param font any font.
     * @param labelAxes whether to draw values next to the lines.
     */
    @SuppressWarnings("unused")
    public static void drawGrid(final JLabel label, final int cols, final int rows, final Font font, final boolean labelAxes) {
        if (label.getIcon() != null) {
            ImageIcon imageIcon = (ImageIcon) label.getIcon();
            int width = imageIcon.getIconWidth();
            int height = imageIcon.getIconHeight();
            BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2d = bufferedImage.createGraphics();
            g2d.setColor(Color.GREEN);
            BasicStroke bs = new BasicStroke(1);
            g2d.setStroke(bs);
            g2d.setFont(font);
            imageIcon.paintIcon(label, g2d, 0, 0);
            double x1;
            double y1;
            double x2 = width;
            double y2;
            double max = 100.0;
            double elementPercentage = max / cols;
            double elementHeight = (double) height / rows;
            double elementWidth = (double) width / cols;
            double counter = max / cols;
            for (int i = 1; i < rows; i++) {
                y1 = elementHeight * i;
                y2 = y1;
                g2d.drawLine(0, (int) y1, (int) x2, (int) y2);
                if (labelAxes) g2d.drawString("" + ((int) counter), 4, 19 + (int) y1);
                counter += elementPercentage;
            }
            y2 = height;
            counter = elementPercentage;
            for (int i = 1; i < cols; i++) {
                x1 = elementWidth * i;
                x2 = x1;
                g2d.drawLine((int) x1, 0, (int) x2, (int) y2);
                if (labelAxes) g2d.drawString("" + ((int) counter), (int) (5 + x1), 20);
                counter += elementPercentage;
            }
            g2d.dispose();
            label.setIcon(new ImageIcon(bufferedImage));
        }
    }
}

