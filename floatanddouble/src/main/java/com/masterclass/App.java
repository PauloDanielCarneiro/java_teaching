package com.masterclass;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        float maxValue = Float.MAX_VALUE;
        float minValue = Float.MIN_VALUE;
        System.out.println("max float: " + maxValue);
        System.out.println("min float: " + minValue);

        double maxDoubleValue = Double.MAX_VALUE;
        double minDoubleValue = Double.MIN_VALUE;
        System.out.println("max double: " + maxDoubleValue);
        System.out.println("min double: " + minDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3;
        double myDoubleValue = 5d / 3;
        System.out.println("int value: " + myIntValue);
        System.out.println("float value: " + myFloatValue);
        System.out.println("double value: " + myDoubleValue);

        System.out.println("5 pounds in kilos: " + toKilograms(getPounds()));
    }

    public static double getPounds() {
        double pounds = 5d;
        return pounds;
    }

    public static double toKilograms(double pounds) {
        return pounds * 0.45359237;
    }
}
