package com.softwareinstitute.allen.brandon.vet;

public abstract class Mammal extends Animal{

    protected Mammal(boolean alive, int age, String colour, int hp) {
        super(alive, age, colour, hp);
    }
    protected Mammal(boolean alive, int age, String colour) {
        super(alive, age, colour);
    }
    protected Mammal(boolean alive, String colour) {
        super(alive, colour);
    }
    protected Mammal(boolean alive, int age) {
        super(alive, age);
    }

    public String breathe(){
        return "Breathing...";
    }

}
