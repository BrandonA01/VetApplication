package com.softwareinstitute.allen.brandon.vet;

public final class Bat extends Mammal{

    private int insects_eaten;

    public Bat(boolean alive, int age, String colour, int HP) {
        super(alive, age, colour, HP);
    }
    public Bat(boolean alive, int age, String colour) {
        super(alive, age, colour);
    }
    public Bat(boolean alive, String colour) {
        super(alive, colour);
    }

    public String eat() {
        insects_eaten++;
        return "Eats insect";
    }


    public int getInsects_eaten() {
        return insects_eaten;
    }

    public void setInsects_eaten(int insects_eaten) {
        this.insects_eaten = insects_eaten;
    }

    public String takeOff() {
        return "Taking Off";
    }

    public String flying() {
        return "Flapping Continuously";
    }

    public String land() {
        return "Landed";
    }
}