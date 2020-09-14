package ru.AndJava2020.Ex3;

public class Hand {
    private int length;
    private int wide;
    private int height;


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWide() {
        return wide;
    }

    public void setWide(int wide) {
        this.wide = wide;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "length=" + length +
                ", wide=" + wide +
                ", height=" + height +
                '}';
    }
}
