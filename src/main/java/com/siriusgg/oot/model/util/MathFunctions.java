package com.siriusgg.oot.model.util;

public class MathFunctions {
    public static boolean isInRange(double value1, double value2, double range) {
        double difference = Math.abs(value1 - value2);
        return range <= difference;
    }
}
