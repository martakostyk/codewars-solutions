package com.codewars.kata;

public class RoboticTattooRemoval {
    public static String[][] robot(String[][] skinScan) {
        for (String[] array : skinScan) {
            for (int i=0; i<array.length; i++) {
                if (array[i].equals("X")) {
                    array[i] = "*";
                }
            }
        }
        return skinScan;
    }
}
