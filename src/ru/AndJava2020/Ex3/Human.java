package ru.AndJava2020.Ex3;

public class Human {
    private Hand rhand;
    private Hand lhand;
    private Leg lleg;
    private Leg rleg;
    private Head head;

    public Human() {
        rhand=new Hand();
        lhand=new Hand();
        lleg=new Leg();
        rleg=new Leg();
        head=new Head();
    }

    @Override
    public String toString() {
        return "Human{" +
                "rhand=" + rhand +
                ", lhand=" + lhand +
                ", lleg=" + lleg +
                ", rleg=" + rleg +
                ", head=" + head +
                '}';
    }
}
