package com.softwareinstitute.allen.brandon.vet;

public abstract class Bird extends Animal {

    protected Bird(boolean alive, int age, String colour, int hp) {
        super(alive, age, colour, hp);
    }
    protected Bird(boolean alive, int age, String colour) {
        super(alive, age, colour);
    }
    protected Bird(boolean alive, String colour) {
        super(alive, colour);
    }

    public String breathe(){
        return "Breathing...";
    }

    public abstract String eat();
}