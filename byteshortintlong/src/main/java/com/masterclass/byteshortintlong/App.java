package com.masterclass.byteshortintlong;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;
        System.out.println("max int: " + maxValue);
        System.out.println("min int: " + minValue);

        byte maxByteValue = Byte.MAX_VALUE;
        byte minByteValue = Byte.MIN_VALUE;
        System.out.println("max byte: " + maxByteValue);
        System.out.println("min byte: " + minByteValue);

        short maxShortValue = Short.MAX_VALUE;
        short minShortValue = Short.MIN_VALUE;
        System.out.println("max short: " + maxShortValue);
        System.out.println("min short: " + minShortValue);

        long maxLongValue = Long.MAX_VALUE;
        long minLongValue = Long.MIN_VALUE;
        System.out.println("max long: " + maxLongValue);
        System.out.println("min long: " + minLongValue);

        byte casted = (byte) (maxByteValue / 2);
        System.out.println("Casted byte: " + casted);
    }
}
