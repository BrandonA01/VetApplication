package com.softwareinstitute.allen.brandon.vet;

import java.io.InputStream;

public final class Penguin extends Bird{

    public Penguin(boolean alive, int age, String colour, int hp) {
        super(alive, age, colour, hp);
    }
    public Penguin(boolean alive, int age, String colour) {
        super(alive, age, colour);
    }
    public Penguin(boolean alive, String colour) {
        super(alive, colour);
    }

    @Override
    public String eat() {
        return "Swallows food whole";
    }
}