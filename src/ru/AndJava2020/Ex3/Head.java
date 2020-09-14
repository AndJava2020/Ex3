package ru.AndJava2020.Ex3;

public class Head{
    private int length;
    private int wide;
    private int height;
    private boolean brain;


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

    public boolean isBrain() {
        return brain;
    }

    public void setBrain(boolean brain) {
        this.brain = brain;
    }

    @Override
    public String toString() {
        return "Head{" +
                "length=" + length +
                ", wide=" + wide +
                ", height=" + height +
                ", brain=" + brain +
                '}';
    }

}
