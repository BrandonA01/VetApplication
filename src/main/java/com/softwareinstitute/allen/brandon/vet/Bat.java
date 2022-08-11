package com.softwareinstitute.allen.brandon.vet;

public final class Bat extends Mammal{

    private int insectsEaten;

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
        insectsEaten++;
        return "Eats insect";
    }


    public int getInsects_eaten() {
        return insectsEaten;
    }

    public void setInsects_eaten(int insectsEaten) {
        this.insectsEaten = insectsEaten;
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