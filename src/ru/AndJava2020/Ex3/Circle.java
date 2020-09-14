package ru.AndJava2020.Ex3;

public class Circle {
    private int rad;
    private int center;

    public Circle(int rad, int center) {
        this.rad = rad;
        this.center = center;
    }

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }

    public int getCenter() {
        return center;
    }

    public void setCenter(int center) {
        this.center = center;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "rad=" + rad +
                ", center=" + center +
                '}';
    }
}
