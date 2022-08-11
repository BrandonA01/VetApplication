package com.softwareinstitute.allen.brandon.vet;

public final class Bat extends Mammal{

    private static final String TAKINGOFF = "Taking Off";
    private static final String FLYING = "Flapping Continuously";
    private static final String LANDED = "Landed";
    private int insectsEaten;

    public Bat(boolean alive, int age, String colour, int hp) {
        super(alive, age, colour, hp);
    }
    public Bat(boolean alive, int age, String colour) {
        super(alive, age, colour);
    }
    public Bat(boolean alive, String colour) {
        super(alive, colour);
    }

    public String eat() {
        insectsEaten++;
        return "Eats insect";
    }


    public int getInsectsEaten() {
        return insectsEaten;
    }

    public void setInsectsEaten(int insectsEaten) {
        this.insectsEaten = insectsEaten;
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