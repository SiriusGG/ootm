package com.siriusgg.oot.model.util;

import com.siriusgg.oot.components.DeletableJLabel;
import com.siriusgg.oot.exception.UnknownExitTypeException;
import com.siriusgg.oot.exception.UnknownTransitionGraphicException;
import com.siriusgg.oot.model.places.ExitType;
import com.siriusgg.oot.model.places.TransitionGraphic;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Objects;

@SuppressWarnings("unused")
public class DevTools {
    private static DevTools devTools = null;

    @SuppressWarnings("FieldCanBeLocal")
    private final DecimalFormat df;

    private DevTools() {
        df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.HALF_UP);
        DecimalFormatSymbols decimalPoint = new DecimalFormatSymbols(Locale.getDefault());
        decimalPoint.setDecimalSeparator('.');
        df.setDecimalFormatSymbols(decimalPoint);
    }

    public static DevTools getInstance() {
        if (devTools == null) devTools = new DevTools();
        return devTools;
    }

    public void addDraggable(final DeletableJLabel label, final Dimension dimension) {
        label.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(final MouseEvent evt) {
                Container c = label.getParent();
                Point mouseLocation = MouseInfo.getPointerInfo().getLocation();
                int x = (int)(mouseLocation.getX() - c.getLocationOnScreen().getX());
                int y = (int)(mouseLocation.getY() - c.getLocationOnScreen().getY());
                label.setLocation(x, y);
                double pX = MathFunctions.calculatePercentage(x, dimension.getWidth());
                double pY = MathFunctions.calculatePercentage(y, dimension.getHeight());
                System.out.println("Percentages: " + df.format(pX) + ", " + df.format(pY));
            }
        });
    }

    public void setLabelImage(final DeletableJLabel label, final ExitType exitType, final int width, final int height) throws UnknownExitTypeException {
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
            Image newImage = oldImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            label.setIcon(new ImageIcon(newImage));
        }
    }
}
