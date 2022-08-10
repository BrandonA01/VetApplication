package com.softwareinstitute.allen.brandon.vet;

public final class FlyingRat extends Bird implements Flying{

    public int getPasties_eaten() {
        return pasties_eaten;
    }

    public void setPasties_eaten(int pasties_eaten) {
        this.pasties_eaten = pasties_eaten;
    }

    private int pasties_eaten;

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
        pasties_eaten++;
        return "Pecks at Greggs Pasty";
    }

    public String takeOff() {
        return "Flapping";
    }

    public String flying() {
        return "Gliding";
    }

    public String land() {
        return "Landed";
    }
}
