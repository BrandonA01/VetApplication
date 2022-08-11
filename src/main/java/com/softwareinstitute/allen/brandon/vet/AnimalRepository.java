package com.softwareinstitute.allen.brandon.vet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnimalRepository {

    private List<Animal> animalList = Collections.synchronizedList(new ArrayList<Animal>());

    public Iterable<Animal> getAll() {
        return animalList;
    }

    public Animal add() {
        animalList.clear();
        Animal animal = new Cat(true, 4, "Nala", "Black");
        Animal animal1 = new Cat(true, 3, "Bruce", "Black and White");
        Animal animal2 = new Cat(true, 2, "Tibbles", "Multicoloured");
        Animal animal3 = new Cat(true, 1, "Tom", "Ginger");
        this.animalList.add(animal);
        this.animalList.add(animal1);
        this.animalList.add(animal2);
        this.animalList.add(animal3);
        return animal;
    }
}