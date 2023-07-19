package com.siriusgg.oot.util;

public class MathFunctions {
    public static boolean isInRange(double value1, double value2, double range) {
        double difference = Math.abs(value1 - value2);
        return range <= difference;
    }

    public static double calculatePercentage(final double value, final double max) {
        return value / (max / 100);
    }

    public static boolean isEven(final int number) {
        return (number & 1) == 0;
    }
}
