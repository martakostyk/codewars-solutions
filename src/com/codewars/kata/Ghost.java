package com.codewars.kata;

import java.util.Random;

public class Ghost {

    private String color;

    public String getColor() {
        return color;
    }

    public Ghost() {
        color = getRandomColor();
    }

    public static String getRandomColor() {
        String[] colors = new String[] {"white", "yellow", "purple", "red"};
        return colors[new Random().nextInt(colors.length-1)];
    }
}