package com.softwareinstitute.allen.brandon.vet;

public abstract class Mammal extends Animal{

    public Mammal(boolean alive, int age, String colour, int HP) {
        super(alive, age, colour, HP);
    }
    public Mammal(boolean alive, int age, String colour) {
        super(alive, age, colour);
    }
    public Mammal(boolean alive, String colour) {
        super(alive, colour);
    }
    public Mammal(boolean alive, int age) {
        super(alive, age);
    }

    public String breathe(){
        return "Breathing...";
    }

}
