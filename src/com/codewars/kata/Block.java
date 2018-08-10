package com.codewars.kata;

public class Block {

    private int width;
    private int length;
    private int height;

    public int getWidth() { return width; }

    public int getLength() { return length; }

    public int getHeight() { return height; }

    public Block(int[] parameters) {
        width = parameters[0];
        length = parameters[1];
        height = parameters[2];
    }

    public int getVolume() {
        return getWidth()*getLength()*getHeight();
    }

    public int getSurfaceArea() {
        return 2*(getWidth()*getLength() + getWidth()*getHeight() + getHeight()*getLength());
    }
}
