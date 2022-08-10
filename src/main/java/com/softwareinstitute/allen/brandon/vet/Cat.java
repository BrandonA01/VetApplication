package com.softwareinstitute.allen.brandon.vet;

public final class Cat extends Mammal{

    private String name;

    public Cat(boolean alive, int age, String name, String colour, int HP) {
        super(alive, age, colour, HP);
        this.name = name;
    }
    public Cat(boolean alive, int age, String name, String colour) {
        super(alive, age, colour);
        this.name = name;
    }
    public Cat(boolean alive, String name, String colour) {
        super(alive, colour);
        this.name = name;
    }
    public Cat(boolean alive, String colour) {
        super(alive, colour);
    }

    public Cat(boolean alive, int age) {
        super(alive, age);
    }

    public String eat() {
        return "Shears off chunks of meat";
    }

    /*@Override
    public ArrayList<Animal> breed(Animal animal) {
        ArrayList<Animal> kittens = new ArrayList<>();
        try{
            int min = (int) Math.ceil(1);
            int max = (int) Math.floor(8);
            String[] colours = {"Black", "White", "Ginger", "Multicoloured"};
            for(int i = 0; i < Math.random() * (max - min + 1) + min; i++){
                //Cat kitten = new Cat(true, colours[(int) (Math.random() * ((colours.length)))]);
                System.out.println(animal.getClass());
                System.out.println(animal.getClass().getDeclaredConstructor());
                Animal kitten = animal.getClass().getDeclaredConstructor().newInstance();
                kittens.add(kitten);
            }
            return kittens;
        }
        catch(Exception e){
            System.out.println("Incompatible types");
        }

        return kittens;
        return null;
    }*/


    public Animal attack(Animal animal){
        animal.setHP(animal.getHP()-10);
        return animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
