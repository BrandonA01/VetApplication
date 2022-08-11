package com.softwareinstitute.allen.brandon.vet;

import java.util.logging.Logger;

import static java.util.logging.Level.INFO;

public abstract class Animal {

    private boolean alive;
    private int age;
    private String colour;
    private int hp;
    private int kills;
    private boolean hungry;

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Animal.class));
    private static final String SLEEP = "Sleeping";
    private static final String POOP = "Pooping";

    protected Animal(boolean alive, int age, String colour, int hp){
        this.alive = alive;
        this.age = age;
        this.colour = colour;
        this.hp = hp;
    }

    protected Animal(boolean alive, int age, String colour){
        this.alive = alive;
        this.age = age;
        this.colour = colour;
    }

    protected Animal(boolean alive, String colour){
        this.alive = alive;
        this.colour = colour;
    }
    protected Animal(boolean alive, int age) {
        this.alive = alive;
        this.age = age;
    }

    public abstract String eat();

    public String move(){
        if(this.alive){
            return "Moving";
        }
        else{
            return "Not Moving";
        }
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public abstract String breathe();

    public String sleep(){
        return SLEEP;
    }

    public String poop(){
        return POOP;
    }

    public Animal breed(Animal partner){
        if(this.getClass().equals(partner.getClass())){
            Animal babyAnimal;
            try {
                Class[] cArg = new Class[2]; //Our constructor has 3 arguments
                cArg[0] = boolean.class;
                cArg[1] = int.class;
                babyAnimal = this.getClass().getDeclaredConstructor(cArg).newInstance(true, 0);
                return babyAnimal;
            }
            catch(Exception e){
                LOGGER.log(INFO,"Incompatible types of animals");
                return null;
            }
        }
        else{
            return null;
        }
    }

    public void die(){
        alive = false;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getHP() {
        return hp;
    }

    public void setHP(int hp) {
        this.hp = hp;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public Animal kill(Animal animal) {
        animal.die();
        kills++;
        return animal;
    }
}
