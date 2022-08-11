package com.softwareinstitute.allen.brandon.vet;

public final class FlyingRat extends Bird implements Flying{

    private int pastiesEaten;
    private static final String TAKINGOFF = "Flapping";
    private static final String FLYING = "Gliding";
    private static final String LANDED = "Landed";

    public FlyingRat(boolean alive, int age, String colour, int HP) {
        super(alive, age, colour, HP);
    }
    public FlyingRat(boolean alive, int age, String colour) {
        super(alive, age, colour);
    }
    public FlyingRat(boolean alive, String colour) {
        super(alive, colour);
    }

    public String eat() {
        pastiesEaten++;
        return "Pecks at Greggs Pasty";
    }
    public int getPastiesEaten() {
        return pastiesEaten;
    }

    public void setPastiesEaten(int pasties_eaten) {
        this.pastiesEaten = pasties_eaten;
    }

    public String takeOff() {
        return TAKINGOFF;
    }

    public String flying() {
        return FLYING;
    }

    public String land() {
        return LANDED;
    }
}
