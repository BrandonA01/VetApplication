package com.softwareinstitute.allen.brandon.vet;

public abstract class Bird extends Animal {

    public Bird(boolean alive, int age, String colour, int HP) {
        super(alive, age, colour, HP);
    }
    public Bird(boolean alive, int age, String colour) {
        super(alive, age, colour);
    }
    public Bird(boolean alive, String colour) {
        super(alive, colour);
    }

    public String breathe(){
        return "Breathing...";
    }

    public abstract String eat();
}