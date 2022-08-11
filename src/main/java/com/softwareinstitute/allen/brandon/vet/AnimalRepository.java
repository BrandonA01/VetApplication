package com.softwareinstitute.allen.brandon.vet;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

public class AnimalRepository {

    private List<Animal> animalList = new ArrayList<>();

    public List<Animal> getAll() {
        return animalList;
    }

    public void add() {
        animalList.clear();
        this.animalList.add(new Cat(true, 4, "Nala", "Black"));
        this.animalList.add(new Cat(true, 3, "Bruce", "Black and White"));
        this.animalList.add(new Cat(true, 2, "Tibbles", "Multicoloured"));
        this.animalList.add(new Cat(true, 1, "Tom", "Ginger"));
    }

    public String toString(AnimalRepository repo){
        return new Gson().toJson(repo.getAll());
    }
}